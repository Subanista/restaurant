package com.Restaurant.restaurant.dto;

public class restaurantSaveDTO {


    private String restaurantname;
    private int mobile;
    private String address;

    public restaurantSaveDTO( String restaurantname, int mobile, String address) {
        this.restaurantname = restaurantname;
        this.mobile = mobile;
        this.address = address;
    }

    public restaurantSaveDTO() {
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

                ", restaurantname='" + restaurantname + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                '}';
    }

}
