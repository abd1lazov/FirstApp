package space.abdilazov.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("Abdy") && password.getText().toString().equals("12345")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast toast = Toast.makeText (getApplicationContext (),"Welcome" , Toast.LENGTH_SHORT);
                    toast.setMargin ( 50 , 50 );
                    toast.show ();
                }
            }
        });
    }

}