package com.example.innerac.activitytestdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class LifeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("LifeCycle","onCreate");
        setContentView(R.layout.activity_life);
    }

    protected void onStart(){
        super.onStart();
        Log.i("LifeCycle","onStart");
    }

    protected  void onResume(){
        super.onResume();
        Log.i("LifeCycle","onResume");
    }
    protected  void onStop(){
        super.onStop();
        Log.i("LifeCycle","onStop");
    }
    protected  void onDestroy(){
        Log.i("LifeCycle","onDestory");
        super.onDestroy();
    }
    protected void onRestart(){
        Log.i("LifeCycle","onRestart");
        super.onRestart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_life, menu);
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
}
