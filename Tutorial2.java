import java.util.Scanner;
class Tutorial2{
    // public static void main(String[] args) {
    //     Boolean expr1 = 5 >3;
    //     Boolean expr2 = 8 >5;

    //     System.out.println(expr1 && expr2);
    // }

//     public static void main(String[] args) {
//         Boolean expr1 = 5 >3;
//         Boolean expr2 = 2 >5;

//         System.out.println(expr1 || expr2);
//     }
// public static void main(String[] args) {
//         Boolean expr1 = !(5==10);
//         System.out.println(!(expr1 ));
//     }
// public static void main(String[] args) {
//     char character ='a';
//     char []array ={'a','c','g'};
//     String corresponding = new String(array);

//     // System.out.println(character);
//     System.out.println(array[0]);
//     System.out.println(corresponding);
// }

// public static void main(String[] args) {
//     char [] array ={'a','c','g'};
//     String secondString = new String(array);

//     // System.out.println(character);
//     System.out.println(secondString);  
// }

//  public static void main(String[] args) {   // Declare a character  and assign a value
//     char  word= 'R';
//     System.out.println(word);
//  }

// public static void main(String[] args) {  // Declare an array of Character with 3 values.
//    char [] three = {'f','h','r'} ;
//    System.out.println(three);
// }
// public static void main(String[] args) {  // Convert the array of Character to string
//     char [] three = {'f','h','r'} ;
//     String values = new String(three);
//     System.out.println(values);   
// }
//Declare a String using Double Quotation (“”)


// public static void main(String[] args) { // compareTo()
//     String s1="hello";  
//     String s2="hello";  
//     String s3="harry";  
//     String s4="nepal";  
//     String s5="flag";  
//     String s6=""; 

    // System.out.println(s1.compareTo(s2));
    // System.out.println(s1.compareTo(s3));
    // System.out.println(s1.compareTo(s4));
    // System.out.println(s1.compareTo(s5));
    // System.out.println(s1.compareTo(s6));
//}


// public static void main(String[] args) {  // use of concat()
//     String s1 = "Herald College";
//     String s2 = (" is located in Naxal Kathmandu"); 
//     System.out.println(s1.concat(s2));
// }

// public static void main(String[] args) {  // use of equal()
//     String s1="hello";  
//     String s2="hello";  
//     String s3="harry";  
//     String s4="nepal"; 
//     System.out.println(s1.equals(s2));
//     System.out.println(s3.equals(s4));
// }

// public static void main(String[] args) {
//     String s1 = "Herald College";
//     String s2 = (" is located in Naxal Kathmandu"); 
//     System.out.println(s1.length());
//     System.out.println(s2.length());
// }

// public static void main(String[] args) {
//     String name="java";
//     System.out.println(name.charAt(2));
// }

// public static void main(String[] args) {
//     String name="Bachelors";
// System.out.println(name.substring(4, 7));
// }

// Task 4 Write a Java program to read the Birth year (in AD) of a candidate and determine
//  whether he is eligible to cast his/her own vote. (if the user is 18 he can cast vote). 
// public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("Enter the date of birth in AD: ");
//     int date = in.nextInt();
//     int age = 2023-date;
//     if (age >= 18){
//         System.out.println("You are eligible to cast your vote.");
//     } else{
//         System.out.println("You are not eligible to cast your vote.");
//     }
//     in.close();
// }

// Task 5
// Write a program to find the greatest among two numbers taking user input.
// public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("Enter the two numbers:");
//     int num1 = in.nextInt();
//     int num2 = in.nextInt();
//     if (num1 > num2){
//         System.out.println(num1+" is the greatest number.");
//     }
//     else{
//          System.out.println(num2+"is the greatest number.");
//     }
//     in.close();
// }


// Task 6
// Write a Java program to find the largest of three numbers. 
// Take 3 numbers as input from user. Hint: use nested-if statement
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the three numbers:");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
       if (num1 > num2 && num1 > num3){
        System.out.println(num1+" is the greatest number.");
       }
        if (num2 > num3 && num2 > num1){
        System.out.println(num2+" is the greatest number.");
       }
       else{
        System.out.println(num3+" is the greatest number.");
       }
       in.close();
       }
 

// Task 9
// Write a program to Check whether a character is a vowel or consonant using switch statement.
// public static void main(String[] args) {
//     char character = 'R';
//     switch (character) {
//         case 'a':  
//         case 'e':    
//         case 'i':
//         case 'o':
//         case 'u':
//         case 'A':
//         case 'E':  
//         case 'I':
//         case 'O':
//         case 'U':
//             System.out.println("Vowel!");
//             break;
//         default:
//             System.out.println("Consonant!");
//             break;
//     }
// }
}