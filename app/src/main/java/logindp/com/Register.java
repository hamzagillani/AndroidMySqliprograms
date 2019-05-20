package logindp.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    private EditText name_ed,user_name_ed,user_pass_ed;
    private Button reg;

    private String name,user_name,user_pass;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            name_ed=findViewById(R.id.reg_edit_name_id);
            user_name_ed=findViewById(R.id.reg_edit_user_name_id);
            user_pass_ed=findViewById(R.id.login_edit_user_pass_id);
            reg=findViewById(R.id.reg_btn_id);
        }

        public void user_register(View view) {
            name=name_ed.getText().toString();
            user_name=user_name_ed.getText().toString();
            user_pass=user_pass_ed.getText().toString();
            String method="register";
            Backgroundtask backgroundtask=new Backgroundtask(this);
            backgroundtask.execute(method,name,user_name,user_pass);
            finish();
        }


    }

