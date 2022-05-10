package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class homeventa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeventa);
        getSupportActionBar().hide();
        findViewById(R.id.imageButton9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeventa.this.startActivity(new Intent(homeventa.this,montoventa.class));
            }
        });

        findViewById(R.id.tableLayout4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeventa.this.startActivity(new Intent(homeventa.this,detallesell.class));
            }
        });

        findViewById(R.id.imageButton6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeventa.this.startActivity(new Intent(homeventa.this,historialdetransacciones.class));
            }
        });
    }
}