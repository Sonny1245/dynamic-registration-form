package com.sonny.java.lc.api;

public class UserRegDTO {
    
    private String name;
    private String userName;
    private char[] password;
    private String countries;
    private String[] hobbies;
    private String gender;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public char[] getPassword() {
        return password;
    }
    public void setPassword(char[] password) {
        this.password = password;
    }
    public String getCountries() {
        return countries;
    }
    public void setCountries(String countries) {
        this.countries = countries;
    }
    public String[] getHobbies() {
        return hobbies;
    }
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    

}
