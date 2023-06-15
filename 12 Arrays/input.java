import java.util.*;

public class input {
    public static void main(String args[]){
        int marks [] = new int [5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter physics marks");
        marks [0]= sc.nextInt();
        System.out.println("Enter maths marks");
        marks [1]= sc.nextInt();
        System.out.println("Enter chem marks");
        marks [2]= sc.nextInt();
        int total_marks= (marks[0] + marks[1] + marks[2]);
        System.out.println(total_marks);

    }
}
