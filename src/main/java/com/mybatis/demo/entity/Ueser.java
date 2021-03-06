package com.mybatis.demo.entity;

import java.util.Date;

public class Ueser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ueser.ueserid
     *
     * @mbg.generated
     */
    private String ueserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ueser.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ueser.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ueser.passWord
     *
     * @mbg.generated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ueser.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ueser.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ueser.userimg
     *
     * @mbg.generated
     */
    private String userimg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ueser.ueserid
     *
     * @return the value of Ueser.ueserid
     * @mbg.generated
     */
    public String getUeserid() {
        return ueserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ueser.ueserid
     *
     * @param ueserid the value for Ueser.ueserid
     * @mbg.generated
     */
    public void setUeserid(String ueserid) {
        this.ueserid = ueserid == null ? null : ueserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ueser.username
     *
     * @return the value of Ueser.username
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ueser.username
     *
     * @param username the value for Ueser.username
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ueser.nickname
     *
     * @return the value of Ueser.nickname
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ueser.nickname
     *
     * @param nickname the value for Ueser.nickname
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ueser.passWord
     *
     * @return the value of Ueser.passWord
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ueser.passWord
     *
     * @param password the value for Ueser.passWord
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ueser.email
     *
     * @return the value of Ueser.email
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ueser.email
     *
     * @param email the value for Ueser.email
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ueser.createTime
     *
     * @return the value of Ueser.createTime
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ueser.createTime
     *
     * @param createtime the value for Ueser.createTime
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ueser.userimg
     *
     * @return the value of Ueser.userimg
     * @mbg.generated
     */
    public String getUserimg() {
        return userimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ueser.userimg
     *
     * @param userimg the value for Ueser.userimg
     * @mbg.generated
     */
    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    @Override
    public String toString() {
        return "Ueser{" +
                "ueserid='" + ueserid + '\'' +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createtime=" + createtime +
                ", userimg='" + userimg + '\'' +
                '}';
    }
}