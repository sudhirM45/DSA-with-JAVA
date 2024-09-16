
//  OOPS   : - Object-Oriented Programing: object aur classes ka use karke programming karte hai
//  Computer contain two types of memory 1) Stack 2) Heap

//  CLASS AND OBJECTS :

//  OBJECT : Entities in the real world.
//           jo chije real world me exist karte hai jaseki ex- pen, laptop ,fan ,mobile etc.

//  CLASS  : When we crate a group of similar properties of
//           Object is called as CLASS.
//         : CLASS is nothing but a Blueprint of OBJECT.
//         : CLASS contain some attributs(properties) and Function.


//  ACCESS MODIFIERS :

//
//  Access Modifier | withinclass | Within package | outside package | Outside Package
//                                                   bysubclass only

//      Private     |   Y         |  N             |   N             |  N
//      Default     |   Y         |  Y             |   N             |  N
//      Protected   |   Y         |  Y             |   Y             |  N
//      Public      |   Y         |  Y             |   Y             |  Y


//  GETTER AND SETTER :

//  get :to return the value.
//  set : to modify the value.
//  This : this keyword is used to refer the current Object.


//  OOPS HAS 4 MAJOR PILER ON WHICH IT BELONG.
//  1. ENCAPSUALATION
//  2. INHERITANCE
//  3. ABSTRACTION
//  4. POLYMORPHISM


//  1.ENCAPCULATION : ENCAPCULATION IS DEFINED AS WRAPPING UP OF DATA AND
//                    METHODS UNDER A SINGAL UNIT. IT IS IMPLIMENTS
//                    DATA HIDING.



//  CONSTRUCTORS : IT IS A SPECIAL METHOD WHICH IS INVOKED AUTOMATICALLY
//                 AT THE TIME OF OBJECT CREATION .

//  ~ Constructor have the same name as class or structure .
//  ~ Constructor dont have a return type .(not even void)
//  ~ Constructor are only called once, at object creation.
//  ~ Memory allocation happens when Constructor is called.


//  Three types of Constructor:
//  1.non - parameterized
//  2.parameterized
//  3.copy constructor

//  DESTRUCTOR : in java Destructor are not used or difine FOR that java have
//               GARBAGE COLLECTOR.



//  2. INHERITANCE : INHERITANCE IS WHEN THE METHODS AND PROPERTIES OF BASE CLASS
//                   ARE PASSED ON TO A DERIVED CLASS.(PARENT CLASS TO CHILD CLASS)

//  Typs of Inheritance:
//  A) Single Level Inheritance : (base class ~ derived class)
//  B) Multi level Inheritance : (base class ~ derived class ~ derived class)
//  C) hierarchial Inheritance : (1 base class ~ multipal derived class)


//  3. POLYMORPHISM : POLYMORPHISM IS NOTHING BUT WE TRY TO DO SIMILAR THING OR ACHIEVE
//                    SAME THING IN MULTIPAL FORM OR WAY.

// 2 TYPS OF POLYMORPHISM :
// 1.COMPILE TIME POLYMORPHISM ~METHOD OVERLOADING(STATIC)
// 2.RUN TIME POLYMORPHISM ~METHOD OVERRIDING (DYNAMIC)

// A) METHOD OVERLOADING: MULTIPAL FUNCTION WITH THE SAME NAME BUT DIFFERENT PARAMETERS.
// B) METHOD OVERRIDING: PARARENTS AND CHILD BOTH CONTAINS SAME FUNCTION WITH A
//                       DIFFRENT DEFINNATION.


// PACKAGES IN JAVA : PACKAGES IS A GROUP OF SIMILAR TYPES OF CLASS,INTERFACES AND SUB PACKAGES.


//  4.ABSTRACTION: HIDING ALL THE UNNECESSARY DEATAILS AND SHOWING ONLY IMOPRATANT PART TO THE USER.
// Abstract Class:
// ~ cannot crate a instance of Abstract classes.
// ~ They have abstract and non abstract methods.
// ~ they can have Constructor.


//  INTERFACE IS THE BLUEPRINT OF CLASS.
//  ~ TO IMPLIMENT MULTIPAL INHERITANCE WE USE INTERFACES.
//  ~ TO IMPLIMENT TOTAL ABSTRACTION WE USE INTERFACES.
//  ~ INTERFACE DENOTED BY interface KEYWORD.
//  ~ TO INHERITANCE THE interface implement IS USED.

