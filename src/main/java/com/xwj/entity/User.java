package com.xwj.entity;

public class User {
    private int id;
    private City city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public User(int id, City city) {
        this.id = id;
        this.city = city;
    }

    public User(Integer id, Integer cityid){
        this.id = id;
        if(cityid==1){
            this.city = City.CD;
        }else {
            this.city = City.SC;
        }
    }
    public User(Integer id, String city){
        this.id = id;
        if("cd".equals(city)){
            this.city = City.CD;
        }else {
            this.city = City.SC;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", city=" + city +
                '}';
    }
}
