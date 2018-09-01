package brayan.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityCalificar extends AppCompatActivity /*implements OnClickListener*/ {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar);

        t=(TextView)findViewById(R.id.txtMensaje);
       // findViewById(R.id.btnCalificar).setOnClickListener(this);


    }

    //@Override
    /*public void onClick(View v) {
        switch (v .getId()){
            case R.id.btnCalificacion:
                if(t.getVisibility()==View.GONE)
                    t.setVisibility(View.VISIBLE);
        }

    }*/
}
