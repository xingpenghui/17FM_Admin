package com.feri.pojo;

import java.util.Date;

public class Goods {
    private Integer id;

    private String name;

    private Integer tid;

    private String pubdate;

    private String dowdate;

    private Date createtime;

    private Long price;

    private Integer star;

    private String picurl;

    private Integer flag;

    private Integer uid;

    private String info;

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getDowdate() {
        return dowdate;
    }

    public void setDowdate(String dowdate) {
        this.dowdate = dowdate;
    }
//    public Date getPubdate() {
//        return pubdate;
//    }
//
//    public void setPubdate(Date pubdate) {
//        this.pubdate = pubdate;
//    }
//
//    public Date getDowdate() {
//        return dowdate;
//    }
//
//    public void setDowdate(Date dowdate) {
//        this.dowdate = dowdate;
//    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}