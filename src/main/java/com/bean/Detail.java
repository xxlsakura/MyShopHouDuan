package com.bean;

import java.io.Serializable;

/**
 * detail
 * @author 
 */
public class Detail implements Serializable {
    private Integer id;

    private String name;

    private Long price;

    private String ssrc1;

    private String ssrc2;

    private String ssrc3;

    private String dsrc1;

    private String dsrc2;

    private String dsrc3;

    private String vsrc;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getSsrc1() {
        return ssrc1;
    }

    public void setSsrc1(String ssrc1) {
        this.ssrc1 = ssrc1;
    }

    public String getSsrc2() {
        return ssrc2;
    }

    public void setSsrc2(String ssrc2) {
        this.ssrc2 = ssrc2;
    }

    public String getSsrc3() {
        return ssrc3;
    }

    public void setSsrc3(String ssrc3) {
        this.ssrc3 = ssrc3;
    }

    public String getDsrc1() {
        return dsrc1;
    }

    public void setDsrc1(String dsrc1) {
        this.dsrc1 = dsrc1;
    }

    public String getDsrc2() {
        return dsrc2;
    }

    public void setDsrc2(String dsrc2) {
        this.dsrc2 = dsrc2;
    }

    public String getDsrc3() {
        return dsrc3;
    }

    public void setDsrc3(String dsrc3) {
        this.dsrc3 = dsrc3;
    }

    public String getVsrc() {
        return vsrc;
    }

    public void setVsrc(String vsrc) {
        this.vsrc = vsrc;
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
        Detail other = (Detail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSsrc1() == null ? other.getSsrc1() == null : this.getSsrc1().equals(other.getSsrc1()))
            && (this.getSsrc2() == null ? other.getSsrc2() == null : this.getSsrc2().equals(other.getSsrc2()))
            && (this.getSsrc3() == null ? other.getSsrc3() == null : this.getSsrc3().equals(other.getSsrc3()))
            && (this.getDsrc1() == null ? other.getDsrc1() == null : this.getDsrc1().equals(other.getDsrc1()))
            && (this.getDsrc2() == null ? other.getDsrc2() == null : this.getDsrc2().equals(other.getDsrc2()))
            && (this.getDsrc3() == null ? other.getDsrc3() == null : this.getDsrc3().equals(other.getDsrc3()))
            && (this.getVsrc() == null ? other.getVsrc() == null : this.getVsrc().equals(other.getVsrc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSsrc1() == null) ? 0 : getSsrc1().hashCode());
        result = prime * result + ((getSsrc2() == null) ? 0 : getSsrc2().hashCode());
        result = prime * result + ((getSsrc3() == null) ? 0 : getSsrc3().hashCode());
        result = prime * result + ((getDsrc1() == null) ? 0 : getDsrc1().hashCode());
        result = prime * result + ((getDsrc2() == null) ? 0 : getDsrc2().hashCode());
        result = prime * result + ((getDsrc3() == null) ? 0 : getDsrc3().hashCode());
        result = prime * result + ((getVsrc() == null) ? 0 : getVsrc().hashCode());
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
        sb.append(", price=").append(price);
        sb.append(", ssrc1=").append(ssrc1);
        sb.append(", ssrc2=").append(ssrc2);
        sb.append(", ssrc3=").append(ssrc3);
        sb.append(", dsrc1=").append(dsrc1);
        sb.append(", dsrc2=").append(dsrc2);
        sb.append(", dsrc3=").append(dsrc3);
        sb.append(", vsrc=").append(vsrc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}