package zepeda.ricardo.com.ejemplos.fragments.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import zepeda.ricardo.com.ejemplos.R;
import zepeda.ricardo.com.ejemplos.models.car;

/**
 * Created by Titanium on 12/03/16.
 */
public class CustomListAdapter extends ArrayAdapter<car> {

    private final Context context;
    private car[] carros;

    public CustomListAdapter(Context context, car[] objects) {
        super(context, R.layout.item_custom_list, objects);
        carros=objects;
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater=LayoutInflater.from(context);

        ImageView imagenCarro=(ImageView)convertView.findViewById(R.id.imagen);
        imagenCarro.setImageResource(carros[position].getImagen());
        TextView nombreCarro=(TextView)convertView.findViewById(R.id.textNombre);
        nombreCarro.setText(carros[position].getNombre());
        TextView descriptionCarro=(TextView)convertView.findViewById(R.id.textDescription);
        descriptionCarro.setText(carros[position].getDescripcion());

        TextView rating=(TextView)convertView.findViewById(R.id.textRating);
        rating.setText(String.valueOf(carros[position].getRating()));
        return convertView;
    }

    @Override
    public int getCount() {
        return carros.length;
    }
}
