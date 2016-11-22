package ar.com.sourcesistemas.gremios.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ar.com.sourcesistemas.gremios.R;

public class MainActivity extends AppCompatActivity {


    private Button denunciarAbuso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        denunciarAbuso = (Button)findViewById(R.id.denunciar_abuso);


        denunciarAbuso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(MainActivity.this, "abuso denunciado", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
