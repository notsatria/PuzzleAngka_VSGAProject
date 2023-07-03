package com.example.puzzleangka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        final Button button_a = findViewById(R.id.button_a);
        final Button button_b = findViewById(R.id.button_b);
        final Button button_c = findViewById(R.id.button_c);
        final Button button_d = findViewById(R.id.button_d);
        final Button button_e = findViewById(R.id.button_e);
        final Button button_f = findViewById(R.id.button_f);


        button_a.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showPopupDialog();
            }
        });
        button_b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showPopupDialog();
            }
        });
        button_c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showPopupDialog();
            }
        });
    }

    private void showPopupDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Tombol diklik");
        builder.setMessage("Tombol diklik");
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ulangi:
                Toast.makeText(this, "Ulangi",  Toast.LENGTH_LONG).show();
                break;
            case R.id.keluar:
                Toast.makeText(this, "Keluar",  Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }
}
