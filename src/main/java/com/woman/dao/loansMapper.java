package com.woman.dao;

import com.woman.pojo.loans;

public interface loansMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loans
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer loansid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loans
     *
     * @mbggenerated
     */
    int insert(loans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loans
     *
     * @mbggenerated
     */
    int insertSelective(loans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loans
     *
     * @mbggenerated
     */
    loans selectByPrimaryKey(Integer loansid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loans
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(loans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loans
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(loans record);
}