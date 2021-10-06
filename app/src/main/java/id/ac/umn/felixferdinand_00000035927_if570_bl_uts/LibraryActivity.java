package id.ac.umn.felixferdinand_00000035927_if570_bl_uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.Menu;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    private ArrayList<String> SFXName = new ArrayList<>();
    private ArrayList<String> SFXCategory = new ArrayList<>();
    private ArrayList<Integer> SFXSound = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Bundle b = getIntent().getExtras();
        String Title = b.getString("Nama");
        setTitle(Title);
        Toast.makeText(getBaseContext(),"Selamat datang " + Title, Toast.LENGTH_SHORT).show();
        getData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.goProfile){
            Intent intentProfile = new Intent(this, ProfileActivity.class);
            startActivity(intentProfile);
        } else if (item.getItemId() == R.id.goMain){
            Intent intentMain = new Intent(this, MainActivity.class);
            startActivity(intentMain);
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    private void processRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(SFXName, SFXCategory, SFXSound, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData() {
        SFXName.add("Dog Bark");
        SFXCategory.add("Animal");
        SFXSound.add(R.raw.dog_bark);

        SFXName.add("Help Me");
        SFXCategory.add("Meme");
        SFXSound.add(R.raw.help_me);

        SFXName.add("Lion Roar");
        SFXCategory.add("Animal");
        SFXSound.add(R.raw.lion_roar);

        SFXName.add("Orchestra Transition");
        SFXCategory.add("Random");
        SFXSound.add(R.raw.orchestra_transition);

        SFXName.add("Keyboard Typing");
        SFXCategory.add("Satisfying");
        SFXSound.add(R.raw.keyboard_typing);

        SFXName.add("Gas Gas Gas");
        SFXCategory.add("Meme");
        SFXSound.add(R.raw.gas_gas_gas);

        SFXName.add("Run");
        SFXCategory.add("Meme");
        SFXSound.add(R.raw.run);

        processRecyclerViewAdapter();
    }
}