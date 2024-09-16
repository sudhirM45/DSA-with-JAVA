

class Basic{
    public static void main(String[] args) {
        System.out.println("hello world!");
    }
}

// DATA TYPES IN JAVA
//  TWO TYPES
// 1) PRIMITIVE - WHICH ARE already CREATED BY JAVA ITSELF
// ex-byte,short,char,boolean,int,long,float,double etc.

// 1) byte:
// data:- 1byte
// mamory range:-[-128 to 127]

// 2) short:
// data:- 2bytes
// MR:- []

// 3) char:
// data:- 2bytes
// MR:- [a to z , A to Z]

// 4) boolean:
// data:- 1bytes
// MR:-[true,false]

// 5) int:
// data: 4bytes
// MR:[-2B to +2B]

// 6) long:
// data: 8bytes

// 7) float:
// data: 4bytes

// 8) double:
// data: 8bytes

// 2) NON -PRIMITIVE - WHICH IS CREATED BY USERS
// ex- string,array,class,object,interface etc.





// TYPE CONVERSION - AK TYPE KE DATA KO DUSRE TYPE KE DATA ME
//                   CONVERT KARTE HAI. IT IS ALSO CALLED AS WIDENING CONVESION OR
//                    IMPLICIT CONVERSION.

//   CONVERSION HAPPENS WHEN

//  A) TYEP COMPATIBALE
//  B) DESTINATION TYPE > SOURCE TYPE
// INT VALUE CAN STORE IN LONG BUT LONG VALUE CANNOT STORE IN INT BEACAUSE THE MENORY
//            BYTE OF INT IS LESS THAN LONG
// INT =4 BYTES
// LONG = 8 BYTES

// TYPE CONVERSION POSSIBILITIES:
// BYTE->SHORT->INT->FLOAT->LONG->DOUBLE

// TYPE CASTING - VO COVERSION HAI JISE JAVA ALLOW NAHI KARTA TO USKO JABRJSTISE KAR TE HAI.
//  IT IS ALSO CALLED AS NARROWING CONVERSION AND EXPLICIT CONV.
// FOR EXAMPLE

// class Basic{
//     public static void main(String[] args) {
//         float number=99.99f;
//         int number2= (int) number;
//         System.out.println(number2);

//     }
// }

// TYPE PROMOTION IN EXPRESSIONS:
// RULES:
// 1) JOBHI AAPKA BYTE ,SHORT,CHAR (CHOTE DATA TYPE) TYPE KA DATA
// EXPRESSION ME HAI JAVA USE INT ME CONVERT KARDETA HAI.
// 2) AGAR KISI EXPRESSION KE AANDAR LONG , FLOAT , DOUBLE HAI TO PURA EXPRESSION
// LONGE ME YA FLOAT ME DOUBLE ME CONVERT HOGA (LARGEST POSSIBLE DATA TYPE).

//  WRONG :-
// byte b=5;
// b=b*2;

// RIGHT :-
// byte b=5;
// b= (byte)(b*2);




// class Basic {
//     public static void main(String[] args) {
//         int a=3;
//         int b=5;
//         int sum;
//         sum=a+b;
//         System.out.println("sum is:"+sum);

//     }
// }

// import java.util.Scanner;//package



// class Basic{
//     public static void main(String[] args) {  //main function
//         System.out.println("enter 2 number:");
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum;
//         sum=a+b;
//         System.out.println("sum is :"+sum);


//     }
// }


// AREA OF CIRCLE

// import java.util.*;
// class Basic{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter value of rad:");
//         float rad=sc.nextFloat();
//         float area = 3.14f*rad*rad;  //java har decimal value ko double
//                                         leta hai isliye hame decimal value ke aage
//                                             f likhana padta hai( in case of float.)
// //

//         System.out.println("area is :"+ area);
// }
// }


// import java.util.Scanner;
// class Basic{
//     public static void main(String[] args) {
//         System.out.println("enter age:");
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();

//         if(age>=18){
//             System.out.println("adult :drive,vote");
//         }
//         if(age>13 && age<18){
//             System.out.println("teenager");
//         }
//         else{
//             System.out.println("not adult");
//         }
//     }

// }


// import java.util.Scanner;
// class Basic{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter any two num:");
//         int A=sc.nextInt();
//         int B=sc.nextInt();
//         if(A>B){
//             System.out.println(A+ "is larger than" +B);
//         }
//         else{
//             System.out.println(A+ "is smaller than" +B);
//         }
//     }
// }



// while Loop

// while(condition){
//     do something
// }

// class Bacis{
//     public static void main(String[] args) {
//         int counter= 0;
//         while(counter<100){
//             System.out.println("hello world");
//             counter++;
//         }
//         System.out.println("printed HW 100x");
//     }
// }


// calculate simple interest

// simple interest = P*R*T/100

