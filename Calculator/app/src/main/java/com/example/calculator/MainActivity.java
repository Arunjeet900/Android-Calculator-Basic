package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    EditText etFirst,etSecond,etRes;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst=findViewById(R.id.etNum1);
        etSecond=findViewById(R.id.etNum2);
        etRes=findViewById(R.id.etResult);
        rg=findViewById(R.id.radioGroup);

        rg.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(RadioGroup rg, int id)

    {
        double first = 0,second = 0 ;
        if(etFirst.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(),"Enter first value",Toast.LENGTH_LONG).show();
        else
         first= Double.parseDouble(etFirst.getText().toString());

        if(etSecond.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(),"Enter second value",Toast.LENGTH_LONG).show();
        else
            second= Double.parseDouble(etSecond.getText().toString());

         second= Double.parseDouble(etSecond.getText().toString());
        double result = 0;

        switch(id){
            case R.id.rbAdd:
                result= first+second;break;
            case R.id.rbSub:
                result=first-second;break;
            case R.id.rbMul:
                result=first*second;break;
            case R.id.rbDiv:
                result=first/second;
        }
        Double res = new Double(result);
        etRes.setText(res.toString());





    }
}
