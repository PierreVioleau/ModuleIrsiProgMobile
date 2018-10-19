package edu.eigsi.irsi.tp4_1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng eigsi = new LatLng(46.140013, -1.154401);
        mMap.addMarker(new MarkerOptions().position(eigsi).title("ICI ICI C'EST LA ROCHELLE !!!"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(eigsi));
        LatLng chambre = new LatLng(46.1323148,-1.0160268); //46.1323148,-1.0160268,478
        mMap.addMarker(new MarkerOptions().position(chambre).title("C'est ma chambre!!!"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chambre,17));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/
        if (id == R.id.action_satellite){
            return true;
        }

        if (id == R.id.action_terrain){
            /*FragmentManager myFragmentManager = getSupportFragmentManager();
            SupportMapFragment mySupportMapFragment
                    = (SupportMapFragment)myFragmentManager.findFragmentById(R.id.map);
            myMap = mySupportMapFragment.getMap();

            myMap.setMyLocationEnabled(true);

            //myMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            //myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            //myMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            myMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);*/
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
