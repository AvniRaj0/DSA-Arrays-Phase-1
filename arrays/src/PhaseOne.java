import java.util.Scanner;

public class PhaseOne {

    //1. prints all elements
    static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    //2. Find maximum elements
    static int findMax(int[] arr){
        int max = arr[0]; //assumeing first element is max
        for (int i=0;i< arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }

        }
        return max;
    }

    //3. Find max element
    static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //4. Find sum of elements
    static int findSum(int[] arr){
        int sum = 0;  //accumulator pattern
        for (int i=0; i < arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    //5. count elements greater than X
    static int countGreaterThanX(int[] arr, int x){
        int count = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]> x){
                count++;
            }
        }
        return count;
    }

    //6. Count even and odd number
    static void countEvenOdd(int[] arr){
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i<arr.length;i++){
            if (arr[i]%2==0){
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("even: "+ evenCount);
        System.out.println("odd: "+ oddCount);
    }


    //7. check if array is sorted in increasing order
    static boolean isSorted(int[] arr){
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter arrays elements: ");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("\n Array Elements");
        printArray(arr);

        System.out.println("\nMax: "+ findMax(arr));
        System.out.println("Min: "+ findMin(arr));
        System.out.println("Sum : "+ findSum(arr));

        System.out.print("enter value of x to find nos greater than it: ");
        int x = sc.nextInt();
        System.out.println("count > x: "+ countGreaterThanX(arr,x));

        countEvenOdd(arr);
        System.out.println("is array sorted in increasing order? "+ isSorted(arr));

        sc.close();
    }

}
