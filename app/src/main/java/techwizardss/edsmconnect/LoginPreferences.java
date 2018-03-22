package techwizardss.edsmconnect;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

/**
 * Created by rajuceleb on 22-03-2018.
 */

public class LoginPreferences extends Activity {

    public static final String PREFS_NAME="Login Validator";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        SharedPreferences loginstaus=getSharedPreferences(PREFS_NAME,MODE_PRIVATE);




    }
}
