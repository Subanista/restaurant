package com.Restaurant.restaurant.dto;

public class restaurantUpdateDTO {
    private int restaurantid;
    private String restaurantname;
    private int mobile;
    private String address;

    public restaurantUpdateDTO(int restaurantid, String restaurantname, int mobile, String address) {
        this.restaurantid = restaurantid;
        this.restaurantname = restaurantname;
        this.mobile = mobile;
        this.address = address;
    }

    public restaurantUpdateDTO() {
    }

    public int getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(int restaurantid) {
        this.restaurantid = restaurantid;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "restaurantDto{" +
                "restaurantid=" + restaurantid +
                ", restaurantname='" + restaurantname + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                '}';
    }

}
