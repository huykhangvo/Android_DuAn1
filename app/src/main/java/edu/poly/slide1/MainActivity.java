package edu.poly.slide1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import edu.poly.slide1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void btnAdd_click(View view) {
        int num1 = Integer.parseInt(binding.etNumber1.getText().toString());
        int num2 = Integer.parseInt(binding.etNumber2.getText().toString());
        int result = num1 + num2;


        binding.tvResult.setText(String .format("%d + %d = %d", num1, num2, result));
    }
}