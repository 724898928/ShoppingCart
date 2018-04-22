package com.shopping.li.shopping.Fragment.Mall;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shopping.li.shopping.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by li on 2018/2/25.
 */

public class MallFragment extends Fragment {
    private View mView;
    String tag= "tag";
    private List<Fragment> fragments;
    private  String[] mTabTitles={"电子","酒类","日用品","食品"};
    Context context = getContext();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        if(mView==null){
            mView = View.inflate(getContext(), R.layout.activity_good,null);
            initFragment();
            ViewPager viewPager = mView.findViewById(R.id.viewpager);
            TabLayout tabLayout= mView.findViewById(R.id.tabs);
            MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(this.getFragmentManager(),getContext());
            viewPager.setAdapter(adapter);
            tabLayout.setupWithViewPager(viewPager);
            //实例化FragmentTabHost并设置相关样式


            Bundle arguments = getArguments();
            if (arguments!=null){
                String string = arguments.getString(tag);
                //    tvContent.setText(string);

            }
        }
        ViewGroup parent = (ViewGroup) mView.getParent();
        if (parent!=null){
            parent.removeView(mView);
        }
        return mView;
        // return inflater.inflate(R.layout.activity_good,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void initFragment() {
        EleFragment eleFragment = new EleFragment();
        AlcoholFragment alcoholFragment = new AlcoholFragment();
        DayFragment dayFragment = new DayFragment();
        FoodFragment foodFragment = new FoodFragment();

        fragments = new ArrayList<>();
        fragments.add(eleFragment);
        fragments.add(alcoholFragment);
        fragments.add(dayFragment);
        fragments.add(foodFragment);

    }

    /* private void initToolBar() {
         Toolbar toolbar= findViewById(R.id.toolbar);
         toolbar.setTitle("shopping");
         setSupportActionBar(toolbar);
     }*/

    private class MyFragmentPagerAdapter extends FragmentPagerAdapter {

        private Context context;
        public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
            super(fm);
            this.context = context;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position) ;
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabTitles[position];
        }
    }
}
