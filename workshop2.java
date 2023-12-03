import java.util.Scanner;
public class workshop2 {
    public static void main(String[] args) {  // Check whether the rectangle is square or not
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");  //  ask for the user-input
        int l = in.nextInt(); // store the value in variable
        System.out.println("Enter the breadth of the rectangle: ");
        int b = in.nextInt();
        if (l == b){  // checks whether the condition is true or false
            System.out.println("The rectangle is a square.");
        }
        else{
        System.out.println("The rectangle is not a square.");
        }
        in.close(); 
    }

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);  // checks the grade of the user
    //     System.out.println("Enter your marks ");   
    //     int marks = in.nextInt();
    //     if (marks >= 40 && marks < 50){  // chwck which condition match and print the output
    //         System.out.println("Your grade is C.");
    //     } else if (marks >= 50 && marks < 60){
    //         System.out.println("Your grade is C+.");
    //     } else if (marks >= 60 && marks < 70){
    //         System.out.println("Your grade is B.");
    //     } else if (marks >= 70 && marks < 80){
    //         System.out.println("Your grade is B+.");
    //     } else if (marks >= 80 && marks < 90){
    //         System.out.println("Your grade is A.");
    //     } else if (marks >90){
    //         System.out.println("Your grade is C.");
    //     }else{
    //         System.out.println("Invalid marks entered.");
    //     }
    //     in.close();
    // }

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);  // find the oldest and youngest 
    //     System.out.println("Enter your age:"); // user-input
    //     int age = in.nextInt();
    //     int age1 = 25; // variable with assign value
    //     if (age > age1){
    //         System.out.println("The user is oldest.");
    //     }else{
    //         System.out.println("The user is youngest.");
    //     }
    //     in.close();
    // }

    // public static void main(String[] args) {
    // int x = 2, y=5, z=0; //Find the values of the expressions
    // System.out.println(x ==2);  
    // System.out.println(x!=5); 
    // System.out.println(x != 5 && y >= 5);
    // System.out.println(z != 0 || x == 2);
    // System.out.println(!(y < 10));
    // }

    // public static void main(String[] args) {
    //    Scanner in = new Scanner(System.in);  // check whether user is allowed to sit in exam or not
    //    System.out.println("Do you have any medical cause? (y/n):");   
    //    char ans = in.next().charAt(0);
    //    if (ans == 'y' || ans =='Y'){  // checks which one condition is true
    //     System.out.println("You are not allowed to sit in the exam.");
    //    } else if (ans == 'n' || ans == 'N'){
    //     System.out.println("You are allowed to sit in the exam.");
    //    }else{
    //     System.out.println("Invalid input. Enter 'y' or 'n'.");
    //    }
    //    in.close();
    // }

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in); // check if the number is odd or even
    //     System.out.println("Enter the number: ");
    //     int num = in.nextInt();
    //     if (num % 2 == 0){
    //         System.out.println("The given number is even number.");
    //     } else{
    //         System.out.println("The given number is odd.");
    //     }
    //     in.close();
    //     }

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);  // print the x valu only if the condition is true
    //     System.out.println("Enter the value of x: ");
    //     int x = in.nextInt();
    //     if (x > 5 && x <15 ){
    //         System.out.println("The value of x is: "+x);
    //     } else{
    //         System.out.println("The value of x is not between x>5 and x<15");
    //     }
    //     in.close();
    //     }

    // public static void main(String[] args) {
    //     int x = 20, y =15, z=10;  // variable with assign value
    //     if (x > y) {  // print the greatest 
    //         if (y > z){ 
    //              System.out.println("x is greater than y and z.");
    //         }    
    //     } else if (z >y){
    //         if (y>x){
    //             System.out.println("z  is greater than x and y.");
    //         }
    //     }
    //     else{
    //         System.out.println("y is greater than x and z."); 
    
    // }
    // }


    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in); // Print the remarks 
    //     System.out.println("Enter your Grade: ");
    //     String grade = in.nextLine();
    //     switch (grade) {  // using the switch statement to check the condition
    //         case "A+":
    //                 System.out.println("Excellent !");
    //             break;
    //         case "A":
    //                 System.out.println("Outstanding !");
    //             break;
    //         case "B+":
    //                 System.out.println("Good !");
    //             break;
    //         case "B":
    //                 System.out.println("Can do better !");
    //             break;
    //         case "C+":
    //                 System.out.println("Just Passed !");
    //             break;
    //         case "C":
    //                 System.out.println("You Failed !");
    //             break;
    //         default:
    //             System.out.println("Invalid grade!");
    //             break;
    //     }
    //     in.close();
    // }

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);  // shows the string method 
    //     System.out.println("Enter the two strings: ");
    //     String str1 = in.nextLine();
    //     String str2 = in.nextLine();
    //     System.out.println("The length of str1 is: "+str1.length());
    //     System.out.println("The length of str2 is: "+str2.length());
    //     System.out.println("Comparison of two string: "+str1.compareTo(str2));
    //     System.out.println("Character of a string: "+str2.charAt(5));
    //     System.out.println("The substring of first string:"+str1.substring(0,2));
    //     System.out.println(str1.equals(str2));
    //     System.out.println("The upper case of str1: "+str1.toUpperCase());
    //     System.out.println("The lower case of str2: "+str2.toLowerCase());
    //     in.close();
    // }

}

// class Student {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in); // print the roll number using switch statement
//         System.out.println("Enter your roll number: ");
//         int i = in.nextInt();  
//         switch (i) {
//             case 1:
//                 System.out.println("Your roll number is 10.");
//                 break;
//             case 2:
//                 System.out.println("Your roll number is 12.");
//                 break;
//             default:
//                 System.out.println("Your roll number is greater than 12.");
//         }
//         in.close();
//     }
// }


 



