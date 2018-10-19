package edu.eigsi.irsi.tp3_euro_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnKeyListener;
import android.view.View.OnFocusChangeListener;

public class MainActivity extends AppCompatActivity implements OnFocusChangeListener {


    private EditText textEuro;
    private EditText textDollar;
    private EditText textTaux;
    private double dTaux = 1.17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEuro = findViewById(R.id.editTextEuro);
        textDollar = findViewById(R.id.editTextDollar);
        textTaux = findViewById(R.id.editTextTaux);
        textTaux.setText(Double.toString(dTaux));

        textTaux.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                String sTaux = textTaux.getText().toString();
                if (sTaux.length() != 0) {
                    dTaux = Double.parseDouble(sTaux.replace(',','.'));
                }
                return false;
            }
        });

        textEuro.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                String sEuro = textEuro.getText().toString();
                String sTaux = textTaux.getText().toString();
                if (sEuro.length() != 0 & sTaux.length() != 0) {
                    double dDollar = Double.parseDouble(sEuro.replace(',','.'))*dTaux;
                    //textDollar.setText(new Double(dDollar).toString());
                    textDollar.setText(String.format("%.2f",dDollar));
                }
                return false;
            }
        });
        textEuro.setOnFocusChangeListener(this);


        textDollar.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                String sDollar = textDollar.getText().toString();
                if (sDollar.length() > 0) {
                    double dEuro = Double.parseDouble(sDollar.replace(',','.'))/dTaux;
                    //textEuro.setText(new Double(dEuro).toString());
                    textEuro.setText(String.format("%.2f",dEuro));
                }
                return false;
            }
        });
        textDollar.setOnFocusChangeListener(this);

    }

    @Override
    public void onFocusChange(View view, boolean b) {
        textEuro.setText("");
        textDollar.setText("");
    }
}
