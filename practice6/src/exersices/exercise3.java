package exersices;


import java.util.Arrays;

public class exercise3 {


    public static void SortUnsorted(Student[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);

        Student[] buf = new Student[a.length];

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].compareTo(buf[i])<0) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public static void MergeSorted(Student[] a, Student[] b, Student[] c){
        int i = 0, j = 0, iMax= a.length -1 , jMax= b.length - 1, max = jMax + iMax + 2;

        for (int k = 0; k < max; k++) {

            if (i > iMax) {
                c[k] = b[j];
                j++;
            } else if (j > jMax) {
                c[k] = a[i];
                i++;
            } else if (b[j].compareTo(a[i])<0) {
                c[k] = b[j];
                j++;
            } else {
                c[k] = a[i];
                i++;
            }
        }
    }


    public static void main(String[] args) {

        Student[] students1=new Student[5];
        students1[0] = new Student(4, "Artem");
        students1[1] = new Student(10,"Ivan");
        students1[2] = new Student(1, "Ashot");
        students1[3] = new Student(2, "Dima");
        students1[4] = new Student(35, "Vova");

        Student[] students2=new Student[5];
        students2[0] = new Student(8, "Nikifor");
        students2[1] = new Student(4,"Zhenya");
        students2[2] = new Student(9, "Stepan");
        students2[3] = new Student(3, "Kolya");
        students2[4] = new Student(0, "Inokentiy");

        System.out.println("Было: " + Arrays.toString(students1) + " " + Arrays.toString(students2));

        SortUnsorted(students1, 0, students1.length-1);
        SortUnsorted(students2, 0, students2.length-1);

        Student[] studentsRes=new Student[10];
        MergeSorted(students1, students2, studentsRes);

        System.out.println("Стало: " + Arrays.toString(studentsRes));
    }

}
