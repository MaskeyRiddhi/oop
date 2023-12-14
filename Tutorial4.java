import java.util.Scanner;

// class Book{
//     String name;
//     String author;
//     int pages;
//     float price;
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Book book1 = new Book();
//         book1.author = "Sam";
//         book1.name = "Book 123";
//         System.out.println(book1.author);

//     }
    
// }

// Task 1: Define a class named Car with attributes brand, model, and year.
// class Car{
//     String brand;
//     String model;
//     int year;
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Car info = new Car();
//         info.brand = "Audi";
//         info.model = "Audi Q3";
//         info.year = 2009;
//         System.out.println(info.year);
//     } 
// }

// Task 2: Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and 
// that of name as "John" by creating an object of the class Student.
// class   Student{
//     String name;
//     int roll_no;
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Student info = new Student();
//         info.name = "John";
//         info.roll_no = 2;
//         System.out.println("Name: "+info.name +"\nRoll no: "+info.roll_no);
//     }  
// }

// class Employee{
//     String name;
//     int age;
//     int salary;
//     String address;
//     String position;

//     static void getOfficeName(){  // can oly access the static variable
//         System.out.println(("ABC pvt ltd: "));
//     }

//     void increasedSalary(int rate){
//         salary+= rate;
//         System.out.println(("New Salry is: "+ salary));
//     }
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Employee emp = new Employee();
//         emp.name="John";
//         emp.salary=30000;

//         emp.increasedSalary(10000);

//         Employee.getOfficeName();
    
//     }
    
// }

// Constructor

// class Employee{
//     String name;
//     int age;

//     // Employee(String n, int a){  
//     //     name = n;
//     //     age = a;
//     //     System.out.println("Params constructor triggered!");  // not to print at constructor 
//     // }

//     Employee( String name, int age){ // when name of attributes and parameter are same use this
//         this.name = name;
//         this.age = age;
//     }
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Employee emp = new Employee("John",24);
//        System.out.println(emp.age+emp.name);
//     }
// }

// Task 3: Write a program to declare a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having 
// the three sides as its parameters.
// class Triangle{
//     int a;
//     int b;
//     int c;

//     Triangle(int a, int b, int c){
//         this.a =a;
//         this.b = b;
//         this.c = c;
//     }
//     void sides(){
//         System.out.println("The sides 0f triangle are: "+a+" "+b+" "+c);
//     }
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Triangle side = new Triangle(3,4,5);
//         side.sides();
//     }
// }

// Task 4: Implement a no-argument constructor that prints out “User created!” as soon as the instance of the user is created.
// class User{
//     User(){
//         System.out.println("User Created!");
//     }
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         User user1 = new User();
//     }
// }

// Task 5: Create a class named ,”Box” with attributes width, height, and length. Create multiple constructors for handling following object declarations:
// For a cube, declare a constructor to take length only.
// For a cuboid, declare a constructor to take length, breadth, and height.
// For no parameter, declare a no-argument constructor that sets length = 10, breadth = 8, and height = 12.

// class Volume{
//     int len;
//     int breadth;
//     int height;
//     // for cube
//     Volume(int len){
//         this.len = len;
//         this.breadth =len;
//         this.height = len;
//     }

//     // for cuboid
//     Volume(int len, int breadth, int height){
//         this.len = len;
//         this.breadth =breadth;
//         this.height = height;
//     }

//     // for non param
//     Volume(){
//         len=10;
//         breadth = 8;
//         height=12;
//     }

//     void calculateVolume(){
//         System.out.println("volume: " + len * breadth * height);
//     }
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Volume cube = new Volume(10);
//         Volume cuboid = new Volume(12,10, 5);
//         Volume box = new Volume();

//         cube.calculateVolume();
//         cuboid.calculateVolume();
//         box.calculateVolume();
//     }
    
// }

// Task 6: Add a method to the Car class to display the details of the car. Create multiple Car objects and call the display method for each.
// class Car{
//     String brand;
//     String model;
//     int year;
//     void displayDetails(){
//        System.out.println("Brand: " + brand); 
//        System.out.println("Model: " + model);
//        System.out.println("Year: " + year);
//     }
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Car info = new Car();
//         info.brand = "Audi";
//         info.model = "Audi Q3";
//         info.year = 2009;

//         Car car1 = new Car();
//         car1.brand = "Toyota";
//         car1.model = "Camry";
//         car1.year = 2015;

//         Car car2 = new Car();
//         car2.brand = "Honda";
//         car2.model = "Civic";
//         car2.year = 2018;

//         info.displayDetails();
//         car1.displayDetails();
//         car2.displayDetails();
//     } 
// }

// Task 7: Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
// class Average{
//     Average(int n1, int n2, int n3){
//         double avg = (double )(n1+n2+n3)/3;
//         System.out.println("The average of three numbers: "+avg);
//     }
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the three numbers: ");
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         int n3 = sc.nextInt();
//         Average avg1 = new Average(n1,n2,n3);
//         sc.close();
//     }  
// }

// class bankAccount {
//     String accountName;
//     protected int balance; // can access from subclass and packages while private can only access in class

//     bankAccount(String accountName, int balance){
//         this.accountName = accountName;
//         this.balance = balance;
//     }
//     void getbalance(){
//         System.out.println();
//     }
// }
// public class Tutorial4 {
//     public static void main(String[] args) {
//         bankAccount acc1 = new bankAccount("AccName",100000);
//         System.out.println(acc1.balance);
//         acc1.getClass();
//     }
// }