package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class animation1card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation1card);
        getSupportActionBar().hide();
        findViewById(R.id.gifImageView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation1card.this.startActivity(new Intent(animation1card.this,animation2card.class));
            }
        });
    }
}