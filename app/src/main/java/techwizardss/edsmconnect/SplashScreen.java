package techwizardss.edsmconnect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    public static final String PREFS_NAME="Login Validator";


    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main


                SharedPreferences loginstatus=getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
                String loginval=loginstatus.getString("loginstatus","");


                if(loginval.equals("LOGGED_IN"))
                {
                    Intent  main=new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(main);

                }
                else if(loginval.equals("LOGGEDOFF"))
                {
                    Intent login= new Intent(SplashScreen.this,UserLoginActivity.class);
                    startActivity(login);
                }
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }







}
