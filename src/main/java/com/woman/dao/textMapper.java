package com.woman.dao;

import com.woman.pojo.text;

public interface textMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer textid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    int insert(text record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    int insertSelective(text record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    text selectByPrimaryKey(Integer textid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(text record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(text record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(text record);
}