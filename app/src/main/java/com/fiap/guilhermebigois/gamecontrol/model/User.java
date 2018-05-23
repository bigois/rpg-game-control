package com.fiap.guilhermebigois.gamecontrol.model;

import java.io.Serializable;

public class User implements Serializable{
    private String nickname;
    private String email;
    
    public User() {}
    
    public User(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
