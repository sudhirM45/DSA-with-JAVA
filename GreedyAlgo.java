//package org.studyeasy;

//      #~ Greedy Algoritm:-

/*
~ greedy algorithm ko hamesh optimum problem me use kiya jata hai.
~ most case me greedy algo me sorting ka use kiya jata hai.
~ diye huve data ko sortinng me convert kiya jata hai.
~ Greedy algorithm ka koi fixed rule nahi hota.*/

/* Greedy Algorithm Defination:
Greedy Algo. is the problem solving technique where we make the locally optimum choice at each stages and hope to achieve a globle optimum.

#~ Pro and Cons of Greedy Algorithm:

Pro:
1. Easy and Simple.
2. Good enough Time Complexity.

Cons:
1. A lot of time, Globle optimum is not Achived.

*/


// Que No.1:- activity Section Problem:
// you are given N activity with their start and end times.select the maximum no.of activities that can be performed by a single person.assume that a sing person can do one activity at a time. Activities are sorted by the ending times.


// import java.util.*;
// public class GreedyAlgo {

//   public static void main(String str[]){
//     int start[] = {10,12,20};
//     int end[] = {20,25,30};

//     // cout hai jo activity ko count karega.
//     int maxAct = 0;
//     // index store karne keliye hum ak arraylist liya hai.
//     ArrayList<Integer> ans = new ArrayList<>();
//     ans.add(0);
//     // last end hoga shurvat vale ka end
//     int lastEnd = end[0];

//     for(int i=1; i<end.length; i++){
//       if(start[i] >= lastEnd){
//         maxAct++;
//         ans.add(i);
//         lastEnd = end[i];
//       }
//     }
//     System.out.println("Max Activities are = " + maxAct);

//     for(int i=0; i<ans.size(); i++){
//       System.out.print(("A" + ans.get(i)+" "));
//     }
//   }
// }

//import java.util.*;

// public class GreedyAlgo {

//   public static void main(String[] args) {
//     int A[] = {1,2,3};
//     int B[] = {2,1,3};

//     // Arrays.sort(A);
//     // Arrays.sort(B);

//     int minDiff =0;

//     for(int i=0; i<A.length; i++){
//       minDiff += Math.abs(A[i] - B[i]);
//     }

//     System.out.println("the minDiff is:" + minDiff);
//   }
// }






