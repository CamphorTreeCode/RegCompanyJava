package com.woman.pojo;

import java.io.Serializable;

public class text implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column text.textId
     *
     * @mbggenerated
     */
    private Integer textid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column text.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column text.createTime
     *
     * @mbggenerated
     */
    private String createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column text.context
     *
     * @mbggenerated
     */
    private String context;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table text
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column text.textId
     *
     * @return the value of text.textId
     *
     * @mbggenerated
     */
    public Integer getTextid() {
        return textid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column text.textId
     *
     * @param textid the value for text.textId
     *
     * @mbggenerated
     */
    public void setTextid(Integer textid) {
        this.textid = textid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column text.type
     *
     * @return the value of text.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column text.type
     *
     * @param type the value for text.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column text.createTime
     *
     * @return the value of text.createTime
     *
     * @mbggenerated
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column text.createTime
     *
     * @param createtime the value for text.createTime
     *
     * @mbggenerated
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column text.context
     *
     * @return the value of text.context
     *
     * @mbggenerated
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column text.context
     *
     * @param context the value for text.context
     *
     * @mbggenerated
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        text other = (text) that;
        return (this.getTextid() == null ? other.getTextid() == null : this.getTextid().equals(other.getTextid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getContext() == null ? other.getContext() == null : this.getContext().equals(other.getContext()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTextid() == null) ? 0 : getTextid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getContext() == null) ? 0 : getContext().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", textid=").append(textid);
        sb.append(", type=").append(type);
        sb.append(", createtime=").append(createtime);
        sb.append(", context=").append(context);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}