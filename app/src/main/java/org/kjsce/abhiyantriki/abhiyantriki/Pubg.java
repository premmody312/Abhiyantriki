package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Pubg extends NavActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pubg);

        BottomNavigationView bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom);
        //Highlighting Register button
        bottomNavigationView.setSelectedItemId(R.id.register);
        }
}