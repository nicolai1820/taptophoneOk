package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class detallesell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallesell);
        getSupportActionBar().hide();
        findViewById(R.id.imageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detallesell.this.startActivity(new Intent(detallesell.this,homeventa.class));
            }
        });
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detallesell.this.startActivity(new Intent(detallesell.this,sendmail.class));
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detallesell.this.startActivity(new Intent(detallesell.this,animation3card.class));
            }
        });
    }
}