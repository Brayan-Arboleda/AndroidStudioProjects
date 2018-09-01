package brayan.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class VisorImagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);

        ImageView img = (ImageView)findViewById(R.id.imgCompleta);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b!=null){
            img.setImageResource(b.getInt("IMG"));
        }
    }
}
