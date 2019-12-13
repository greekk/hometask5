package com.greekk.hometask5.profiles;

import java.util.Objects;

public class Profile {
    //fields
    private String firstName;
    private String lastName;
    private int age;
    private User user;

    //setters
    public void setFirstName(String firstName) {
        if(!firstName.equals("")){
            this.firstName = firstName;
        }
        else{
            System.out.println("The First Name shouldn't be empty!");
        }
    }

    public void setLastName(String lastName) {
        if(!lastName.equals("")){
            this.lastName = lastName;
        }
        else{
            System.out.println("The Second Name shouldn't be empty!");
        }
    }

    public void setAge(int age) {
        boolean isValid = (age >= 0);
        if(isValid){
            this.age = age;
        }
        else{
            System.out.println("The age shouldn't be less than zero!");
        }
    }

    public void setUser(User user) {
        if(Objects.nonNull(user)){
            this.user = user;
        }
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public User getUser() {
        return user;
    }

    //constructors
    public Profile(){ }

    public Profile(String firstName){
        this.firstName = firstName;
    }

    public Profile(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Profile(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Profile(String firstName, String lastName, int age, User user){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.user = user;
    }

    //overrides
    @Override
    public String toString() {
        String profile = "\nfirst name: " + this.firstName
                + "\n last name: " + this.lastName + "" +
                "\n age: " + this.age + "\n "
            + this.user.toString() + "\n<-------------------------->";
        return profile;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Profile profile = (Profile)o;
        return firstName.equals(profile.firstName) &&
        lastName.equals(profile.lastName) &&
        age == profile.age &&
        user.equals(profile.user);
    }
}
