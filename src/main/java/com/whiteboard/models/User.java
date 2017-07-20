package com.whiteboard.models;

import java.util.Date;

public class User {
    private int id;
    private String email;
    private String password;
    private String permission; // admin, professor, student
    private Account account = new Account();
    private Date createdAt;
    private Date updatedAt;

    public User() {
        setAccount(new Account());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acccount) {
        this.account = account;
        account.setUser(this);
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}