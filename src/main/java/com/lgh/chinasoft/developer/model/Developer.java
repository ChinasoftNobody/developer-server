package com.lgh.chinasoft.developer.model;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class Developer implements Serializable{
    private String account;
    private String name;
    private String email;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
