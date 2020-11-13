package exersices;

import java.util.Arrays;
public class exercise1 {

static void SortingStudent(Student[] list){
    Student tmp;
    for(int i=1; i<list.length; i++) {
        tmp=list[i];
        int j=i;
        while(list[j-1].compareTo(tmp)>0) {
            list[i]=list[j-1];
            j--;
            if(j==0) break;
        }
        list[j]=tmp;
    }
}


    public static void main(String[] args) {

        Student[] students1=new Student[5];
        students1[0] = new Student(4, "Artem");
        students1[1] = new Student(10,"Ivan");
        students1[2] = new Student(1, "Ashot");
        students1[3] = new Student(2, "Dima");
        students1[4] = new Student(35, "Vova");
        System.out.println("Было: " + Arrays.toString(students1) + "\nСтало: ");

        SortingStudent(students1);

        for(int i=0; i<students1.length; i++){
            System.out.print(students1[i].GetName() + " ");
        }
    }
}