package com.shopping.li.shopping;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import com.shopping.li.shopping.BaseActivity.BaseActivity;
import com.shopping.li.shopping.Fragment.FragmentInfo;
import com.shopping.li.shopping.Fragment.MainFragment;
import com.shopping.li.shopping.FragmentFactory.MainFragmentFactory;
import com.shopping.li.shopping.logUtil.LogUtil;

import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private String[] mTabTitles = {"电子", "酒类", "日用品", "食品"};
    private String[] mBotTitles = new String[]{"商城", "我", "购物车"};
    private FragmentTabHost mTabHost;
    private TabWidget mTabWidget;
    private List<FragmentInfo> mFragmentEntities;
    MainFragment mainFragment = new MainFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.d("MainActivity", "onCreate");

        //实例化FragmentTabHost并设置相关样式
        mTabHost = findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(),
                R.id.main_layout_content);
        mTabWidget = mTabHost.getTabWidget();
        //去掉分割线
        mTabWidget.setDividerDrawable(null);
        mFragmentEntities = MainFragmentFactory.getInstance().getList();
        initListener();
        initData();

    }

    private void initData() {
        int size = mFragmentEntities.size();
        Bundle bundle;
        for (int i = 0; i < size; i++) {
            LogUtil.d("MainActivity", "initData  size:=" + size);
            FragmentInfo fragmentInfo = mFragmentEntities.get(i);
            String title = fragmentInfo.getTitle();
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(title).setIndicator(
                    getTabView(i));
            bundle = new Bundle();
            // bundles.add(bundle);
            bundle.putString("tag", mBotTitles[i]);
            LogUtil.d("lixin ", " bundle=>" + bundle + " [i]=>" + i);
            mTabHost.addTab(tabSpec, fragmentInfo.getClz(), bundle);

        }
        updateTab(0);
    }

    private void initListener() {
        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                int currentTab = mTabHost.getCurrentTab();
                LogUtil.d("MainActivity", "onTabChanged：currentTab:=" + currentTab);
                updateTab(currentTab);
            }
        });
    }

    private void updateTab(int currentTab) {
        int childCount = mTabWidget.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = mTabWidget.getChildTabViewAt(i);
            setSingleView(view, currentTab, i);
        }
    }

    private View getTabView(int i) {
        View view = View.inflate(MainActivity.this, R.layout.shopping_layout, null);
        int currentTab = mTabHost.getCurrentTab();

        LogUtil.d("lixin", "getTabView currentTab:=" + currentTab);
        setSingleView(view, currentTab, i);
        return view;
    }

    /**
     *
     * @param view
     * @param currentTab
     * @param index
     */
    private void setSingleView(View view, int currentTab, int index) {
        FragmentInfo fragmentInfo = mFragmentEntities.get(index);
        int[] imagIds = fragmentInfo.getmImagIds();
        int[] colors = fragmentInfo.getmColors();
        TextView tv = (TextView) view.findViewById(R.id.tab_tv);
        //  ImageView iv = (ImageView) view.findViewById(R.id.tab_icon);
        tv.setText(fragmentInfo.getTitle());
        Resources resources = getResources();
        if (index == currentTab) {
            tv.setTextColor(resources.getColor(colors[1]));
            //   iv.setImageDrawable(resources.getDrawable(imagIds[1]));
        } else {
            tv.setTextColor(getResources().getColor(colors[0]));
            //   iv.setImageDrawable(resources.getDrawable(imagIds[0]));
        }
    }


    @Override
    public void onClick(View v) {
      /*  switch (v.getId()){
            case R.id.shoppingcart :
           toActivity(MainActivity.class);
                break;
            case R.id.wo :
                ;
                break;
            case R.id.shoppings :
                ;
                break;
        }*/
    }

    public void toActivity(Bundle bundle, Class<? extends BaseActivity> activity) {
        Intent intent = new Intent(this, activity);
        intent.putExtra("data", bundle);
        startActivity(intent);
    }

    private void replaceFragment(int R, Fragment mainFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R, mainFragment);
        transaction.commit();
    }
}
