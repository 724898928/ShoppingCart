package com.shopping.li.shopping.Entity;

/**上品信息类
 * Created by li on 2018/2/25.
 */

public class GoodsInfo {

    private String id;
    private String name;
    private boolean isChoosed;
    private String imageUrl;
    private String desc;
    private double price;
    private double prime_price;
    private int postion;
    private int count;
    private String color;
    private String size;
    private int goodsImg;
    private  int buyNum;

    public GoodsInfo(String id, String name, String desc,double price, double prime_price,
                     String color, String size, int goodsImg,int count ,int buyNum) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.prime_price = prime_price;
        this.count = count;
        this.color = color;
        this.size = size;
        this.goodsImg = goodsImg;
        this.buyNum = buyNum;
    }

    public GoodsInfo(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.desc = builder.desc;
        this.price = builder.price;
        this.prime_price = builder.prime_price;
        this.count = builder.count;
        this.color = builder.color;
        this.size = builder.size;
        this.goodsImg = builder.goodsImg;
        this.buyNum = builder.buyNum;
    }

    public GoodsInfo(int i, String name, String desc, int price, int prime_price, String color, String size, int goodsImg, int count, int buyNum) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.prime_price = prime_price;
        this.count = count;
        this.color = color;
        this.size = size;
        this.goodsImg = goodsImg;
        this.buyNum = buyNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChoosed() {
        return isChoosed;
    }

    public void setChoosed(boolean choosed) {
        isChoosed = choosed;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrime_price() {
        return prime_price;
    }

    public void setPrime_price(double prime_price) {
        this.prime_price = prime_price;
    }

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(int goodsImg) {
        this.goodsImg = goodsImg;
    }

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }
   public static class Builder{
        private String id;
        private String name;
        private boolean isChoosed;
        private String imageUrl;
        private String desc;
        private double price;
        private double prime_price;
        private int postion;
        private int count;
        private String color;
        private String size;
        private int goodsImg;
        private  int buyNum;
        private Builder id(String id, String name, String desc,double price, double prime_price,
                          String color, String size, int goodsImg,int count ,int buyNum) {
            this.id = id;


            this.price = price;
            this.prime_price = prime_price;
            this.count = count;
            this.color = color;
            this.size = size;
            this.goodsImg = goodsImg;
            this.buyNum = buyNum;
            return this;
        }

       public Builder Name(String name) {
           this.name = name;
           return this;
       }

       public Builder isChoosed( boolean isChoosed) {
           this.isChoosed = isChoosed;
           return this;
       }

       public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
           return this;
       }

       public Builder desc(String desc) {
            this.desc = desc;
           return this;
       }

       public Builder price( double price) {
            this.price = price;
           return this;
       }

       public Builder prime_price(double prime_price) {
            this.prime_price = prime_price;
           return this;
       }

       public Builder postion(int postion) {
            this.postion = postion;
           return this;
       }

       public Builder count(int count) {
            this.count = count;
           return this;
       }

       public Builder color(String color) {
            this.color = color;
           return this;
       }

       public Builder size(String size) {
            this.size = size;
           return this;
       }

       public Builder goodsImg(int goodsImg) {
            this.goodsImg = goodsImg;
           return this;
       }

       public Builder buyNum(int buyNum) {
            this.buyNum = buyNum;
           return this;
       }

       public GoodsInfo build(){
            return  new GoodsInfo(this);
        }

    }
}