//  ~ ALL METHODS ARE PUBLIC,ABSTRUCT & WITHOUT IMPLIMENTATION.
//  ~ VARIABLES IN INTERFACE ARE FINAL,PUBLIC AND STATIC.


//  STATIC KEYWORD : STATIC KEYWORD IN JAVA USED TO SHARE THE SAME
//                   VARIABLE AND METHODS OF A GIVEN CLASS.

//  ~ FOLLOWING TERMS WE CAN MAKE STATIC IN PROGRAMMING
//  ~ PROPERTIES |  FUNCTION  |  BLOCK  | NESTED CLASSES

// SUPER KEYWORD: SUPER KEYWORD IS USED TO REFER IMMEDIATE PARENT CLASS OBJECT.

//  ~ TO ACCESS THE PARENTS PROPERTIES.
//  ~ TO ACCESS THE PARENTS FUNCTIONS.


















// import java.util.*;

// public class Oops {
//     public static void main(String []args){

//         Queen q = new Queen();
//         q.moves();
//         RooK r = new RooK();
//         r.moves();

//Scanner sc = new Scanner(System.in);// here the Scanner is a class which
//                                             object (sc) is formed using (new)keyword
//                                             and constructor of Scanner is called.


// Deer deer = new Deer();
// deer.eat();

// Calculater Cal = new Calculater();
// System.out.println(Cal.sum(1, 2));
// System.out.println(Cal.sum((float)1.5,(float)2.3));
// System.out.println(Cal.sum(1, 2,3));
// Student s1 = new Student();
// s1.name = "sudhir";
// s1.age = 19;
// s1.password = "abcf";

// Student s2 = new Student(s1);

// new student object using Student Constructor.
// Pen p1 = new Pen();
// p1.setTip(5);
// System.out.println(p1.getColor());
// p1.setColour("yellow");
// System.out.println(p1.getTip());
//     }

// }


// class Pen{
//     private String Color;
//     private int Tip;


//     String getColor(){
//         return this.Color;
//     }
//     int getTip(){
//         return this.Tip;
//     }

//     void setColour(String newColor) {
//         Color = newColor;
//     }
//     void setTip(int newTip) {
//         Tip = newTip;
//     }
// }



// class Student {
//     String name;
//     int age;
//     String password;

//     Student(Student s1){


//     }

//     Student(){
//         System.out.println("this is this");
//     }
//     Student(String name){
//         this.name = name;
//     }
//     Student(int age){
//         this.age = age;
//     }
// }



//     // Base class / parent class
// class Animals{
//     // String color;
//     // int age;

//     void eat(){
//         System.out.println("eats any thing ");
//     }
//     // void breath(){
//     //     System.out.println("breaths");
//     // }
// }

//     //Derived class / child class
//     class Deer extends Animals{
//         void eat(){
//         System.out.println("eats only grass");
//         }
//     }


//     class Calculater {
//         int sum (int a,int b){
//             return a+b;
//         }
//         float sum (float a, float b){
//             return a+b;
//         }
//         int sum (int a, int b, int c){
//             return a+b+c;
//         }
//     }


//     interface Chessplayer {
//         void moves();
//     }

//     class Queen implements Chessplayer {
//         public void moves(){
//             System.out.println("right,left,up,down,diagonal(in all four direction)");
//         }
//     }

//     class RooK implements Chessplayer {
//         public void moves(){
//             System.out.println("right,left,up,down,");
//         }
//     }



//import java.util.*;

public class Oops {
    public static void main(String[] args) {
        Student s= new Student();
        s.name ="sudhir";
    }
}


//  oops Que 1.
// class Student{
//     int Marks;
//     String name;
// }


//  QUE 2 : which variables can the Class person access in the follwoing code?
//  A.name B.weight C.rollnumber D.schoolname
//      ANS :A&B

class person{
    int weight;
    String name;
}

class Student extends person{
    int rollnumber;
    String schoolname;
}


// Que 3 : which of the modifier are not allowed in front of class?

// A.private B.protected c.defult D.public
//  ANS : A&B

//  Que 4 : which of the following is the correct statement ?
//          (both the class in same package)

class Vehicle {}
class Car extends Vehicle{}

// in java always ==>parent reference = child Object

//  A)  Car c = new Car();
//  B)  Vehicle v = new Vehicle();
//  C)  Vehicle v = new Car();
//  D)  Car c = new Vehicle();
// Ans : A,B,C

// QUESTION 5 :
// WHAT WILL BE THE OUTPUT OF THE CODE(BOTH CLASSES IN SAME PACKAGE)
//




