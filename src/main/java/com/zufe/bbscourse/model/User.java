package com.zufe.bbscourse.model;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private long userId;
    private String username;
    private String password;
    private int roles;
    private String college;
    private String profession;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoles() {
        return roles;
    }

    public void setRoles(int roles) {
        this.roles = roles;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean isEnabled() {
        // return this.activated == 1 ? true : false;
        return true;
    }

    public Set<String> getRolesSet() {
        if (roles == 0) {
            return null;
        }
        return null;
        // return Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(getRoles().split(","))));
    }
}
