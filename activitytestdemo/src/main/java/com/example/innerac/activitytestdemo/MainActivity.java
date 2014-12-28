package com.example.innerac.activitytestdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    private Button btn_theme,btn_life,btn_data;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    protected void init(){
        btn_theme = (Button)findViewById(R.id.btn_theme);
        btn_life = (Button)findViewById(R.id.btn_life);
        btn_data = (Button)findViewById(R.id.btn_data);
        edittext = (EditText)findViewById(R.id.edit_data);

        btn_life.setOnClickListener(listen);
        btn_theme.setOnClickListener(listen);
        btn_data.setOnClickListener(datelisten);
    }

    View.OnClickListener listen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button bt = (Button)v;
            int vid = bt.getId();
            Intent intent = null;
            if(vid == btn_theme.getId()){
                intent = new Intent(MainActivity.this,ThemeActivity.class);
            }else{
                intent = new Intent(MainActivity.this,LifeActivity.class);
            }
            startActivity(intent);
        }
    };
    View.OnClickListener datelisten = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,DataActivity.class);
            String data = edittext.getText().toString();
            intent.putExtra("Data_name",data);
            startActivity(intent);
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
