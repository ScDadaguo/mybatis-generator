package com.mybatis.demo.entity;

import java.util.Date;

public class Upfile {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upFile.filename
     *
     * @mbg.generated
     */
    private String filename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upFile.teachClassId
     *
     * @mbg.generated
     */
    private Integer teachclassid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upFile.teacherId
     *
     * @mbg.generated
     */
    private Integer teacherid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upFile.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upFile.filename
     *
     * @return the value of upFile.filename
     * @mbg.generated
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upFile.filename
     *
     * @param filename the value for upFile.filename
     * @mbg.generated
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upFile.teachClassId
     *
     * @return the value of upFile.teachClassId
     * @mbg.generated
     */
    public Integer getTeachclassid() {
        return teachclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upFile.teachClassId
     *
     * @param teachclassid the value for upFile.teachClassId
     * @mbg.generated
     */
    public void setTeachclassid(Integer teachclassid) {
        this.teachclassid = teachclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upFile.teacherId
     *
     * @return the value of upFile.teacherId
     * @mbg.generated
     */
    public Integer getTeacherid() {
        return teacherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upFile.teacherId
     *
     * @param teacherid the value for upFile.teacherId
     * @mbg.generated
     */
    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upFile.createTime
     *
     * @return the value of upFile.createTime
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upFile.createTime
     *
     * @param createtime the value for upFile.createTime
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}