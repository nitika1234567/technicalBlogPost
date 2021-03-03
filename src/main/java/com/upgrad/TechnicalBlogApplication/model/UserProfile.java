package com.upgrad.TechnicalBlogApplication.model;

import javax.persistence.*;

@Entity
@Table(name="user_profile")
public class UserProfile {
    public UserProfile()
    {
        System.out.println("user profile");
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name="id")
private Integer id;



    @Column(name="full_name")

    private  String fullname;



    @Column(name="email_address")
    private String email;


    @Column(name="mobile_number")
    private String mobileNumber;



    @Column(name="gender")
    private String gender;


    @Column(name="address")
    private String address;



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
