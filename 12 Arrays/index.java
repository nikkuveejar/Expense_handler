import java.util.*;
public class index {
    // To find the index of an element in an array 
    // given array is 2, 4, 6, 8, 10, 12, 14, 16

    public static int linearsearch(int num[], int key){
        for (int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key=10;
        System.out.println( "The value of index is " + linearsearch(num, key) );

    }
}
