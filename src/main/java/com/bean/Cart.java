package com.bean;

import java.util.Date;

public class Cart {
    private Integer pid;

    private String name;

    private String src;

    private Long price;

    private Integer inventory;

    private Date addcarttime;

    private Integer paynum;

    private Integer selectedstatus;

    private String userid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Date getAddcarttime() {
        return addcarttime;
    }

    public void setAddcarttime(Date addcarttime) {
        this.addcarttime = addcarttime;
    }

    public Integer getPaynum() {
        return paynum;
    }

    public void setPaynum(Integer paynum) {
        this.paynum = paynum;
    }

    public Integer getSelectedstatus() {
        return selectedstatus;
    }

    public void setSelectedstatus(Integer selectedstatus) {
        this.selectedstatus = selectedstatus;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}