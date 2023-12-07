import java.util.Scanner;
class Tutorial3{
    // Task 1: Write a Java program to Display a Text, “Herald College Kathmandu” Five Times.

    // public static void main(String[] args) {
    //     for(int i= 0; i<=5; i++){
    //         System.out.println("Herald College Kathmandu");
    //     }
    // }

    // Task 2: Write a Java program to Display Sum of n Natural Numbers
    // For n = 5, sum should be 15 (1+2+3+4+5).

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int num = in.nextInt();
    //     int sum= 0;
    //     for (int i=1; i <= num; i++){
    //         sum+=i;
    //     }
    //     System.out.println("Sum of natural numbers:"+sum);
    //     in.close();
    // }

    // Write a Java program to Display Sum of even n Natural Numbers
    
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int num = in.nextInt();
    //     int sum= 0;
    //     for (int i=1; i <= num; i++){
    //         if (i %2 == 0){
    //             sum+=i;
    //         }
    //     }
    //     System.out.println("Sum of even natural numbers: "+sum);
    //     in.close();
    // }

    // Task 4: Write a Java program to display multiplication of a number from 1 to 10. (ask user to input the number). 

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int num = in.nextInt();
    //     int pro;
    //     System.out.println("Multiplication of " +num+ " from 1 to 10:");
    //     for (int i=1; i <= 10; i++){
    //         pro = num*i;
    //         System.out.println(pro);
    //     }
    //     in.close();
    // }

    // Task 5: Write a program to print the following pattern in Java.
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

//     public static void main(String[] args) {
//         for(int i=1; i<=5;i++){
//             for(int j=1; j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//         int n=1, k;
//         while(n<=5){
//             k =1;
//             while(k<=n){
//                 System.out.print("* ");
//                 k++;
//             }
//             System.out.println("");
//             n++;
//         }

//     }

    // Task 6: Write a program to print the following pattern in Java. (Use for loop)
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    // public static void main(String[] args) {
    //     for (int i =1; i<=5;i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(j);
    //         }
    //     System.out.println("");
    //     }
    // }

    // Task 7: Write a Java program to initialize a one dimensional integer array integerArray that can store five integers.
    // public static void main(String[] args) {
    //     int [] integerArray = {2,4,6,8,10}; // direct method to store integers
    //     int [] array = new int[5];   // initialize the array
    // }

    // Task 8: Write a java program to initialize a 2D array with the given values:
    // public static void main(String[] args) {
    //     int[][] integerArray1 = {{5,12,17,9,3}, {13,4,8,14,1}, {9,6,3,7,21}};  // Declaring a multidimensional array
    // }


    // Task 9: Iterate the elements of the array declared in Task 7.
    // public static void main(String[] args) {
    //     int [] integerArray = {2,4,6,8,10}; // for task 7
    //     for (int i=0; i<integerArray.length; i++){
    //         System.out.print(" "+integerArray[i]);
    //     }

    //     int[][] integerArray1 = {{5,12,17,9,3}, {13,4,8,14,1}, {9,6,3,7,21}}; // for task 8
    //     for (int i[]: integerArray1){
    //         for (int j : i){
    //         System.out.print(j+" ");
    //         }
    //     System.out.println();
    //     }
    // }

    // Task 10: Implement Linear search to find a user input integer in an array of integer. Print “Matched!” if the string has been found, else print “Not matched!”  
    // public static int linearSearch(int[] arr, int srch){
    //     for (int i=0; i<arr.length; i++){
    //         if (arr[i] == srch){
    //             return srch;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int [] arr = {2,4,6,8,10};
        
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter an integer: ");
    //     int srch = in.nextInt();
    //     int val = linearSearch(arr, srch);
    //     if (val == srch){
    //         System.out.println("Matched!");
    //     } else{
    //         System.out.println(" Not Matched!");
    //     }
    //      in.close();
    // }

 }