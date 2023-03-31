package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.tensorflow.lite.examples.detection.R;

public class MainActivity2 extends AppCompatActivity {

    protected Button buttonDetect;
    protected Button cameraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        buttonDetect = findViewById(R.id.buttonDetect);
        buttonDetect.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, DetectorGallery.class);
            startActivity(intent);
        });

        cameraButton = findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, DetectorActivity.class)));


    }
}


