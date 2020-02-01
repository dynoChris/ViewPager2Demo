package com.oliverstudio.viewpager2demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    //view
    private TabLayout mTabLayout;
    private ViewPager2 mViewPager2;
//    private Button mSomeButton;

    //general vars
    private OrderPagerAdapter mOrderPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-init-
        initViews();

        mOrderPagerAdapter = new OrderPagerAdapter(this);
        mViewPager2.setAdapter(mOrderPagerAdapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mTabLayout, mViewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Pending");
                        tab.setIcon(R.drawable.ic_pending);
                        break;
                    case 1:
                        tab.setText("Confirmed");
                        tab.setIcon(R.drawable.ic_comfirmed);
                        break;
                    case 2:
                        tab.setText("Delivered");
                        tab.setIcon(R.drawable.ic_delivered);
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }

    private void initViews() {
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager2 = findViewById(R.id.view_pager_2);
//        mSomeButton = findViewById(R.id.some_btn);
    }
}