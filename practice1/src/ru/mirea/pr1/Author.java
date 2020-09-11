package ru.mirea.pr1;

public class Author {
    private String aname;
    private String email;
    private char gender='U';

    public Author(){};

    public Author(String n, String e, char g){
        aname=n;
        email=e;
        gender=g;
    };

    public void setEmail(String e){
        email=e;
    }

    public String getAname(){
        return aname;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public String toString() {
        return aname + "(" + gender +")" + " at " + email;
    }

}

