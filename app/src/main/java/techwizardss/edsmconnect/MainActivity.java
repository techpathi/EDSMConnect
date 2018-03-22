package techwizardss.edsmconnect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String PREFS_NAME="Login Validator";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClaimCard(View view) {

        Intent claimintent=new Intent(MainActivity.this,ClaimActivity.class);
        startActivity(claimintent);
    }

    public void onSignOut(View view) {

        SharedPreferences loginstatus=getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor = loginstatus.edit();
        editor.putString("key", "LOGGEDOFF");
        editor.apply();

        Toast.makeText(this,"You are signed out",Toast.LENGTH_SHORT).show();

        Intent loginagain=new Intent(this,UserLoginActivity.class);
        startActivity(loginagain);

    }
}
