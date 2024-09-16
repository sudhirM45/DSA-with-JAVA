//package org.studyeasy;
//    A queue is a linear data structure that follows the FIFO (First In, First Out) principle. In other words, elements are inserted at the end of the queue and removed from the beginning of the queue. Here are some key points about Java queues:

// Java Queue Interface:
// The Queue interface is part of the java.util package and extends the Collection interface.
// It defines the rules and operations for working with queues, including insertion and deletion.
// Since it’s an interface, you cannot directly instantiate it; you’ll need to use implementing classes.


// Implementing Classes:
// Two commonly used classes that implement the Queue interface in Java are:

// 1)LinkedList: A doubly-linked list that provides efficient queue operations.
// 2)PriorityQueue: A priority queue based on a min-heap or max-heap.

// Additionally, there’s an ArrayBlockingQueue class for implementing bounded queues.

// Characteristics of Java Queue:

// FIFO Behavior: Elements are added at the rear and removed from the front.

// Unbounded vs. Bounded Queues:

// Unbounded queues (from java.util) have no size limit.
// Bounded queues (from java.util.concurrent) have a fixed capacity.

// Deque (Double-Ended Queue):
// A type of queue that allows insertion and deletion from both ends.
// Also considered thread-safe.

// Blocking Queues:
// Another type of thread-safe queue used for producer-consumer scenarios.
// Does not support null elements.

// Null Values: Blocking queues throw a NullPointerException if null values are attempted.


// Example Usage:
// Suppose you want to create a queue of integers:
// Java

// import java.util.LinkedList;
// import java.util.Queue;

// public class QueueExample {
//     public static void main(String[] args) {
//         Queue<Integer> myQueue = new LinkedList<>();
//         myQueue.add(10); // Enqueue
//         myQueue.add(20);
//         myQueue.add(30);

//         System.out.println("Front element: " + myQueue.peek()); // Front element
//         System.out.println("Dequeue: " + myQueue.poll()); // Dequeue
//         System.out.println("Updated front element: " + myQueue.peek());
//     }
// }
//  OutPut:-
// Front element: 10
// Dequeue: 10
// Updated front element: 20


//
//  in the queue their are two main part 1.front ans 2.rear

//  3 Main opration in queue

//  1.add();
//   add in queue is also known as Enque.

//  2.remove();
//   to remove in the queue.
//    it is also called as Dequeue.

//  3.peek();
//   to see the element in the queue.




//    circulating queue:
//    A circulating queue is like a line in a store where people enter at the end and exit from the front. However, in a circulating queue, when the line gets full, instead of stopping people from entering, the first person in line exits to make room for the new person.

// import java.util.*;

// public class QueueA{

// static class Node{

//   int data;
//   Node next;

//   Node(int data){
//     this.data = data;
//     this.next = null;
//   }
// }
// static class Queue{

//   static Node head = null;
//   static Node tail = null;
//   // static int arr[];
//   // static int size;
//   // static int rear;
//   // static int front;

//   // Queue(int n){
//   //   arr = new int[n];
//   //   size = n;
//   //   rear = -1;
//   //   front = -1;
//   // }

//   public static boolean isEmpty(){
//     return head == null && tail == null;
//   }

//   public static void add(int data){
//     Node newNode = new Node(data);

//     if(head == null){
//       head = tail = newNode;
//       return;
//     }
//       tail.next = newNode;
//       tail = newNode;
//   }

//   public static int remove(){
//     if(isEmpty()){
//       System.out.println("queue is empty.");
//       return -1;
//     }

//     int front = head.data;

//     if(tail == head){
//       tail = head = null;
//     } else{
//       head = head.next;
//     }
//     return front;

//   }

//   public static int peek(){
//     if(isEmpty()){
//       System.out.println("queue is empty.");
//       return -1;
//     }

//     return head.data;
//   }
// }
//   public static void main(String[]args){
//     //Queue q = new Queue();

//     Queue<Integer> q = new LinkedList<>();
//     q.add(1);
//     q.add(2);
//     q.add(3);

//     while(!q.isEmpty()){
//       System.out.println(q.peek());
//       q.remove();
//     }
//   }
// }


// Question 2: form Queue using two Stack.

//process:-

// 1.add
// s1 khali hai to use add kardhenge.
// agar s1 khali nahi hai to s1 ke element ko s2 me add kardenge.
// fir s1 me new element ko add/push kardenge .
// aur fhirse s2 ke element ko s1 me add kar denge.

// 2.remove
// s1 se hume element ko pop/remove karna hai.

// import java.util.*;

// public class QueueA {

//   static class Queue{
//     static Stack<Integer> s1 = new Stack<>();
//     static Stack<Integer> s2 = new Stack<>();


//     public static boolean isEmpty(){
//       return s1.isEmpty();
//     }

//     public static void add(int data){
//       while(!s1.isEmpty()){
//         s2.push(s1.pop());
//       }

//       s1.add(data);

//       while(!s2.isEmpty()){
//         s1.push(s2.pop());
//       }
//     }

//     public static int remove(){
//       if(isEmpty()){
//         System.out.println("queue is empty");
//         return -1;
//       }
//       return s1.pop();
//     }

//     public static int peek(){
//       if(isEmpty()){
//         System.out.println("queue is empty");
//         return -1;
//       }
//       return s1.peek();
//     }
//   }

//   public static void main(String[] args) {
//     Queue q = new Queue();

//     q.add(1);
//     q.add(2);
//     q.add(3);


//     while (!q.isEmpty()) {
//       System.out.println(q.peek());
//       q.remove();
//     }


//   }
// }

// Question 3: Stack using 2 queues.

// import java.util.*;

// public class QueueA{

