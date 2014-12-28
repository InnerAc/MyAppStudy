package com.example.innerac.activity_test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class activity_life extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("This activity start");
        setContentView(R.layout.activity_activity_life);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_life, menu);
        return true;
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

    protected void onStart(){
        super.onStart();
        Log.i("log","onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.i("log","onResume");
    }
    protected void onPause(){
        super.onPause();
        Log.i("log","onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.i("log","onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("log","onDestroy");
    }

}
