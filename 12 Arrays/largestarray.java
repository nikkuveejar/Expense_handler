public class largestarray {
    public static int getlargest(int num[]){
        int largest =Integer.MIN_VALUE;
        for (int i=0; i<num.length; i++){
            if (num[i]>largest){
                largest = num[i];
           }
        }
        return largest;
    
    }

    public static int getsmallest(int num[]){
        int smallest= Integer.MAX_VALUE;
        for (int i=0; i<num.length; i++){
            if (num[i]<smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        int num []= {5, 7 , 8 ,15, 1, 3};
        System.out.println("The Largest number is "+getlargest(num));
        System.out.println("The Largest number is "+getsmallest(num));
                      
    }
}
