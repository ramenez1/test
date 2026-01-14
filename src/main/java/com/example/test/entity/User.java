//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


@TableName("st_user")
public class User implements Serializable {
    private static final long serialVersionUID = 4398649106711709696L;
    public static final String PRINCIPAL_ATTRIBUTE_NAME = User.class.getName() + ".PRINCIPAL";
    private int id;
    private String uid;
    private String username;
    private String passwd;
    private String role;
    private String c_time;
    private String name;
    private String sex;
    private String prof;
    private String college;
    private String professional;
    private String u_class;
    private String phone;
    private String org_id;
    private String org_name;
    private String session_id;
    private int limit;
    private int offset;

    public String getOrg_id() {
        return this.org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return this.org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getC_time() {
        return this.c_time;
    }

    public void setC_time(String c_time) {
        this.c_time = c_time;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProf() {
        return this.prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getCollege() {
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getProfessional() {
        return this.professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getU_class() {
        return this.u_class;
    }

    public void setU_class(String u_class) {
        this.u_class = u_class;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public int getLimit() {
        return this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + (this.uid == null ? 0 : this.uid.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            User other = (User)obj;
            if (this.uid == null) {
                if (other.uid != null) {
                    return false;
                }
            } else if (!this.uid.equals(other.uid)) {
                return false;
            }

            return true;
        }
    }
}
