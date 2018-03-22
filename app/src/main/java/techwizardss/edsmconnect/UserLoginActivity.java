package techwizardss.edsmconnect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.StringReader;

public class UserLoginActivity extends AppCompatActivity {


    public static final String PREFS_NAME="Login Validator";

    EditText inputemail,inputpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        inputemail=(EditText)findViewById(R.id.input_email);
        inputpassword=(EditText)findViewById(R.id.input_password);
        btnlogin=(Button)findViewById(R.id.btn_login);

    }

    public void onloginClick(View view) {

        if(inputemail.getText().toString().trim().length()==0)
        {
            inputemail.setError("Username is not entered");
            inputemail.requestFocus();
        }
        if(inputpassword.getText().toString().trim().length()==0)
        {
            inputpassword.setError("Password is not entered");
            inputpassword.requestFocus();
        }

        String username=inputemail.getText().toString();
        String passkey=inputpassword.getText().toString();

        String username_db="venkat4coding@gmail.com";
        String passkey_db="admin123";


        if(username.equals(username_db)&&passkey.equals(passkey_db))
        {

            SharedPreferences loginstatus=getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
            SharedPreferences.Editor editor=loginstatus.edit();
            editor.putString("loginstatus","LOGGED_IN");
            editor.apply();


            Intent givelogin=new Intent(UserLoginActivity.this,MainActivity.class);
            startActivity(givelogin);
        }
        else {
            Toast.makeText(this,"EMail or Password incorrect",Toast.LENGTH_SHORT);

        }

    }

    public void onGetSignUp(View view) {


        Intent getsignup=new Intent(UserLoginActivity.this,UserSignUpActivity.class);
        startActivity(getsignup);
    }
}
