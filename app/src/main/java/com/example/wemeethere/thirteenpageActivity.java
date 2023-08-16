package com.example.wemeethere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirteenpageActivity extends AppCompatActivity {
    private Button btn13_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirteenpage);

        btn13_1 = findViewById(R.id.btn13_1);
        btn13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thirteenpageActivity.this, ninepageActivity.class);
                startActivity(intent);
            }
        });
    }
}