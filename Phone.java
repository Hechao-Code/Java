package com.hc.Test02;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.Objects;

/**
 * @Auther: HeChao
 * @Date: 2021/9/22 - 09 - 22 - 10:46
 * @Description: com.hc.Test02
 * @version: 1.0
 */
public class Phone {//手机类
    //属性
    private String brand ;//手机品牌
    private double price ;//手机价格
    private int year ;//出产年份
    //构造器
    public Phone() {
    }
    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }
    //set get方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //方法
    //对equals方法不满意，对方法进行重写
    /*public boolean equals(Object obj) { //P1=this P2=obj
        if(obj instanceof Phone){
            Phone other = (Phone)obj;
            if(this.getBrand()==other.getBrand()&&this.getPrice()==other.getPrice()&&this.getYear()==other.getYear()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 &&
                year == phone.year &&
                Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}

