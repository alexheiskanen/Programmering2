package lesson.arrays.exercises;

public class Exercise6 {

    public static int  findIndex (int[] my_array1, int t) {
        if (my_array1 == null) return -1;
        int len = my_array1.length;
        int i = 0;
        while (i < len) {
            if (my_array1[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] my_array1 = {35, 19, 58, 13, 24, 99, 88, 68, 21, 42};
      System.out.println("Index position of 99 is: " + findIndex(my_array1, 99));
      System.out.println("Index position of 13 is: " + findIndex(my_array1, 13));
       }
}
