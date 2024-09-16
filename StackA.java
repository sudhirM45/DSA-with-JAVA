//package org.studyeasy;

//  => jo data or object ak ke upar ak store hota hai use stack kaha jata hai.
//   ==> recursion ke andar jo memory ka stack hota hai use implicit kahete hai.
//   => implicit yani computer ne kudhse banaya hoga(inbuild Func) jise hum user ko banane ki jarurat nahi hoti.
//   ==> yaha pe hum explicit stack ko banane vale hai. explicit yani hume kudse banana padta hai.
//   => Real life example : ~ Books stored vertically one after one.
//                          ~ Like Crroms coins.
//                          ~ Stones.
//  --> stack ka strucure ak bukket ki tarah hota hai,jise me hum apne data ko store karte hai.
//  ==> stack contains following Oprations:
//     1)PUSH 0(1):
//        => push yani data ko stack me upper push karna .
//        => hamesh stack me hum oprations upper se hi karte hai.
//        => push yani data ko stack me add karna.
//     2)POP 0(1):
//        => pop means upper vale element ko bahar nikalne ka.
//     3)PEEK 0(1):
//        => peek yani jb bhi ham data ko dekhenge to uper se zhanke dekhenge.

//  ==> stack ke undar jo upper vala element hota hi use (LIFO) kehate hai.
//      (LIFO) means Last In and First Out.
//      jo Element last me add hotta hai and first nikalta hai.


// IMPLIMENTATION OF STACK IN ARRAYLIST:-

// import java.util.*;

// public class Stack {
//   static class innerStack {
//     static ArrayList<Integer> list = new ArrayList<>();

//     public static boolean isEmpty(){
//       return list.size() == 0;
//     }

//     public static void push(int data){
//       list.add(data);
//     }

//     public static int pop(){
//       if(isEmpty()){
//         return -1;
//       }
//       int top = list.get(list.size()-1);
//       list.remove(list.size()-1);
//       return top;
//     }

//     public static int peek(){
//       if(isEmpty()){
//         return -1;
//       }
//       return list.get(list.size() - 1);
//     }

//   }
//   public static void main(String[] args) {
//     innerStack s = new innerStack();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while(!s.isEmpty()){
//       System.out.print(s.peek()+ " ");
//       s.pop();
//     }
//   }
// }

//  IMPLIMENTATION OF STACK IN LINKEDLIST:-

// public class Stack {
//   public class Node {
//       int data;
//       Node next;

//       Node(int data) {
//           this.data = data;
//           this.next = null;
//       }
//   }

//   public class InnerStack {
//       Node head = null;

//       public boolean isEmpty() {
//           return head == null;
//       }

//       public void push(int data) {
//           Node newNode = new Node(data);
//           if (isEmpty()) {
//               head = newNode;
//               return;
//           }
//           newNode.next = head;
//           head = newNode;
//       }

//       public int pop() {
//           if (isEmpty()) {
//               return -1;
//           }
//           int top = head.data;
//           head = head.next;
//           return top;
//       }

//       public int peek() {
//           if (isEmpty()) {
//               return -1;
//           }
//           return head.data;
//       }
//   }

//   public static void main(String[] args) {
//       Stack stack = new Stack();
//       InnerStack s = stack.new InnerStack();
//       s.push(1);
//       s.push(2);
//       s.push(3);

//       while (!s.isEmpty()) {
//           System.out.println(s.peek());
//           s.pop();
//       }
//   }
// }

//                                    19 / 3 / 24

// push an number or element in the bottom of stack:-

// import java.util.*;

// public class StackA {
// public static void pushAtBottom(Stack<Integer> s,int data){
//     if(s.isEmpty()){
//       s.push(data);
//       return;
//     }
//     int top = s.pop();
//     pushAtBottom(s,data);
//     s.push(top);
// }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);
//         while(!s.isEmpty()){
//             System.out.print(s.pop());
//         }

//     }
// }

//  Problem reverse the stack:-

// import java.util.*;
// public class StackA{

