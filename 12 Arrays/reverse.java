import java.util.*;

// Reversing an Array
public class reverse {
    public static void reversearray(int numbers[]){
    int first=0, last= numbers.length-1;
    while(first<last){
        int temp = numbers[last];
         numbers[last]   = numbers[first];
         numbers[first]= temp;
        first++;
        last--;
        }
    }    
    
    // Pairs in an array
    public static void pairs(int numbers[]){
        int pairs =0;
        for (int i=0; i<numbers.length; i++){
            int current = numbers[i];
            for(int j= i+1; j<numbers.length; j++){
                System.out.print( "(" +current + "," +numbers[j]+ ")");
                pairs++;
                
            }
            System.out.println();
        }
        System.out.println("Total number of pairs =" +pairs);
    }
public static void main(String [] args){
    int numbers[]={2, 4, 6, 8, 10};
    pairs(numbers);
    reversearray(numbers);
    System.out.print("Reversed arrays is ");
    for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+ " ");
    }
     System.out.println();
    }
    
}
