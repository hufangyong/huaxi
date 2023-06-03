package com.springboot05ems.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (HxCustom)实体类
 *
 * @author makejava
 * @since 2023-05-01 02:51:07
 */
public class HxCustom implements Serializable {
    private static final long serialVersionUID = 483860651079318814L;
    /**
     * 证书存储地址
     */
    private String hxBook;
    /**
     * 工作地
     */
    private String hxGonghzuodi;
    /**
     * 职业名称
     */
    private String hxZhiyeName;
    /**
     * 职业id
     */
    private String hxZhiyeId;
    /**
     * 电话
     */
    private String hxPhone;
    /**
     * 年龄
     */
    private String hxAge;
    /**
     * 性别
     */
    private String hxGender;
    /**
     * 客户名称
     */
    private String hxCustomName;
    /**
     * 记录状态
     */
    private String hxJlzt;
    /**
     * 认证时间
     */
    private Date hxRzsg;
    /**
     * 信息来源（01微信端，02手动）
     */
    private String hxLaiyuan;
    /**
     * 录入时间日期
     */
    private Date hxBirth;
    /**
     * 是否验证（0：否 1：是）
     */
    private String hxBooktype;
    /**
     * 科室（医生）
     */
    private String hxKehsi;
    /**
     * 客户id
     */
    private String hx_hxCustomId;


    public String getHxBook() {
        return hxBook;
    }

    public void setHxBook(String hxBook) {
        this.hxBook = hxBook;
    }

    public String getHxGonghzuodi() {
        return hxGonghzuodi;
    }

    public void setHxGonghzuodi(String hxGonghzuodi) {
        this.hxGonghzuodi = hxGonghzuodi;
    }

    public String getHxZhiyeName() {
        return hxZhiyeName;
    }

    public void setHxZhiyeName(String hxZhiyeName) {
        this.hxZhiyeName = hxZhiyeName;
    }

    public String getHxZhiyeId() {
        return hxZhiyeId;
    }

    public void setHxZhiyeId(String hxZhiyeId) {
        this.hxZhiyeId = hxZhiyeId;
    }

    public String getHxPhone() {
        return hxPhone;
    }

    public void setHxPhone(String hxPhone) {
        this.hxPhone = hxPhone;
    }

    public String getHxAge() {
        return hxAge;
    }

    public void setHxAge(String hxAge) {
        this.hxAge = hxAge;
    }

    public String getHxGender() {
        return hxGender;
    }

    public void setHxGender(String hxGender) {
        this.hxGender = hxGender;
    }

    public String getHxCustomName() {
        return hxCustomName;
    }

    public void setHxCustomName(String hxCustomName) {
        this.hxCustomName = hxCustomName;
    }

    public String getHxJlzt() {
        return hxJlzt;
    }

    public void setHxJlzt(String hxJlzt) {
        this.hxJlzt = hxJlzt;
    }

    public Date getHxRzsg() {
        return hxRzsg;
    }

    public void setHxRzsg(Date hxRzsg) {
        this.hxRzsg = hxRzsg;
    }

    public String getHxLaiyuan() {
        return hxLaiyuan;
    }

    public void setHxLaiyuan(String hxLaiyuan) {
        this.hxLaiyuan = hxLaiyuan;
    }

    public Date getHxBirth() {
        return hxBirth;
    }

    public void setHxBirth(Date hxBirth) {
        this.hxBirth = hxBirth;
    }

    public String getHxBooktype() {
        return hxBooktype;
    }

    public void setHxBooktype(String hxBooktype) {
        this.hxBooktype = hxBooktype;
    }

    public String getHxKehsi() {
        return hxKehsi;
    }

    public void setHxKehsi(String hxKehsi) {
        this.hxKehsi = hxKehsi;
    }

    public String getHx_hxCustomId() {
        return hx_hxCustomId;
    }

    public void setHx_hxCustomId(String hx_hxCustomId) {
        this.hx_hxCustomId = hx_hxCustomId;
    }

}

