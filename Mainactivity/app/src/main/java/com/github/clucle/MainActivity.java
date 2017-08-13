package com.github.clucle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRotate = (Button) findViewById(R.id.btn_rotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Rotate
                        .Builder(getApplicationContext())
                        .fromDegrees(0)
                        .toDegrees(360)
                        .duration(1000)
                        .pivotX(findViewById(R.id.btn_rotate).getWidth() / 2)
                        .pivotY(findViewById(R.id.btn_rotate).getHeight() / 2)
                        .repeatMode(Rotate.TYPE.INFINITE)
                        .animView(findViewById(R.id.btn_rotate));
            }
        });
    }
}
