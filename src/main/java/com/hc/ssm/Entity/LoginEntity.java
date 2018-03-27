package com.hc.ssm.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/27.
 * 登录的数据表
 */
@Entity
@Table(name = "")
public class LoginEntity implements Serializable {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;


}
