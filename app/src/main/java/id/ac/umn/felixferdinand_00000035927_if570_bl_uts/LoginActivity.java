package id.ac.umn.felixferdinand_00000035927_if570_bl_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText nameText;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameText = findViewById(R.id.loginInput);
        btnLogin = findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(nameText.getText())){
                    nameText.setError("Harap Diisi");
                    nameText.requestFocus();
                } else {
                    goToLibrary();
                }
            }
        });
    }

    public String goToLibrary(){
        Intent intentNama = new Intent(this, LibraryActivity.class);
        String nama = nameText.getText().toString();
        intentNama.putExtra("Nama", nama);
        startActivity(intentNama);
        return null;
    }
}