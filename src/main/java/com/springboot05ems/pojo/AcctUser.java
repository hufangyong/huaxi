package com.springboot05ems.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//客户类类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcctUser {
    private Integer id;
    private String acctName;
    private Integer gender;//性别01女 02男
    private String age;//年龄
    private String phone;//电话号码
    private String zhiYe;
    private String gongZuoDi;
    private String book;//证书信息,存储证书的相对路径信息
    //01：骨科  02：内科  03：外科。。。。
    private Integer keshi;//科室
    //是否验证0：否 1：是
    private String bookType;
    // @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date birth;//录入日期
   //客户来源  01：微信  02：手动录入
    private String laiYuan;
   private Date rzsj;//认证时间



    public void setKeshi(Integer keshi) {
        this.keshi = keshi;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLaiYuan() {
        return laiYuan;
    }

    public void setLaiYuan(String laiYuan) {
        this.laiYuan = laiYuan;
    }

    public Date getRzsj() {
        return rzsj;
    }

    public void setRzsj(Date rzsj) {
        this.rzsj = rzsj;
    }


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getZhiYe() {
        return zhiYe;
    }

    public void setZhiYe(String zhiYe) {
        this.zhiYe = zhiYe;
    }

    public String getGongZuoDi() {
        return gongZuoDi;
    }

    public void setGongZuoDi(String gongZuoDi) {
        this.gongZuoDi = gongZuoDi;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
