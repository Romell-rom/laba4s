package ru.mirea.laba4;

public class Author {
String name;
String Email;
char gender;


    public Author(String name,String Email,char gender){
        this.Email = Email;
        this.gender = gender;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
