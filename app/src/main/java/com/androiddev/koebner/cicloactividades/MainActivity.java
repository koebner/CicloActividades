package com.androiddev.koebner.cicloactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Estado de una actividad", "Creacion");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Estado de una actividad", "DestruirApp");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Estado de una actividad", "pausa");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Estado de una actividad", "restaurarapp");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Estado de una actividad", "inicia actividad");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Estado de una actividad", "reinicia actividad");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
