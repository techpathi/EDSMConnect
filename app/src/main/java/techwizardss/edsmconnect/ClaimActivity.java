package techwizardss.edsmconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.UUID;

public class ClaimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim);
    }

    public void onClaimClick(View view) {

        UUID UniqueID= UUID.randomUUID();

        String id=UniqueID.toString().substring(0,8);

        Toast.makeText(this,"Application submitted with Unique ID:"+id,Toast.LENGTH_SHORT).show();


    }
}