//   static class Stack{
//     static Queue<Integer> q1 = new LinkedList<>();
//     static Queue<Integer> q2 = new LinkedList<>();

//     public static boolean isEmpty(){
//       return q1.isEmpty() && q2.isEmpty() ;
//     }

//     public static void push(int data){

//       if(!q1.isEmpty()){
//         q1.add(data);
//       } else{
//         q2.add(data);
//       }
//     }

//     public static int pop(){

//       if(isEmpty()){
//         System.out.println("stack is empty");
//         return -1;
//       }

//       int top = -1;

//       if (!q1.isEmpty()){
//         while(!q1.isEmpty()){
//           top = q1.remove();
//           if(!q1.isEmpty()){
//             break;
//           }
//           q2.add(top);
//         }
//       } else{

//         while(!q2.isEmpty()){
//           top = q2.remove();
//           if(!q2.isEmpty()){
//             break;
//           }
//           q1.add(top);
//         }
//       }
//       return top;

//     }

//     public static int peek(){
//       if(isEmpty()){
//         System.out.println("stack is empty");
//         return -1;
//       }

//       int top = -1;

//       if (!q1.isEmpty()){
//         while(!q1.isEmpty()){
//           top = q1.remove();
//           q2.add(top);
//         }
//       } else{

//         while(!q2.isEmpty()){
//           top = q2.remove();
//           q1.add(top);
//         }
//       }
//       return top;
//     }
//   }
//   public static void main(String[] args) {
//     Stack s = new Stack();

//     s.push(1);
//     s.push(1);
//     s.push(1);

//     while (!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();
//     }
//   }
// }
//
//        23/3/2024

// first non-repeating letter in a stream of char , char are lower case only
// import java.util.*;

// public class QueueA {

//   public static void printNonRepeting(String str){
//     int freq[] = new int[26];
//     Queue<Character> q = new LinkedList<>();

//     // pahile to string me triverse karenge
//     for(int i=0; i<str.length(); i++){
//       char ch = str.charAt(i);

//       // badme is char ko queue me add karna.
//       q.add(ch);
//       // aur freq ko badana hai.
//       freq[ch-'a']++;

//       // fir hume check karna hai kya queue ke andar front pe non-repiting element exits karata hai. to hum use print karenge nahi to second case agar queue empty hai to us time me -1 ko return kardenge.

//       while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
//         q.remove();
//       }
//       if(q.isEmpty()){
//         System.out.print(-1+ " ");
//       } else{
//         System.out.print(q.peek()+ " ");
//       }

//     }
//   }


// InterLeave 2 Halves of a Queue of a even length.

//   public static void InterLeave(Queue<Integer>q){

//     Queue<Integer> firstHalf = new LinkedList<>();
//     int size = q.size();

//     for(int i=0; i<size/2; i++){
//       firstHalf.add(q.remove());
//     }

//     while(!firstHalf.isEmpty()){
//       q.add(firstHalf.remove());
//       q.add(q.remove());
//     }
//   }

//   // reverse the queue:

//   public static void reverseQueue(Queue<Integer> q){
//     Stack<Integer> s = new Stack<>();

//     while (!q.isEmpty()) {
//       s.push(q.remove());
//     }

//     while(!s.isEmpty()){
//       q.add(s.pop());
//     }
//   }
//   public static void main(String[] args) {
//     // String str = "aabccxb";
//     // printNonRepeting(str);
//     Queue<Integer> q = new LinkedList<>();

//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);
//     reverseQueue(q);

//     while(!q.isEmpty()){
//       System.out.print(q.remove()+" ");
//     }
//     System.out.println();
//     // q.add(6);
//     // q.add(7);
//     // q.add(8);
//     // q.add(9);
//     // q.add(10);

//     // InterLeave(q);
//     // while(!q.isEmpty()){
//     //   System.out.print(q.remove() + " ");
//     // }
//     // System.out.println();


//   }
// }


//  DEQUE : Double Ended Queue.

//  ~ java ke andar deque ak interFace hota hai.

//  Both Ends Access:
//Unlike a regular queue where people join at the back and leave from the front, in a deque, people can come in from both the front and the back, and they can leave from both ends too.

// Flexible Size:
//The line can grow longer or shorter depending on how many people are joining or leaving.
// You Can Check Both Ends: You can see who's at the front of the line and who's at the back.

// Simple Functions: You have simple actions like adding someone to the front or back, removing someone from the front or back, and checking if the line is empty or how many people are in it.

// Example Uses:

// Changing Mind: Imagine you're at a cafeteria and you want to change your order. You can leave from the front and join the line again at the back.

// Sharing Food: If you're sharing food with friends, you can add plates to the front of the line if you're serving them, or to the back if you're getting served.

// Keeping Track: You can always see who's next in line or who's at the end without having to go through the whole line.

// Why It's Handy:

// Flexible Movement: It's handy when you need to manage things coming in and going out from different sides.

// Easy Tracking: You can easily keep track of what's at the front and back without shuffling through everything.

// So, a deque is like a line where people can join or leave from both ends, and it's handy when you need to manage things moving in and out from different sides easily.
//
//import java.util.Deque;
//import java.util.LinkedList;
//
//public class QueueA {
//
//    public static void main(String[] args) {
//        Deque<Integer> dq = new LinkedList<>();
//
//        dq.addFirst(1);
//        dq.addFirst(2);
//        dq.addFirst(3);
//        dq.addLast(4);
//        dq.addLast(5);
//        dq.addLast(6);
//
//        System.out.println(dq);
//
//        dq.removeFirst();
//        System.out.print(dq);
//        dq.removeLast();
//
//        System.out.println(dq);
//
//    }
//}
//
