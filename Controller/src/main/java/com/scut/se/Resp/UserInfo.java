package com.scut.se.Resp;

public class UserInfo {
    private boolean sex;
    private String name;
    private int id;
    private int age;

    public UserInfo() {
    }

    public UserInfo(boolean sex, String name, int id, int age) {
        this.sex = sex;
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
