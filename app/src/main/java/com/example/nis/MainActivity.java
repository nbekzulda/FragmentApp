package com.example.nis;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.AddFragment(new FragmentHome(), "");
        adapter.AddFragment(new FragmentProfile(), "");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_person);


    }


    public void counterResult(int count) {
        FragmentProfile fragment = (FragmentProfile)
                getSupportFragmentManager().findFragmentById(R.id.conteiner);
        fragment.showCounterValue(count);
    }

   // public void onclickbutton(View view){
   //     ImageButton imageButton = (ImageButton)  findViewById(R.id.imbut);
   //     TextView counter = (TextView) findViewById(R.id.counter);
   //     counter.setText(String.valueOf(counter));
   // }

}
