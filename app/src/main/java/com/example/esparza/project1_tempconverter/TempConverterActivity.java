package com.example.esparza.project1_tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.EditorInfo;

public class TempConverterActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);

        final EditText ConvET = (EditText)findViewById(R.id.ConvET);
        final TextView CelConvTV = (TextView)findViewById(R.id.CelConvTV);

        ConvET.setOnEditorActionListener(new EditText.OnEditorActionListener()
        {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
            {
                if(actionId == EditorInfo.IME_ACTION_DONE)
                {
                   double num1 = Double.parseDouble(ConvET.getText().toString());
                    double num2 = (num1-32) * 5/9 ;
                    CelConvTV.setText(Double.toString(num2));
                }
                return false;
            }


    });



}
}
