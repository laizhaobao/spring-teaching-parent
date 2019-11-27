package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author cj
 * @date 2019/11/25
 */
@Data
public class EmployeeEntity {

    private Integer id;
    private String username;
    private Date hiredate;
}
