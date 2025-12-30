import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PhaseTwo {
    //1. Frequency of elements

    //using hashmaps
    // Key = element
    //Value = frequency

    static void frequencyCount(int[] arr){
        HashMap<Integer , Integer> freq = new HashMap<>();

        for (int i =0 ; i<arr.length;i++){
            int current = arr[i];

            if (freq.containsKey(current)){
                freq.put(current, freq.get(current)+1);
            } else{
                freq.put(current,1);
            }
        }
        System.out.println("\nFrequency of elements: ");
        for (int key: freq.keySet()){
            System.out.println(key+ "->"+freq.get(key));
        }
    }

    //2. Second largest element
    static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i< arr.length; i++){
            int current = arr[i];

            if (current>largest){
                secondLargest= largest;
                largest= current;
            } else if (current<largest && current> secondLargest){
                secondLargest= current;
            }
        }
        return secondLargest;
    }

    //3. Check if array contains dublicates
    //using hashset

    static boolean containsDuplicate(int[] arr){
        HashSet<Integer> seen = new HashSet<>();

        for (int i=0; i<arr.length;i++){
            if(seen.contains(arr[i])){
                return true;
            }
            seen.add(arr[i]);
        }

        return false; //no duplicate
    }

    //HashMap → when you need counts
    //HashSet → when you need existence

    //4. left rotate array by 1
    //data movement problem

    static void leftRotateByOne(int[] arr){
        if (arr.length==0) return;

        int first = arr[0];
        for(int i = 0; i< arr.length-1 ;i++){
            arr[i]=arr[i+1];

        }
        arr[arr.length - 1] = first;
    }

    //5. Reverse the array
    //two pointer technique
    static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;

            left++;
            right--;
        }
    }









    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call Phase 2 methods
        frequencyCount(arr);
        System.out.println("second largest number is: "+secondLargest(arr));
        System.out.println("Contains duplicate? " + containsDuplicate(arr));

        leftRotateByOne(arr);
        System.out.println("after left rotation: ");
        for(int x : arr){
            System.out.println(x+" ");
        }
        reverseArray(arr);
        System.out.println("reversed array: ");
        for (int x: arr){
            System.out.println(x+" ");
        }


        sc.close();
    }

}
