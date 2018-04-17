package com.shopping.li.shopping.Entity;

import java.io.Serializable;

/**
 * Created by li on 2018/2/25.
 */

public class ShoppingCart implements Serializable {

    private  String proImg;
    private  String proName;
    private  int shopPrice;
    private  String markPrice;
    private  String proCount;

    public String getProImg() {
        return proImg;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(int shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(String markPrice) {
        this.markPrice = markPrice;
    }

    public String getProCount() {
        return proCount;
    }

    public void setProCount(String proCount) {
        this.proCount = proCount;
    }
}
