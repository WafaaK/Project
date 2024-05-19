package com.example.fitnesstracker360;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private TextView stepsTextView;
    private Button startStopButton;
    private boolean isTracking = false;
    private SensorManager sensorManager;
    private Sensor accelerometer;
    private int stepsCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stepsTextView = findViewById(R.id.stepsTextView);
        startStopButton = findViewById(R.id.startStopButton);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        // Logique du bouton pour démarrer/arrêter le suivi
        startStopButton.setOnClickListener(v -> {
            if (isTracking) {
                stopTracking();
            } else {
                startTracking();
            }
        });
    }

    private void startTracking() {
        // Commencer à écouter les mises à jour de l'accéléromètre
        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
        isTracking = true;
        startStopButton.setText("Arrêter le suivi");
    }

    private void stopTracking() {
        // Arrêter d'écouter les mises à jour de l'accéléromètre
        sensorManager.unregisterListener(this);
        isTracking = false;
        startStopButton.setText("Démarrer le suivi");
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor == accelerometer) {
            // Calculer les pas en utilisant les données de l'accéléromètre (exemple simplifié)
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];

            float acceleration = (float) Math.sqrt(x * x + y * y + z * z);
            if (acceleration > 10) {
                // On suppose que chaque pas provoque une accélération supérieure à 10
                stepsCount++;
                stepsTextView.setText("Nombre de pas: " + stepsCount);
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Non utilisé dans cet exemple
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // S'assurer que les écouteurs de capteurs sont désenregistrés lorsque l'activité est détruite
        if (isTracking) {
            sensorManager.unregisterListener(this);
        }
    }
}