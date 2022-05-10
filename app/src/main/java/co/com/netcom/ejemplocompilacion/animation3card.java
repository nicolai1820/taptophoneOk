package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class animation3card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation3card);
        getSupportActionBar().hide();
        findViewById(R.id.gifImageView4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation3card.this.startActivity(new Intent(animation3card.this,animation4card.class));
            }
        });
    }
}