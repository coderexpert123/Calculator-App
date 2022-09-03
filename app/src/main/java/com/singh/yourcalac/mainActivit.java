package com.singh.yourcalac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class mainActivit extends AppCompatActivity {
Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndot,btnmodule,btnplus,
        btnminus,btnmul , btnequal,btnac;
TextView input,output;
String data;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Calculator");
    btn0=findViewById(R.id.zero);
    btn1=findViewById(R.id.one);
    btn2=findViewById(R.id.two);
    btn3=findViewById(R.id.three);
    btn4=findViewById(R.id.four);
    btn5=findViewById(R.id.five);
    btn6=findViewById(R.id.six);
    btn7=findViewById(R.id.seven);
    btn8=findViewById(R.id.eight);
    btn9=findViewById(R.id.nine);

    btndot=findViewById(R.id.dot);
    btnplus=findViewById(R.id.add);
    btnminus=findViewById(R.id.minus);
    btnmul=findViewById(R.id.multiply);
    btnmodule=findViewById(R.id.module);
    btnequal=findViewById(R.id.equal);
    btnac=findViewById(R.id.ac);


    input=findViewById(R.id.inputtext);
    output=findViewById(R.id.outputtext);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    data=input.getText().toString();
                    input.setText(data+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"9");
            }
        });


        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input.setText("");
                output.setText("");

            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+".");
            }
        });




        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"+");
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"-");
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"x");
            }
        });

        btnmodule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"%");
            }
        });



        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();


                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("÷","/");

                Context rehnio=Context.enter();
                rehnio.setOptimizationLevel(-1);
                String result="";
                Scriptable scriptable=rehnio.initStandardObjects();
                result=rehnio.evaluateString(scriptable,data,"Javascript",1,null).toString();

                output.setText(result);

            }
        });
    }
}
