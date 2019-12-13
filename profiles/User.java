package com.greekk.hometask5.profiles;

import java.util.Objects;

public class User {

    private String login;
    private String password;
    private String role;

    //constructors
    public User(){
    }
    public User(String login){
        this.login = login;
    }

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, String role){
        this.login = login;
        this.password = password;
        this.role = role;
    }

    //setters
    public void setLogin(String login){
        if(login.length() < 5){
            System.out.println("Login must contain at least five symbols!");
            return;
        }
        this.login = login;
    }

    public void setPassword(String password){
        if(password.length() < 8){
            System.out.println("Password must contain at least eight symbols!");
            return;
        }
        this.password = password;
    }

    public void setRole(String role){
        boolean eq = "admin".equals(role) || "user".equals(role);
        if(!eq){
            System.out.println("Role should be either \"admin\" or \"user\"!");
            return;
        }
        this.role = role;
    }

    //getters
    public String getLogin(){
        return this.login;
    }
    public String getPassword(){
        return this.password;
    }
    public String getRole(){
        return this.role;
    }

    //overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) &&
                password.equals(user.password) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, role);
    }

    @Override
    public String toString(){
        return "user login:" + this.login + "\n user role: " + this.role;
    }
}
