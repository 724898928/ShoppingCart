package com.shopping.li.shopping.FragmentFactory;

import android.os.Bundle;

import com.shopping.li.shopping.Fragment.FragmentInfo;
import com.shopping.li.shopping.Fragment.Mine.MineFragment;
import com.shopping.li.shopping.Fragment.Mall.MallFragment;
import com.shopping.li.shopping.Fragment.Shoppingcart.ShopppingCartFragment;
import com.shopping.li.shopping.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by li on 2018/2/24.
 */

public class MainFragmentFactory {
    private  static volatile  MainFragmentFactory mInstace;
    List<FragmentInfo> mList;
    private String tag = "tag";
     String[] mBotTitles=new String[]{"商城","我","购物车"};
    int[] mColors = new int[]{
            R.color.bg_tab_unselect,
            R.color.bg_tab_select
    };
    private MainFragmentFactory() {

    }
    public  static MainFragmentFactory getInstance(){
        if (mInstace == null){
            synchronized (MainFragmentFactory.class){
                if (mInstace==null){
                    mInstace = new MainFragmentFactory();
                }
            }
        }
        return  mInstace;
    }
    public void add(FragmentInfo fragmentInfo){
        if (mList == null){
            mList = new ArrayList<>();
        }
        mList.add(fragmentInfo);
    }
    public List<FragmentInfo> getList(){
        if (mList==null){
            mList = new ArrayList<>();
            Bundle bundle = new Bundle();
            bundle.putString(tag,mBotTitles[0]);
            FragmentInfo shoppings = new FragmentInfo(MallFragment.class,
                    mBotTitles[0],
                    bundle,
                    null,
                    mColors
            );
            Bundle bundle1 = new Bundle();
            bundle.putString(tag,mBotTitles[1]);
            FragmentInfo Myfragment = new FragmentInfo(MineFragment.class,
                    mBotTitles[1],
                    bundle1,
                    null,
                    mColors
            );
            Bundle bundle2 = new Bundle();
            bundle.putString(tag,mBotTitles[2]);
            FragmentInfo shoppingsCart = new FragmentInfo(ShopppingCartFragment.class,
                    mBotTitles[2],
                    bundle2,
                    null,
                    mColors
            );
            mList.add(shoppings);
            mList.add(Myfragment);
            mList.add(shoppingsCart);

        }
        return  mList;

    }
}
