package com.example.chekbox_list;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.os.Bundle;
import android.view.View;

import com.example.chekbox_list.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.checkbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.checkbox1.isChecked()) {

                    sum = sum + 600;
                } else if (!binding.checkbox1.isChecked()) {

                    sum = sum - 600;
                }
                binding.total.setText("Total="+sum);
            }
        });
        binding.checkbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.checkbox2.isChecked()) {

                    sum = sum + 100;
                } else if (!binding.checkbox2.isChecked()) {

                    sum = sum - 100;
                }
                binding.total.setText("Total="+sum);
            }
        });
        binding.checkbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.checkbox3.isChecked()) {

                    sum = sum + 120;
                } else if (!binding.checkbox3.isChecked()) {

                    sum = sum - 120;
                }
                binding.total.setText("Total="+sum);
            }
        });
        binding.checkbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.checkbox4.isChecked()) {

                    sum = sum + 200;
                } else if (!binding.checkbox4.isChecked()) {

                    sum = sum - 200;
                }
                binding.total.setText("Total="+sum);
            }
        });
        binding.checkbox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.checkbox5.isChecked()) {

                    sum = sum + 500;
                } else if (!binding.checkbox5.isChecked()) {

                    sum = sum - 500;
                }
                binding.total.setText("Total="+sum);
            }
        });
        binding.checkbox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.checkbox6.isChecked()) {

                    sum = sum + 210;
                } else if (!binding.checkbox6.isChecked()) {

                    sum = sum - 210;
                }
                binding.total.setText("Total="+sum);
            }
        });
        binding.checkbox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.checkbox7.isChecked()) {

                    sum = sum + 110;
                } else if (!binding.checkbox7.isChecked()) {

                    sum = sum - 110;
                }
                binding.total.setText("Total="+sum);
            }
        });





    }
}