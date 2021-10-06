package id.ac.umn.felixferdinand_00000035927_if570_bl_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnProfile, btnLibrary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProfile = findViewById(R.id.buttonProfile);
        btnLibrary = findViewById(R.id.buttonLibrary);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToProfile();
            }
        });

        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLogin();
            }
        });
    }

    public String goToProfile() {
        Intent intentProfile = new Intent(this, ProfileActivity.class);
        startActivity(intentProfile);
        return null;
    }

    public String goToLogin() {
        Intent intentLogin = new Intent(this, LoginActivity.class);
        startActivity(intentLogin);
        return null;
    }
}