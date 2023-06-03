package com.springboot05ems.entity;

import java.io.Serializable;

/**
 * (HxYuangong)实体类
 *
 * @author makejava
 * @since 2023-05-07 16:56:59
 */
public class HxYuangong implements Serializable {
    private static final long serialVersionUID = -41969222959042385L;
    /**
     * 操作员ID
     */
    private String id;
    /**
     * 操作员名称
     */
    private String name;
    /**
     * 操作员部门
     */
    private String department;
    /**
     * 操作员权限（01最大权限，02上传下载，03查询）
     */
    private String quanxian;
    /**
     * 记录状态（01表示有效 C为注销）
     */
    private String jlzt;
    /**
     * 操作员登录密码
     */
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getQuanxian() {
        return quanxian;
    }

    public void setQuanxian(String quanxian) {
        this.quanxian = quanxian;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

