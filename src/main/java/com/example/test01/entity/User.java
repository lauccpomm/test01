package com.example.test01.entity;

import lombok.Data;

@Data
public class User extends Person {

    private int id;
    private String userName;
    private int passWord;
    private String dept;

}
