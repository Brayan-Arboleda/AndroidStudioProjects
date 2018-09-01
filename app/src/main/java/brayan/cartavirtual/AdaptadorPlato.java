package brayan.cartavirtual;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class AdaptadorPlato extends BaseAdapter {

    private static LayoutInflater inflater = null;
    Context context;
    String[][] datos;
    int[] datosImg;

    public AdaptadorPlato(Context context,String[][] datos,int[] datosImg){
        this.context=context;
        this.datos=datos;
        this.datosImg=datosImg;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_lista_entrada, null);
        TextView txtTitulo = (TextView)vista.findViewById(R.id.txtTitulo1);
        TextView txtPrecio = (TextView)vista.findViewById(R.id.txtPrecio1);
        ImageView imagen = (ImageView)vista.findViewById(R.id.miImagen1);
        RatingBar calificacion = (RatingBar)vista.findViewById(R.id.ratingBarPlato);
        txtTitulo.setText(datos[i][0]);
        txtPrecio.setText("Precio "+datos[i][1]);
        imagen.setImageResource(datosImg[i]);
        calificacion.setProgress(Integer.valueOf(datos[i][2]));
        imagen.setTag(i);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(context, VisorImagen.class);
                visorImagen.putExtra("IMG",datosImg[(Integer)v.getTag()]);
                context.startActivity(visorImagen);
            }
        });
        return vista;
    }
}
