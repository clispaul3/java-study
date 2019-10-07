package com.zyb.dao;

import java.util.List;
import java.util.Map;

public class User {
    private String username;
    private int age;
    private String email;
    private boolean gender;
    private IDCard card;
    private List<User> friends;
    private Map<String,Object> hobbies;
    public User(){}
    public User(String username){
        this.username = username;
    }
    public User(String username,int age){
        this.username = username;
        this.age = age;
    }
    public String getUsername() {
        return username;
    }
    public User(Boolean gender,int age){
        this.gender = gender;
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public IDCard getCard() {
        return card;
    }

    public void setCard(IDCard card) {
        this.card = card;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public Map<String, Object> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Map<String, Object> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", card=" + card +
                ", friends=" + friends +
                ", hobbies=" + hobbies +
                '}';
    }
}
