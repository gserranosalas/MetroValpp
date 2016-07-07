package com.gcss.metrovalpp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Selección de items del menú.
        switch (item.getItemId()) {
            case R.id.acerca_de:
                acercaDe();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void acercaDe() {
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/gcss90"));
        startActivity(browse);
    }
}
