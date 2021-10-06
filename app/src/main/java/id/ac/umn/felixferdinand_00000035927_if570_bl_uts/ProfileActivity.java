package id.ac.umn.felixferdinand_00000035927_if570_bl_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView ref1 = findViewById(R.id.ref1);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ref2 = findViewById(R.id.ref2);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ref3 = findViewById(R.id.ref3);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ref4 = findViewById(R.id.ref4);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ref5 = findViewById(R.id.ref5);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ref6 = findViewById(R.id.ref6);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ref7 = findViewById(R.id.ref7);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ref8 = findViewById(R.id.ref8);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ref9 = findViewById(R.id.ref9);
        ref1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}