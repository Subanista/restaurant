package com.Restaurant.restaurant.entity;


import javax.persistence.*;

@Table(name="restaurant")
public class restaurant {
    @Id
    @Column(name= "Restaurant_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int restaurantid;

    @Column(name= "Restaurant_name", length = 50)
    private String restaurantname;

    @Column(name= "mobile", length = 12)
    private int mobile;
    @Column(name= "Restaurant_address", length = 60)
    private String address;

    public restaurant(int restaurantid, String restaurantname, int mobile, String address) {
        this.restaurantid = restaurantid;
        this.restaurantname = restaurantname;
        this.mobile = mobile;
        this.address = address;
    }

    public restaurant(String restaurantname, int mobile, String address) {
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
        return "restaurant{" +
                "restaurantid=" + restaurantid +
                ", restaurantname='" + restaurantname + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                '}';
    }
}
