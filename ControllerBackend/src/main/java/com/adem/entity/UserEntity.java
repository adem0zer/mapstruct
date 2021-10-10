package com.adem.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "application_user")
public class UserEntity {
    @Id
    @Basic
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "user_name")
    private String userName;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "create_date")
    private Date createDate;

    @Basic
    @Column(name = "create_user")
    private int createUser;

    @Basic
    @Column(name = "update_date")
    private Date updateDate;

    @Basic
    @Column(name = "update_user")
    private int updateUser;
}
