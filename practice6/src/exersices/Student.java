package exersices;

public class Student implements Comparable<Student> {
    private int ID;
    private String name;

    public Student(int id, String n) {
        ID = id;
        name = n;
    }

    public Student(String n) {
        ID = 0;
        name = n;
    }

    public int compareTo(Student s) {
        return (ID - s.ID);
    }

    public void Set(int id, String n) {
        ID = id;
        name = n;
    }

    public String GetName(){return(name);}

    public int GetID(){return(ID);}

    public String toString(){return(name + " " + ID);}
}