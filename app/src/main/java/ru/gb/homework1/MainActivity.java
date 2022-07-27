package ru.gb.homework1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText operand1;
    private EditText operand2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = findViewById(R.id.operand1);
        operand2 = findViewById(R.id.operand2);
        Button sumButton = findViewById(R.id.sum_button);

        sumButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(
                this,
                String.valueOf(
                        sum(
                                operand1.getText().toString(),
                                operand2.getText().toString()
                        )
                ),
                Toast.LENGTH_SHORT
        ).show();

    }

    public int sum(String o1, String o2)
    {
        return Integer.parseInt(o1) + Integer.parseInt(o2);
    }
}

