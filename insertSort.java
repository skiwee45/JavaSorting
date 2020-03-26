import java.util.*;

class insertSort{
    public static void main(String args[]){
        //variables
        int array[] = {
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,            
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3
        };
        int n = array.length;
        ArrayList<Integer> sorted = new ArrayList<Integer>();

        //start time
        final long startTime = System.nanoTime();

        //sorting
        sorted.add(0, array[0]); //adds the first one in directly   
        
        //end time
        final long endTime = System.nanoTime();
        System.out.println("\nTotal execution time for Insert Sort: " + (endTime - startTime));  
        
        
        int temp;

        for (int i = 1; i < n; i++){
            temp = array[i];
            int b = 0;

            while (b < sorted.size() && sorted.get(b) < temp){ //checks to see if the one in front of it is bigger
                b++;
            }
            sorted.add(b, temp);
        }

        //printing
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i ++){
            System.out.print(sorted.get(i));
            if (i < n - 1){
                System.out.print(", ");
            }
        }

        
    }
}