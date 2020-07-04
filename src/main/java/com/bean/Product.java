package com.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * product
 * @author 
 */
public class Product implements Serializable {
    private Integer id;

    private String name;

    private String src;

    private Long price;

    private String typename;

    private String iscart;

    private Integer inventory;

    private String tag;

    private Integer paynum;

    private Date addcarttime;

    private Integer selectedstatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getIscart() {
        return iscart;
    }

    public void setIscart(String iscart) {
        this.iscart = iscart;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getPaynum() {
        return paynum;
    }

    public void setPaynum(Integer paynum) {
        this.paynum = paynum;
    }

    public Date getAddcarttime() {
        return addcarttime;
    }

    public void setAddcarttime(Date addcarttime) {
        this.addcarttime = addcarttime;
    }

    public Integer getSelectedstatus() {
        return selectedstatus;
    }

    public void setSelectedstatus(Integer selectedstatus) {
        this.selectedstatus = selectedstatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSrc() == null ? other.getSrc() == null : this.getSrc().equals(other.getSrc()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTypename() == null ? other.getTypename() == null : this.getTypename().equals(other.getTypename()))
            && (this.getIscart() == null ? other.getIscart() == null : this.getIscart().equals(other.getIscart()))
            && (this.getInventory() == null ? other.getInventory() == null : this.getInventory().equals(other.getInventory()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getPaynum() == null ? other.getPaynum() == null : this.getPaynum().equals(other.getPaynum()))
            && (this.getAddcarttime() == null ? other.getAddcarttime() == null : this.getAddcarttime().equals(other.getAddcarttime()))
            && (this.getSelectedstatus() == null ? other.getSelectedstatus() == null : this.getSelectedstatus().equals(other.getSelectedstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSrc() == null) ? 0 : getSrc().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTypename() == null) ? 0 : getTypename().hashCode());
        result = prime * result + ((getIscart() == null) ? 0 : getIscart().hashCode());
        result = prime * result + ((getInventory() == null) ? 0 : getInventory().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getPaynum() == null) ? 0 : getPaynum().hashCode());
        result = prime * result + ((getAddcarttime() == null) ? 0 : getAddcarttime().hashCode());
        result = prime * result + ((getSelectedstatus() == null) ? 0 : getSelectedstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", src=").append(src);
        sb.append(", price=").append(price);
        sb.append(", typename=").append(typename);
        sb.append(", iscart=").append(iscart);
        sb.append(", inventory=").append(inventory);
        sb.append(", tag=").append(tag);
        sb.append(", paynum=").append(paynum);
        sb.append(", addcarttime=").append(addcarttime);
        sb.append(", selectedstatus=").append(selectedstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}