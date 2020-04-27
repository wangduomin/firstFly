package com.travefly.cn.model;

import java.util.Date;

public class FirstFly {

    private String userName;
    private int id;
    private double money;
    private Date createDate;
    private boolean sex;

    public FirstFly(String userName, int id, double money, Date createDate, boolean sex) {
        this.userName = userName;
        this.id = id;
        this.money = money;
        this.createDate = createDate;
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override public String toString() {
        return "FirstFly{" + "userName='" + userName + '\'' + ", id=" + id + ", money=" + money
            + ", createDate=" + createDate + ", sex=" + sex + '}';
    }
}
