package ru.mirea.pr2;


public class Author {
    private String name;
    private String email;
    private char gender='U';

    public Author(String n, String e, char g){
        name=n;
        email=e;
        gender=g;
    };

    public void setEmail(String e){
        email=e;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public String toString() {
        return name + "(" + gender +")" + " at " + email;
    }

}

