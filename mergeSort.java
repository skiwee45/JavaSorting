class mergeSort{
        
    static void merge(int array[], int b, int m, int m2, int e){
        //getting lengths of arrays
        int l1 = m - b + 1;
        int l2 = e - m2 + 1;

        //creating temporary arrays
        int[] temp1 = new int[l1];
        int[] temp2 = new int[l2];
        //copying over from main array
        for (int i = 0; i < l1; i++){
            temp1[i] = array[b + i];
        }
        for (int i = 0; i < l2; i++){
            temp2[i] = array[m2 + i];
        }

        //comparing each to put back into main array
        int i = b, i1 = 0, i2 = 0; //indexes for each array
        while (i1 < l1 && i2 < l2){
            if (temp1[i1] > temp2[i2]){
                array[i] = temp2[i2];
                i2++;
            }
            else{
                array[i] = temp1[i1];
                i1++;
            }
            i++;
        }

        //putting the rest of either set into the main array
        while (i1 < l1){
            array[i] = temp1[i1];
            i++;
            i1++;
        }
        while (i2 < l2){
            array[i] = temp2[i2];
            i++;
            i2++;
        }
    }

    static void sort(int array[], int b, int e){
        if (e > b){
            int m = (b + e) / 2;
            sort(array, b, m); //first half gets cut
            sort(array, m + 1, e); //second half gets cut
            merge(array, b, m, m+1, e); //merges 2 halves
        }
    }
    public static void main(String args[]){


        //setting up
        int array[] = {
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3,
            5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3, 5, 2, 1, 6, 8, 3
        };

        int beginning = 0;
        int ending = array.length - 1; 

        //start time
        final long startTime = System.nanoTime(); 
        
        sort(array, beginning, ending);

        //end time
        final long endTime = System.nanoTime();
        System.out.println("\nTotal execution time for Merge Sort: " + (endTime - startTime));

        //printing
        System.out.println("The sorted array is: ");
        for (int i = 0; i < ending + 1; i ++){
            System.out.print(array[i]);
            if (i < ending){
                System.out.print(", ");
            }
        }
        
 
        
    }
}