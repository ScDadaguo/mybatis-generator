package com.mybatis.demo.mapper;

import com.mybatis.demo.entity.Menu;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("itemid") Integer itemid, @Param("storeid") Integer storeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated
     */
    int insert(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated
     */
    Menu selectByPrimaryKey(@Param("itemid") Integer itemid, @Param("storeid") Integer storeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated
     */
    List<Menu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Menu record);
}