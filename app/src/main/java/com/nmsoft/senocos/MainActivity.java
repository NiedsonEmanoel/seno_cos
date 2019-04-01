package com.nmsoft.senocos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calcula (View view) {
        Context contesto = getApplicationContext();
        TextView R1 = findViewById(R.id.textView8);
        TextView R2 = findViewById(R.id.textView14);
        Globals g = Globals.getInstance();
        int Status = g.getData();

        EditText ed1 = findViewById(R.id.editText7);
            Double vl1 = Double.parseDouble(ed1.getText().toString());
        EditText ed2 = findViewById(R.id.editText8);
            Double vl2 = Double.parseDouble(ed2.getText().toString());

            Double calcv = (vl1 / vl2);
            DecimalFormat df = new DecimalFormat("0.##");
            String dx = df.format(calcv);
            R1.setText(dx);

            Double Convt = Math.toDegrees(calcv);
            String rx = df.format(Convt);
            R2.setText(rx+"°");
    }

    public void Mk1 (View view){ //Seno
        RadioButton sen = findViewById(R.id.rb_1);
        RadioButton cos = findViewById(R.id.rb_3);
        RadioButton tag = findViewById(R.id.rb_4);
        TextView subT1 = findViewById(R.id.subText1);
        TextView subT2 = findViewById(R.id.sbt2);
        TextView edi = findViewById(R.id.editText7); TextView edi2 = findViewById(R.id.editText8); edi.setText(""); edi2.setText("");

        cos.setChecked(false);
        tag.setChecked(false);
        subT1.setText("(Cateto Oposto)");
        subT2.setText("                     (Hipotenusa)");
        Globals g = Globals.getInstance();
        g.setData(1); // 1- para Seno -- 2- Para Cosseno -- 3- Para Tangente
    }

    public void Mk2 (View view){ //Cosseno
        RadioButton sen = findViewById(R.id.rb_1);
        RadioButton cos = findViewById(R.id.rb_3);
        RadioButton tag = findViewById(R.id.rb_4);
        TextView subT1 = findViewById(R.id.subText1);
        TextView subT2 = findViewById(R.id.sbt2);
        TextView edi = findViewById(R.id.editText7); TextView edi2 = findViewById(R.id.editText8); edi.setText(""); edi2.setText("");

        sen.setChecked(false);
        tag.setChecked(false);
        subT1.setText("(Cateto Adjacente)");
        subT2.setText("                     (Hipotenusa)");
        Globals g = Globals.getInstance();
        g.setData(2); // 1- para Seno -- 2- Para Cosseno -- 3- Para Tangente
    }

    public void Mk3 (View view){ //Tangente
        RadioButton sen = findViewById(R.id.rb_1);
        RadioButton cos = findViewById(R.id.rb_3);
        RadioButton tag = findViewById(R.id.rb_4);
        TextView subT1 = findViewById(R.id.subText1);
        TextView subT2 = findViewById(R.id.sbt2);
        TextView edi = findViewById(R.id.editText7); TextView edi2 = findViewById(R.id.editText8); edi.setText(""); edi2.setText("");

        cos.setChecked(false);
        sen.setChecked(false);
        subT1.setText("(Cateto Oposto)");
        subT2.setText("                 (Cateto Adjacente)");
        Globals g = Globals.getInstance();
        g.setData(3); // 1- para Seno -- 2- Para Cosseno -- 3- Para Tangente
    }
}
