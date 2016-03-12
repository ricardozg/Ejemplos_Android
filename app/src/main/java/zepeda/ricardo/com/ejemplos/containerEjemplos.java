package zepeda.ricardo.com.ejemplos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Titanium on 12/03/16.
 */
public class containerEjemplos extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        int pos=getIntent().getExtras().getInt("numeroEjemplo");
        Log.d("containerEjemplos","Posicion: "+pos);
    }
}
