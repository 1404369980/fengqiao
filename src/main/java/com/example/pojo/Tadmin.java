package com.example.pojo;

import java.util.Date;

public class Tadmin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_INFO.TADMIN.ADMINID
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    private Long adminid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_INFO.TADMIN.ADMINPWD
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    private String adminpwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_INFO.TADMIN.ADMINNAME
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    private String adminname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_INFO.TADMIN.ADMINADDTIME
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    private Date adminaddtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_INFO.TADMIN.ADMINID
     *
     * @return the value of USER_INFO.TADMIN.ADMINID
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public Long getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_INFO.TADMIN.ADMINID
     *
     * @param adminid the value for USER_INFO.TADMIN.ADMINID
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_INFO.TADMIN.ADMINPWD
     *
     * @return the value of USER_INFO.TADMIN.ADMINPWD
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public String getAdminpwd() {
        return adminpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_INFO.TADMIN.ADMINPWD
     *
     * @param adminpwd the value for USER_INFO.TADMIN.ADMINPWD
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_INFO.TADMIN.ADMINNAME
     *
     * @return the value of USER_INFO.TADMIN.ADMINNAME
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_INFO.TADMIN.ADMINNAME
     *
     * @param adminname the value for USER_INFO.TADMIN.ADMINNAME
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_INFO.TADMIN.ADMINADDTIME
     *
     * @return the value of USER_INFO.TADMIN.ADMINADDTIME
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public Date getAdminaddtime() {
        return adminaddtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_INFO.TADMIN.ADMINADDTIME
     *
     * @param adminaddtime the value for USER_INFO.TADMIN.ADMINADDTIME
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void setAdminaddtime(Date adminaddtime) {
        this.adminaddtime = adminaddtime;
    }
}