package com.vabiss.dto;

import com.vabiss.entity.UserTable;

import java.util.Optional;

public class UserTableDTO {

    private String username;
    private String password;

    public UserTableDTO() {
    }

    public UserTableDTO(Optional<UserTable> user) {
    }

    public UserTableDTO(UserTable u){
        this.username = u.getUsername();
        //this.password = u.getPassword();
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
}
