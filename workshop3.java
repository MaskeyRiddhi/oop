import java.util.Arrays;
import java.util.Scanner;

public class workshop3 {
    
    // 1. Write a Java program that uses a "for" loop to print the numbers from 1 to 10.
    // public static void main(String[] args) {
    //     System.out.println("The numbers from 1 to 10: ");
    //     for (int i =1; i<=10; i++){  // iterates till the condition met
    //         System.out.print(i+" "); // print the output
    //     }
    // }

   // 2. Implement a Java program that utilizes a "while" loop to find the factorial of a given number.
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");  // ask the user-input
//         int num = sc.nextInt();  // store value in variable
//         int fac = 1, i=1;
//         while(i<=num){   // while loop to calculate factorial
//             fac = fac * i;
//             i++;
//         }
//         System.out.println("The factorial of "+num+" is "+fac); // print the output
//         sc.close();
//    }

   // 3.Create a Java program using a "do-while" loop to repeatedly ask the user for input until they enter a specific value (e.g., 0).
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         do{
//         System.out.print("Enter a number (press 0 to stop): ");  // ask the user-input
//         num = sc.nextInt();  // store value in variable
//         }
//         while(num != 0);  // stop the program when zero value is given
//         System.out.println("Zero key is pressed. Your program ends ");
//         sc.close();
//    }

    // 4. Write a Java program that demonstrates the use of nested loops to print a pattern, such as a pyramid of stars.

public static void main(String[] args) {
    int row = 5, k = 0;
    for (int i = 1; i <= row; ++i, k = 0) {
        for (int j = 1; j <= row - i; ++j) {
            System.out.print("  ");
        }
        while (k != 2 * i - 1) {
            System.out.print("* ");
            ++k;
        }
        System.out.println(); 
    }
}
}
    
    // 5. Develop a Java program that declares and initializes an array of integers. Print the elements of the array in reverse order.
    //     public static void main(String[] args) {
    //     int array[] = {2,5,8,6,7};
    //     System.out.println("Input Array :" + Arrays.toString(array));
    //     int n = array.length;
    //     int a = 0, b = n - 1;
    //     while (a < b) {
    //         int temp = array[a];
    //         array[a] = array[b];
    //         array[b] = temp;
    //         a++;
    //         b--;
    //     }
    //     System.out.print("Reversed Array : " + Arrays.toString(array));
    // }
    
    // 6.	Implement a Java program that finds the sum and average of elements in an array of floating-point numbers.
        // public static void main(String[] args) {
        //     float arr[] = {1,3,5,7,9};
        //     float sum = 0;
        //     float avg = 0;
        //     for (float i: arr){
        //         sum = sum+i;
        //     }
        //     avg = sum / arr.length;
        //     System.out.println("The sum of elements of array: "+sum);
        //     System.out.println("The average of elements of array: "+avg);
        // }
  
    // 7. Write a Java program that checks if a given element is present in an array of strings. If present, print its index; otherwise, print a message indicating its absence.

    //   public static void main(String[] args) {
    //     String[] arr = {"apple", "banana", "cherry", "blueberry", "strawberry"};
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter a string: ");
    //     String target = in.nextLine();
    //     int index = Arrays.asList(arr).indexOf(target);
    //     if (index != -1) {
    //       System.out.println("The element " + target + " is present at index " + index + ".");
    //     } else {
    //       System.out.println("The element " + target + " is not present in the array.");
    //     }
    //     in.close();
    //   }

    // 8. Create a Java program that sorts an array of integers in ascending order using the bubble sort algorithm.
// public static void main(String[] args) {
//    int arr[] = {5, 12, 8, 7, 19,1};
//    int temp = 0;
//    System.out.println("Elements of original array: ");
//    for (int i = 0; i < arr.length; i++) {
//        System.out.print(" "+arr[i]);
//    }
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i+1; j < arr.length; j++) {
//           if(arr[i] > arr[j]) {
//               temp = arr[i];
//               arr[i] = arr[j];
//               arr[j] = temp;
//           }
//        }
//    }
//    System.out.println("\nElements of array sorted in ascending order: ");
//    for (int i = 0; i < arr.length; i++) {
//        System.out.print( " "+arr[i]);
//    }
// }

    
    // 9. Develop a Java program that uses the enhanced for loop to iterate through an array of characters and count the number of vowels.
    // public static void main(String[] args) {
    //     int count = 0;
    //     char[] arr ={ 'a','','k','e' ,'o','y'};
    //     for (char c : arr) {
    //         if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
    //             count++;
    //         }
    //     }
    //     System.out.println("Number of vowels in the array: " + count);
    // }
    
    // 10.	Write a Java program that uses the enhanced for loop to find the maximum value in an array of doubles.
    // public static void main(String[] args) {
    //     double [] arr = {7.0, 5.7, 9.8, 14.6, 7.9};
    //     double max = Double.MIN_VALUE;
    //     for (double d : arr){
    //         if (d > max){
    //             max = d;
    //         }
    //     }
    //     System.out.println("The maximum value in an array is "+ max);
    // }

// 11.Implement a Java program that initializes a 2D array and uses an enhanced for loop to calculate the sum of all elements.
    // public static void main(String[] args) {
    //     int sum=0;
    //     int [][] arr = {{1, 3, 5, 7}, {2, 4, 6, 8}};
    //     for (int i[]: arr){
    //         for (int j : i){
    //             sum +=j;
    //         }
    //     } 
    //     System.out.println("The sum of all elements in 2D array: "+sum);
    // }

// 12.	Create a Java program that utilizes the enhanced for loop to concatenate all strings in an array and print the result.
    // public static void main(String[] args) {
    //     String [] arr = {"Hello, ","This ","is ","OOP ","Module."};
    //     String result= "";
    //     for (String str : arr){
    //         result += str;
    //     }
    //     System.out.println(result);
    // }
    // }






