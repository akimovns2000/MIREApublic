package exersices;

import java.util.Arrays;
import java.util.Comparator;

public class exercise2 {

    public static class SortingStudentsByGPA implements Comparator<Student>{

        SortingStudentsByGPA(){}

        @Override
        public int compare(Student o1, Student o2) {
            return(o1.GetID()-o2.GetID());
        }

        public void quickSort(Student[] array, int low, int high)

        {
            int mid = (high + low) / 2;

            int i = low, j = high;
            while (i <= j) {
                while (compare(array[mid], array[i])<0) i++;

                while (compare(array[mid], array[j])>0) j--;

                if (i <= j) {
                    Student tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    i++;
                    j--;
                }
            }

            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);
        }
    }

    public static void main(String[] args) {


        Student[] students1=new Student[5];
        students1[0] = new Student(4, "Artem");
        students1[1] = new Student(10,"Ivan");
        students1[2] = new Student(1, "Ashot");
        students1[3] = new Student(2, "Dima");
        students1[4] = new Student(35, "Vova");
        System.out.println("Было: " + Arrays.toString(students1));

        SortingStudentsByGPA ssbg = new SortingStudentsByGPA();
        ssbg.quickSort(students1, 0, students1.length - 1);
        System.out.println("Стало: ");
        System.out.println(Arrays.toString(students1));
    }
}