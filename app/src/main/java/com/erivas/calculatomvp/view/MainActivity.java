package com.erivas.calculatomvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.erivas.calculatomvp.R;
import com.erivas.calculatomvp.presenter.MainActivityPresenter;
import com.erivas.calculatomvp.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    private MainActivityPresenter presenter;
    private EditText numberOne, numberTwo;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = (EditText) findViewById(R.id.number1);
        numberTwo = (EditText) findViewById(R.id.number2);
        tvResult = (TextView) findViewById(R.id.result);

        presenter = new MainActivityPresenterImpl(this);

    }

    public void sum(View view){

        String num1 = numberOne.getText().toString();
        String num2 = numberTwo.getText().toString();

        presenter.sum(num1,num2);

    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }

    @Override
    public void showError(String error) {

    }
}
