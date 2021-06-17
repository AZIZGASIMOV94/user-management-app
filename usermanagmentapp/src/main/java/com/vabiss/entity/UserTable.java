package com.vabiss.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_table")
public class UserTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @Column(name = "username")

    private String username;

    @Basic(optional = false)
    @Column(name = "password")
    private String password;


    public UserTable() {
    }

    public UserTable(Integer id) {
        this.id = id;
    }

    public UserTable(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTable userTable = (UserTable) o;

        if (!id.equals(userTable.id)) return false;
        if (username != null ? !username.equals(userTable.username) : userTable.username != null) return false;
        return password != null ? password.equals(userTable.password) : userTable.password == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "username: " + username+" password: " + password;
    }
}
