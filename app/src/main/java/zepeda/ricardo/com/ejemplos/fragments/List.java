package zepeda.ricardo.com.ejemplos.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import zepeda.ricardo.com.ejemplos.R;
import zepeda.ricardo.com.ejemplos.Splash;
import zepeda.ricardo.com.ejemplos.containerEjemplos;

/**
 * Created by Titanium on 12/03/16.
 */
public class List extends Fragment {

    private String[] opciones= new String[]{"opcion1","opcion2","opcion3","opcion4","opcion5"};
    private ListView lista;
    private ArrayAdapter<String> adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_list,container,false);
        opciones=getResources().getStringArray(R.array.opciones);
        lista=(ListView)v.findViewById(R.id.listEjemplos);
        adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,opciones);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Splash.class);
                    startActivity(intent);
                } else {
                    Intent intent=new Intent(getActivity(),containerEjemplos.class);
                    intent.putExtra("numeroEjemplo",position);
                    startActivity(intent);
                }
            }
        });
        return v;
    }
}
