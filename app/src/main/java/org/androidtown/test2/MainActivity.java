package org.androidtown.test2;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ArrayList arrayList = new ArrayList();

    int count = 0;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        editText = (EditText)findViewById(R.id.text_bagic);
        Button button_plus = (Button)findViewById(R.id.button_plus);
        Button button_sub = (Button)findViewById(R.id.button_sub);
        Button button_muti = (Button)findViewById(R.id.button_muti);
        Button button_div = (Button)findViewById(R.id.button_div);
        Button button_result = (Button)findViewById(R.id.button_result);

        button_plus.setOnClickListener(mListener);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClick (View v){

        switch (v.getId()){
            case R.id.button_0 : editText.setText(editText.getText().toString() + "0"); break;
            case R.id.button_1 : editText.setText(editText.getText().toString() + "1"); break;
            case R.id.button_2 : editText.setText(editText.getText().toString() + "2"); break;
            case R.id.button_3 : editText.setText(editText.getText().toString() + "3"); break;
            case R.id.button_4 : editText.setText(editText.getText().toString() + "4"); break;
            case R.id.button_5 : editText.setText(editText.getText().toString() + "5"); break;
            case R.id.button_6 : editText.setText(editText.getText().toString() + "6"); break;
            case R.id.button_7 : editText.setText(editText.getText().toString() + "7"); break;
            case R.id.button_8 : editText.setText(editText.getText().toString() + "8"); break;
            case R.id.button_9 : editText.setText(editText.getText().toString() + "9"); break;
        }
    }


    Button.OnClickListener mListener =new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_plus:
                    arrayList.add(editText.getText().toString());
                    editText.setText("");
                    count = 1;
                    break;
                case R.id.button_sub:
                    arrayList.add(editText.getText().toString());
                    editText.setText("");
                    count = 2;
                    break;
                case R.id.button_muti:
                    arrayList.add(editText.getText().toString());
                    editText.setText("");
                    count = 3;
                    break;
                case R.id.button_div:
                    arrayList.add(editText.getText().toString());
                    editText.setText("");
                    count = 4;
                    break;
                case R.id.button_result:

                    if(count == 1){
                        edit.setText("" + (Double.parseDouble(number) + Double.parseDouble(edit.getText().toString())));
                    }
                    break;

            }


        }
    };
}
