 package logindp.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
     public void user_login(View view) {
     }

     public void register(View view) {

         startActivity(new Intent(MainActivity.this,Register.class));
     }
 }
