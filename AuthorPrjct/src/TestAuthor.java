
public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Mike", "Mike@post.ru", 'M');
        Author a2 = new Author("Ann", "A@dot.ru", 'F');
        a2.setEmail("a@dog.com");
        System.out.println(a1);
        System.out.println(a2);

    }
}
