//package org.studyeasy;

// SWITCH STATEMENT

//    switch (variable){
//      case 1:
//      case 2:
//      case 3:
//      defult:
//      }

// import java.util.*;
//   class CondState{
//     public static void main(String[] args) {
//        System.out.println("enter jersy number");
//        Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();
//         switch(number) {
//             case 45 : System.out.println("Hitman rohit sharma");
//                     break;
//             case 18 : System.out.println("King virat kohli");
//                     break;
//             case 7 : System.out.println("Captain cool ms dhoni");
//                     break;
//             default : System.out.println("please enter correct number");



//         }
//     }
// }

// PROGRAM FOR CALCULATER

// import java.util.*;
//   class CondState{
//     public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);

//         System.out.println("enter value of a");
//         int a=sc.nextInt();

//         System.out.println("enter value of b");
//         int b=sc.nextInt();

//         System.out.println("enter value of operator");
//         char operater = sc.next().charAt(0);

//         switch(operater){
//             case '+' : System.out.println(a+b);
//                       break;
//             case '-' : System.out.println("a-b");
//                       break;
//             case '*' : System.out.println(a*b);
//                       break;
//             case '/' : System.out.println(a/b);
//                       break;
//             case '%' : System.out.println(a%b);
//                       break;
//             default : System.out.println("wrong operator");

//         }


//     }
// }



// INCOME TAX CALCULATOR

// import java.util.*;
// class CondState{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your income");
//         int income=sc.nextInt();
//         int tax;

//         if(income < 500000){
//             tax=0;
//         }
//         else if(income >= 500000 && income <1000000){
//             tax= (int) (income*0.2);
//         }
//         else{
//             tax= (int) (income*0.3);
//         }
//         System.out.println("your tax amount is :" +tax);
//     }
// }


// PRINT THE LARGEST OF 3 :

// import java.util.*;
// class CondState{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter three values");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         if((a>=b) && (a>=c)){
//             System.out.println("Largest num is : "+a);
//         }
//         else if((b>=a) && (b>=c)){
//             System.out.println("Largest num is : "+b);
//         }
//         else if((c>=a) && (c>=b)){
//             System.out.println("Largest num is : "+c);

//     }
//     }
// }


// TERNARY OPERATOR


// Variable = condition? statement1 : statement2;
//                                  // : _nahito

//  EX1) int larger =(5>3)? 5 : 3;

//  EX2) string type = (5%2==0)? even: odd;

// import java.util.*;
// class CondState{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println( "inter num:");
//         int num=sc.nextInt();
//         String type = ((num%2)==0)? "even":"odd";
//         System.out.println(type);

//     }
// }

