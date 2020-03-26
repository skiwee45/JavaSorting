class bubbleSort{
    public static void main(String[] args){
        //variables
        int array[] = {
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3
        };
        int n = array.length;
        
        //start time
        final long startTime = System.nanoTime();

        //for statements
        for (int i = 0; i < n - 1; i ++){
            for (int o = 0; o < n - 1; o ++){
                if (array[o] > array[o+1]){ //moves smaller numbers forward
                    int temp = array[o];
                    array[o] = array[o+1];
                    array[o+1] = temp;
                }
            }
        }
        //end time
        final long endTime = System.nanoTime();
        System.out.println("\nTotal execution time for Bubble Sort: " + (endTime - startTime));


        //final display
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i ++){
            System.out.print(array[i]);
            if (i < n - 1){
                System.out.print(", ");
            }
        }
        
        
    }
}