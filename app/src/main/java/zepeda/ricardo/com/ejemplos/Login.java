package zepeda.ricardo.com.ejemplos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Titanium on 05/03/16.
 */
public class Login extends AppCompatActivity {

    private EditText userName,password;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        userName=(EditText)findViewById(R.id.textUsername);
        password=(EditText)findViewById(R.id.textPassword);
        login=(Button)findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass=password.getText().toString();
                String user=userName.getText().toString();
                if(user.equalsIgnoreCase("")){
                    userName.setError("Campo requerido");
                    userName.requestFocus();
                }
                if(pass.equalsIgnoreCase("")){
                    password.setError("Campo requerido");
                    password.requestFocus();
                }
                if(user.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("admin"))
                    Toast.makeText(Login.this,"Login successful!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Login.this,"Autentification failed!!",Toast.LENGTH_LONG).show();
            }
        });

    }
}
