package id.ac.umn.felixferdinand_00000035927_if570_bl_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SFXPlayer extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView SFXName, SFXCategory;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sfxplayer);

        SFXName = findViewById(R.id.SFXName);
        SFXCategory = findViewById(R.id.SFXCategory);

        playButton = findViewById(R.id.play);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getIncomingExtra();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("name") && getIntent().hasExtra("category") && getIntent().hasExtra("sound")){
            String name = getIntent().getStringExtra("name");
            String category = getIntent().getStringExtra("category");
            Integer sound = getIntent().getIntExtra("sound", 0);
            setDataActivity(name, category, sound);
        }
    }

    private void setDataActivity(String nama, String kategori, int suara){
        setTitle(nama);
        SFXName.setText(nama);
        SFXCategory.setText(kategori);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(SFXPlayer.this, suara);
                }
                mediaPlayer.start();
            }
        });
    }
}