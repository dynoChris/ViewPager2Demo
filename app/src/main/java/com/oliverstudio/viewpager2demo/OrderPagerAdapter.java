package com.oliverstudio.viewpager2demo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class OrderPagerAdapter extends FragmentStateAdapter {

    private List<Fragment> mFragments = new ArrayList<>();

    public OrderPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);

        mFragments.add(new PendingFragment());
        mFragments.add(new ConfirmedFragment());
        mFragments.add(new DeliveredFragment());
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getItemCount() {
        return mFragments.size();
    }
}
