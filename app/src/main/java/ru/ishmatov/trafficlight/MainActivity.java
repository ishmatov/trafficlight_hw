package ru.ishmatov.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout b_1;
    private LinearLayout b_2, b_3;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_1 = findViewById(R.id.buld_1);
        b_2 = findViewById(R.id.buld_2);
        b_3 = findViewById(R.id.buld_3);
        btnStart = findViewById(R.id.button);
    }

    public void onClickStart(View view) {
    }
}