// class Basic{
//     public static void main(String[] args) {
//         int P,R,T;
//         P=10000;
//         R=4;
//         T=12;
//         int SI;
//         SI=(P*R*T)/100;
//         System.out.println("simpe interest is:"+SI);
//     }
// }


// print pattern

// print if a number is odd or even

// (n%2==0)


// import java.util.*;
// class Basic{
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);

//       int number=sc.nextInt();
//       if(number%2==0){
//         System.out.println("even");
//       }
//       else{
//         System.out.println("odd");
//       }
//     }
// }


// print num from 1 to 100
// using while loop

// class Basic{
//     public static void main(String[] args) {
//         int counter=1;
//         while(counter<=100){
//             System.out.println(counter+" ");
//             counter++;
//         }
//         System.out.println();
//     }
// }


// 1)arithmatic operater:-
// 2)relational
// 3)logical
// 4)bitwise opetator
// 5)assigment


// 1)Arithmatic Operator

// a) Binary Operator :- [+,-,*,/,%]

// b) Unary Operator :-[++,--]

// a=a+1 or a=a-1 we will right it as follows
// a++ or a-- and ++a or a--
// (++)is called as increment operator
// (--)is called as decrement operator

// in(++)two types
// a) pre increment operator
// b) post decrement operator

// 3)Relational Operator :-['==', !=, >, <, >=, <=]


// 4) Logical Operator :-[&&,||,!]




// 5) Assigment Operator:-[=,+=,-=,*=,/=,%=]



// else if statement

// if(condition1){

// }
// else if(condition 2){ // if write else if to uper vala if true hai to
//                            compailar else if co check nahi karega

// }
// else{

// }

// class Basic{
//     public static void main(String[] args) {
//         int age=22;

//         if(age>=18){
//             System.out.println("adult");
//         }
//         else if(age>=13 && age<18){
//             System.out.println("teenager");
//         }
//         else{
//             System.out.println("child");
//         }
//     }
// }

// 20/10/2023


// FIND MAX OFF 3 NUMBER

// pseudo code :

// 1) start
// 2) input a,b,and c
// 3) if a>b do
//       if a>c do
//          print 'a'
//       else
//          print "c"
//    else
//       if b>c do
//          print "b"
//      else
//          print "c"
// 4) EXIT

// import java.util.*;
// class Basic{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter any 3 numbers");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         if(a>b){
//             if(a>c){
//                 System.out.println(a +"is maximum");

//             }
//             else{
//                 System.out.println(c +"is maximum");
//             }

//         }
//         else
//          if(b>c){
//             System.out.println(b +"is maximun");
//          }
//          else{
//             System.out.println(c +"is maximum");
//          }
//         }
// }


// PRINT NUMBER FROM 1 TO "N"

// import java.util.*;
// class Basic{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter any range");
//         int range=sc.nextInt();
//         int counter=1;

//         while(counter <= range){
//             System.out.print(counter + " ");
//             counter++;
//         }
//           System.out.println();
//     }
// }


// RELATIONAL OPRATORS

// == to check equal value
// != not equal to
// >  greater
// <  smaller
// >= greater than equal to
// <= smaller than equal to

//  21/10/2023

//  FIND IF NUMBER IS PRIME

//  PRIME - THE NUMBER WHICH IS DIVISIBLE BY 1 AND ITSELF

// 1) start
// 2) input n
// 3) div=2
// 4) while div<N do
//    if N%div==0 do
//       print not prime num
//         exit
//    else
//       div=div+1
// 5) print prime num
// 6) Exit

// import java.util.*;
// class Basic{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter any num");
//         int num=sc.nextInt();
//         int div=2;

//         while(div<num){
//             if(num%div==0){
//                 System.out.println(num +"is not prime");
//                 break;
//             }
//             else{
//                 div=div+1;
//                 System.out.println(num +"is prime");
//                 break;

//                         }

//         }
//     }
//     }


// SUM OF FIRST N NATURAL NUMBER

// 1) start
// 2) input n
// 3) val=1 & sum=0
// 4) while val<=n do
//    sum = sum+value
//    value++
// 5) print sum
// 6) Exit

// import java.util.*;
// class Basic{
//     public static void main(String[] args) {
//         System.out.println("enter any num:");
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int val=1;
//         int sum=0;

//         while(val <= num){
//             sum=sum+val;
//             val++;
//         }
//         System.out.println("sum is :"+sum);
//     }
// }

// import java.util.*;

/**
 * Basic
 //  */
// public class Basic {

//     public static void main(String[] args) {

//         int a = 10;
//         int b = 18;
//         int c = 13;

//         if(a>b){
//             if(a>c)
//             System.out.println("a is largest num");
//             else{
//                 System.out.println("b is the largest num");
//             }

//         }
//     }
// }



