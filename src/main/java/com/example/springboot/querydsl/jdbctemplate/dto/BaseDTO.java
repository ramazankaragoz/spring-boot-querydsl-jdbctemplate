package com.example.springboot.querydsl.jdbctemplate.dto;

import java.io.Serializable;

/**
 * @author Ramazan Karagöz
 * @date 9/12/2019
 */

public class BaseDTO <ID extends Serializable> {

    private ID id;

    protected BaseDTO(){
        this.id=null;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

}
