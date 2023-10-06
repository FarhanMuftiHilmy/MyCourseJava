package com.arfdn.mycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.arfdn.mycourse.databinding.ActivityMainJavaBinding;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainJavaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainJavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TabAdapterJava tabAdapter = new TabAdapterJava(getSupportFragmentManager());
        binding.viewPager.setAdapter(tabAdapter);

        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_home) {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.action_materi) {
            // Logika untuk melihat skor
            Toast.makeText(this, "Materi", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.action_quiz) {
            Toast.makeText(this, "Quiz", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}