//     public static String reverseString(String str){
//     Stack<Character> s = new Stack<>();
//     int idx =  0;//jo dikhayega ki string ke konse idx pe hai.

//     while(idx < str.length()){
//         s.push(str.charAt(idx));
//         idx++;
//     }

//     StringBuilder result = new StringBuilder("");
//     while (!s.isEmpty()) {
//         char curr = s.pop();  // ak ak char la baher kadhayla.
//         result.append(curr);
//     }

//     return result.toString();
// }


//     public static void main (String [] args){
//         String str = "sudhir subhash mhamane";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }

//              STRINGBUILDER IN JAVA:-

// StringBuilder in Java is a class that allows you to create a mutable (modifiable) sequence of characters. Unlike the immutable String class, which cannot be changed once defined, StringBuilder provides an alternative when you need to modify a character sequence dynamically 123.

// Here are some key points about StringBuilder:

// Mutability: A StringBuilder object can be modified after creation, making it suitable for scenarios where you need to build or manipulate strings efficiently.
// Non-Synchronized: Unlike its counterpart, StringBuffer, StringBuilder is not synchronized, which means it is not thread-safe. If you’re working in a multi-threaded environment, consider using StringBuffer instead.
// Constructors:
// StringBuilder(): Creates an empty StringBuilder with an initial capacity of 16 characters.
// StringBuilder(String str): Initializes a StringBuilder with the specified string.
// StringBuilder(int length): Creates an empty StringBuilder with a specified capacity.
// Important Methods:
// append(String s): Appends the specified string to the existing string.
// insert(int offset, String s): Inserts the given string at the specified position.
// replace(int startIndex, int endIndex, String str): Replaces a portion of the string.
// delete(int startIndex, int endIndex): Removes characters from the string.
// reverse(): Reverses the string.
// charAt(int index): Retrieves the character at the specified position.
// length(): Returns the length (number of characters) of the string.
// substring(int beginIndex): Retrieves a substring starting from the specified index.
// substring(int beginIndex, int endIndex): Retrieves a substring within the specified range.
// Example:
// Java

// public class StringBuilderExample {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello ");
//         sb.append("Java"); // Original string is changed
//         System.out.println(sb); // Prints "Hello Java"
//     }
// }


// Question NO:3
// reverse the stack.

// import java.util.*;

// public class StackA {

//     public static void pushAtBottom(Stack<Integer> s,int data){
//         if(s.isEmpty()){
//           s.push(data);
//           return;
//         }
//         int top = s.pop();
//         pushAtBottom(s,data);
//         s.push(top);
//     }

//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }

//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s,top);
//     }


//     public static void printStack(Stack<Integer>s){
//         while(!s.isEmpty()){
//             System.out.print(s.pop()+ " ");
//         }
//     }

//   public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(6);
//         s.push(5);
//         s.push(4);
//         s.push(3);
//         s.push(2);
//         s.push(1);

//         reverseStack(s);
//         printStack(s);
//     }
// }

// Question No 4: Stock Span Problem:

// What Is Stock Span?
// Imagine you’re tracking the stock prices of a company over several days.
// The stock span for a particular day tells you how many consecutive days (including that day) the stock price was less than or equal to the current day’s price.
// How Does It Work?
// We’ll use a stack (like a stack of plates) to keep track of days.
// For each day, we’ll compare its stock price with the previous days’ prices.
// If the current day’s price is higher than the previous day’s price, we remove the previous day from the stack.
// We keep doing this until we find a day with a higher stock price or until the stack is empty.
// The number of days we removed from the stack gives us the stock span for the current day.
// Why Is It Useful?
// Stock spans help investors understand trends.
// Longer spans mean the stock price has been consistently rising.
// Shorter spans may indicate volatility or sudden changes.
// Example:
// Suppose the stock prices are: [100, 80, 60, 70, 60, 85, 100].
// The stock spans would be: [1, 1, 2, 2, 1, 5, 7].
// This tells us how many days the stock price remained stable or increased.

// import java.util.*;

// public class StackA {

