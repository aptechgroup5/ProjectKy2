/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group5.onlinephamacy.Model.User;

/**
 *
 * @author Chung
 */
public class UserMODEL {
    private String Username;
    private String Password;
    private String Fullname;
    private int Role;
    private int Gender;
    private String Birthdate;
    private String Address;
    private String Phone;
    private String Email;
    private String Question;
    private String Anwser;

    public UserMODEL() {
    }

    public UserMODEL(String Username, String Password, String Fullname, int Role, int Gender, String Birthdate, String Address, String Phone, String Email, String Question, String Anwser) {
        this.Username = Username;
        this.Password = Password;
        this.Fullname = Fullname;
        this.Role = Role;
        this.Gender = Gender;
        this.Birthdate = Birthdate;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.Question = Question;
        this.Anwser = Anwser;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int Role) {
        this.Role = Role;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int Gender) {
        this.Gender = Gender;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getAnwser() {
        return Anwser;
    }

    public void setAnwser(String Anwser) {
        this.Anwser = Anwser;
    }
    
    
}
