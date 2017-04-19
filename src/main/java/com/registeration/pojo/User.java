package com.registeration.pojo;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by nara1016 on 10-04-2017.
 */
@Entity
@Table(name = "registered_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long UserId;
    private String password;
    private String name;
    private String email;
    private Date dob;
    private BigInteger phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() { return email;    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getUserId() { return UserId;  }

    public void setUserId(long userId) {      UserId = userId;   }

    public String getPassword() {      return password;    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() { return dob; }

    public void setDob(Date dob) {  this.dob = dob;  }

    public BigInteger getPhoneNumber() {    return phoneNumber;    }

    public void setPhoneNumber(BigInteger phoneNumber) {    this.phoneNumber = phoneNumber;    }

    public User() {    }

}
