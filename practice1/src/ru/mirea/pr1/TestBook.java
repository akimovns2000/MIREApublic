package ru.mirea.pr1;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("The Written","Mike", "Mike@post.ru", 'M');
        System.out.println(b1);
        b1.setEmail("a@dog.com");
        System.out.println(b1);
    }
}


