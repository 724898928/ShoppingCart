package com.shopping.li.shopping.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by li on 2018/2/24.
 */

public class FragmentInfo {
    private  Class<? extends Fragment> clz;
    private  String title = "";
    private Bundle arugment;
    //    mImagIds[0] 未选中的图片资源，mImagIds[1] 选中的图片资源，
    private int[] mImagIds=new int[2];
    //    mColors【0】 未选中字体的显示颜色， mColors【1】 未选中字体的显示颜色
    private int [] mColors=new int[2];

    public FragmentInfo(Class<? extends Fragment> clz, String title,
                        Bundle arugment, int[] mImagIds, int[] mColors) {
        this.clz = clz;
        this.title = title;
        this.arugment = arugment;
        this.mImagIds = mImagIds;
        this.mColors = mColors;
    }

    public Class<? extends Fragment> getClz() {
        return clz;
    }

    public void setClz(Class<? extends Fragment> clz) {
        this.clz = clz;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bundle getArugment() {
        return arugment;
    }

    public void setArugment(Bundle arugment) {
        this.arugment = arugment;
    }

    public int[] getmImagIds() {
        return mImagIds;
    }

    public void setmImagIds(int[] mImagIds) {
        this.mImagIds = mImagIds;
    }

    public int[] getmColors() {
        return mColors;
    }

    public void setmColors(int[] mColors) {
        this.mColors = mColors;
    }
}
