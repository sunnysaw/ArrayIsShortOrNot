import java.util.Scanner;

/*
In this section we will learn how to check that given array is shorted or not.
________________________________________________________________________________
Question : write a program to check array is shorted or not
_____________________________________________________________
Approach : first we take input from user then we will compare the element of array with each other if it shorted then
           we will otherwise we will print something else .
 */
public class Main {
    static boolean isShorted(int arr2[]){
        boolean count = true;
        for (int i = 1; i < arr2.length; i++){
            if (arr2[i] < arr2[i-1]){
                count = false;
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the value of array of array : ");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("Printing the location of array :" + arr);
            System.out.println("Printing the value of array :" + arr[i]);
            System.out.println("Printing the index value of array :" + i);
            System.out.println();
        }
        System.out.println("Now printing the value of comparing the arrays : " + isShorted(arr));
    }
}