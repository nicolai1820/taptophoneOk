package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class historialdetransacciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historialdetransacciones);
        getSupportActionBar().hide();
        findViewById(R.id.imageButton8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                historialdetransacciones.this.startActivity(new Intent(historialdetransacciones.this, homeventa.class));
            }
        });
    }
}