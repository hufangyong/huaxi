package com.springboot05ems.entity;

import java.io.Serializable;

/**
 * (HxDepartment)实体类
 *
 * @author makejava
 * @since 2023-05-07 23:31:07
 */
public class HxDepartment implements Serializable {
    private static final long serialVersionUID = 475926582863404776L;
    /**
     * 部门id
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 部门状态（01为有效）
     */
    private String departmentStatus;


    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentStatus() {
        return departmentStatus;
    }

    public void setDepartmentStatus(String departmentStatus) {
        this.departmentStatus = departmentStatus;
    }

}

