package com.test.springbootfreemark.pojo;

public class Users {
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFel() {
        return fel;
    }

    public void setFel(String fel) {
        this.fel = fel;
    }

    public Users(String age, String sex, String fel) {
        this.age = age;
        this.sex = sex;
        this.fel = fel;
    }

    public Users(){

    }

    private String age;
    private String sex;
    private String fel;
}
