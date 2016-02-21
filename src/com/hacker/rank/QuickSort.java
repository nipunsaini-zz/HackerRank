package com.hacker.rank;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {5,8,1,3,7,9,2};
		partition(ar, 0, ar.length-1);
		printArray(ar);

	}
	
	static int partition(int[] ar, int start, int end) {       
        
        int pivot = ar[start];
        int right = end;
        int left = start + 1;
        boolean done = false;
        int temp;
        while(!done){
            while(left <= right && ar[left] <= pivot)
                left++;
            while(ar[right] >= pivot && right >= left)
                right--;
            if(left > right)
                done = true;
            else{
                temp = ar[right];
                ar[right] = ar[left];
                ar[left] = temp;
            }
        }
        temp = ar[start];
        ar[start] = ar[right];
        ar[right] = temp;
        printArray(ar);
        return right;
        //printArray(ar);
              
 }   

static void printArray(int[] ar) {
   for(int n: ar){
      System.out.print(n+" ");
   }
     System.out.println("");
}

}
