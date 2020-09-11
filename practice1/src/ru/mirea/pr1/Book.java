package ru.mirea.pr1;

public class Book extends Author {
    private String name;

    public Book(String n, String an, String e, char g){
        super(an, e, g);
        name=n;
    }

    public String getName(){
        return(name);
    }

    public String toString() {
        return name + "\nAuthor: " + super.toString(); /*this.getAname() + "(" + this.getEmail() +")" + " at " + email*/
    }
}
