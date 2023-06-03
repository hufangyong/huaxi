package com.springboot05ems.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//科室类
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdministrativeOffice {
    private Integer id;
    private String administrative;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdministrative() {
        return administrative;
    }

    public void setAdministrative(String administrative) {
        this.administrative = administrative;
    }
}