//     public static void stockSpan(int stocks[], int span[]){
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for(int i=1; i<stocks.length; i++){
//             int currPrice = stocks[i];

//             while(!s.isEmpty() && currPrice > stocks[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i] = i+1;
//             } else{
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }

//             s.push(i);
//         }
//     }
//   public static void main(String[] args) {
//     int stocks[] = {100,80,60,70,60,85,100};
//     int span[] = new int[stocks.length];
//     stockSpan(stocks,span);

//     for(int i=0; i<span.length; i++){
//         System.out.print(span[i]+" ");
//     }

//   }
// }

// Question No 5: Greatest element in rightside:

// import java.util.*;

// public class StackA {
//   public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         int arr[] = {6,8,0,1,3};
//         int nxtGreater[] = new int[arr.length];

//         for(int i=arr.length-1; i>=0; i--){

//             while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nxtGreater[i] = -1;
//             } else{
//                 nxtGreater[i] = arr[s.peek()];
//             }
//             s.push(i);
//         }

//         for(int i=0; i<nxtGreater.length; i++){
//             System.out.print(nxtGreater[i] +" ");
//         }
//         System.out.println();
//     }
// }


// Question No 6: valid parentheses:

// import java.util.*;

// public class StackA {

//     public static boolean isValidParentheses(String str){
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);

//             if( ch == '(' || ch == '{' || ch == '['){
//                 s.push(ch);
//             } else{
//                 // closing
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 if ((s.peek() == '(' && ch == ')')
//                     ||  (s.peek() == '{' && ch == '}')
//                     ||  (s.peek() == '[' && ch == ']')){
//                     s.pop();
//                 } else{
//                     return false;
//                 }
//             }
//         }

//         if(s.isEmpty()){
//             return true;
//         } else{
//             return false;
//         }
//     }
//   public static void main(String[] args) {
//     String str = "))))))";
//     System.out.println(isValidParentheses(str));
//   }
// }

// Question NO 7: Duplicate Parentheses :

// import java.util.*;

// public class StackA {

//     public static boolean isDuplicate(String str){
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             //closing

//             if(ch == ')'){
//                 int count = 0;

//                 while (s.peek() != '(') {
//                     s.pop(); // jitne be oprend ,oparetion honege pair ke bich me o hat jayenge
//                     count++;
//                 }
//                 if(count < 1){
//                     return true;
//                 } else{
//                     s.pop();
//                 }
//             } else{ // opening ,opration,oparand
//                 s.push(ch);
//             }
//         }
//         return false;
//     }
//   public static void main(String[] args) {
//     String str = "((a+b))";
//     String str2 = "(a-b)";
//     System.out.println(isDuplicate(str)); //duplicate present
//     System.out.println(isDuplicate(str2)); // no duplicate
//   }
// }

// Question No 8: Maximum area in histrogram.

// import java.util.*;

// public class StackA {

//     public static void maxArea(int arr[]){

//         int maxArea = 0;
//         int nsr[] = new int[arr.length];
//         int nsl[] = new int[arr.length];

//         //Next smaller right
//         Stack<Integer> s = new Stack<>();

//         for(int i=arr.length-1; i>=0; i--){
//             while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsr[i] = arr.length;
//             } else{
//                 nsr[i] = s.peek();
//             }
//             s.push(i);
//         }

//         //Next smaller left
//         s = new Stack<>();

//         for(int i=0; i<arr.length; i++){
//             while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsl[i] = -1;
//             } else{
//                 nsl[i] = s.peek();
//             }
//             s.push(i);
//         }
//         // current area
//         for(int i=0; i<arr.length; i++){
//             int heigth = arr[i];
//             int width = nsr[i] - nsl[i] -1;
//             int currMax = heigth * width;
//             maxArea = Math.max(maxArea, currMax);
//         }

//         System.out.println("Maximum area in histogram is : " + maxArea);
//     }
//   public static void main(String[] args) {
//     int arr[] = {2,1,5,6,2,3};
//     maxArea(arr);
//   }
// }

