//package org.studyeasy;

//  # ARRAYLIST ==>
//  array data structure java ke andar inbild fun hota hai use khudse banane ki jarurt nahi hai.
//  array list me data liner form me store hota hai.

//  why use of arraylist?
//  ===> ~array ke andar elements fixed hote hai.
//       ~ak bar agar array define ho gaya to usame hum change nahi kar sakte.
//       ~is liye arraylist ye dynamic size hota .
//       ~hum arraylist me easily changes kar sakte hai aur ye sub java ke aandar inbulid hota hai.

//  --> arraylist ke aandar sirf non-primitive data type hi banti hai.
//  --> primitive data type ko arraylist me directly store nahi kar sakte hai.
//  --> arraylist ak Class hai java ke aandar.

//  #~ syntax of arraylist define in arays:
//      arraylist ko use karne kr liye hum pahile import karna hoga kunki arraylist ak package ke aandaar hai.


//  #~ Impalementation in ARRAYLIST :
//  --> ~ arraylist internally arrays ki form me hi implement hoti hai.
//      ArrayList<Integer>list = new ArrayList<>(); ---> jai se hi me ye line likhunga,
//      java ke aanadr ak array ban jata hai and us array ka ak particular size hota hai.
//      chaliye samzate hai ki array ka size 10 hai and suppose ki array bhar gaya to java is array size ke
//      double size ka ak aur array banaye internally.

//


//--------------x-------------x---------------x---------------------x---------------x-------------x---------------

// import java.util.*;
// public class ArrList {

//     public static void Swap(ArrayList<Integer>list, int idx1, int idx2){

//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }
//public static void main(String[] args) {
//ArrayList<Integer>list = new ArrayList<>();// {<>}--> angular brack sirf isliye hai ki hum konsa data type
//                                                         use kar rahe hai o define karne ke liye.

// 1--> add element in arraylist: ~~O(1)

// list.add(2);
// list.add(9);
// list.add(5);
// list.add(6);
// list.add(10);

// sorting the array:

// assending order:
// System.out.println(list);
// Collections.sort(list);
// System.out.println(list);

// descending order:
//Collections.sort(list, Collections.reverseOrder());// second parameter ak comparator hai
// Comparator java ke aandar ak fun hote hai jo logic define karte hai ki kis tarhase sorting honi chahiye.
//System.out.println(list);


// int idx1 = 1; int idx2 = 3;
// System.out.println(list);
// Swap(list, idx1, idx2);
// System.out.println(list);



// max element Print:

// int Max = Integer.MIN_VALUE;
// for(int i=0; i<=list.size()-1; i++){
//     // if(Max < list.get(i)){
//     // Max = list.get(i);
//     //}
//     Max = Math.max(Max,list.get(i));
// }
// System.out.println("max element = " + Max);



//list.add(2,16);
//System.out.println(list.size()); // here ,size is the function and method.


// print reverse arraylist:

// for(int i=list.size()-1; i>=0; i--){
//     System.out.print(list.get(i) +" ");
// }
// System.out.println();


//  1--> size of arraylist:

// for(int i=0; i<list.size(); i++){
//     System.out.print(list.get(i)+" ");
// }
// System.out.println();

// 2--> get oparation: ~~O(1)

// int element = list.get(3);
// System.out.println(element);

// 3--> delete opration: ~~O(n)

// list.remove(3);
// System.out.println(list);

// 4--> set opration: ~~O(n)

// list.set(3, 14);
// System.out.println(list);

// 5--> contains: ~~O(n)

// System.out.println(list.contains(3));
// System.out.println(list.contains(7));
//     }
// }

//------------------------------------------------------------------------------------------------------------------


//  #~ MULTIDIMENSIONAL ARRAYLIST:
//      Mltidimentional yani ak main list hoga uske anndar bohut sare sub list present honge.
//      arraylist ko arraylist me kaise store karte :
//      --->> [ Arraylist<Arraylist<Integer>>mainlist = new Arraylist<>(); ]


// import java.util.*;
// public class ArrList {

//     public static void main(String[] args) {


//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();

//         for(int i=1; i<=5; i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//         }

//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         System.out.println(mainList);

//         // nested loop;
//         for(int i=0; i<mainList.size(); i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//-------------x------------x-----------------x---------------------x----------------x----------------x------------x-


//  #-->> Problem.2 Container with most water.
//  #Qs2.--> for a give n line on x axis use two lines for a container it's hold max water.

//  #~~ TWO POINTER APPROACH :

//  BASICALLY  isme hum do ponter lete hai. 1st is (left poninter) and second is (right pointer)
//  to hum apna left pointer initialize karrnge zero se and right pointer n-1 se.
//  small size ki ht hamesh water ko control karti hai is liye hum small ht ko ++ karte hai.


// import java.util.*;
// public class ArrList {

// Bruteforce

// public static int StoreWater(ArrayList<Integer>height) {

//     int maxwater =0;
//     for(int i=0; i<height.size(); i++){
//         for(int j=i+1; j<height.size(); j++){
//             int ht = Math.min(height.get(i), height.get(j));
//             int width = j - i;
//             int currWater = ht * width;
//             maxwater = Math.max(maxwater, currWater);
//         }
//     }
//     return maxwater;
// }

//     public static int storeWater(ArrayList<Integer> height){

//         int maxwater = 0;
//         int lp = 0;
//         int rp  = height.size()-1;

//         while(lp<rp){

//             // cal maxwater
//             int ht = Math.min(height.get(lp), height.get(rp));
//             int width = rp - lp;
//             int currWater = ht * width;
//             maxwater = Math.max(maxwater, currWater);

//             // updating the pointers.
//             if(lp<rp){
//                 lp++;
//             } else{
//                 rp--;
//             }
//         }
//         return maxwater;
//     }

//     public static boolean PairSum1(ArrayList<Integer> list,int target){

//         int lp =0;
//         int rp =list.size()-1;
//         while( lp < rp){

//             if(list.get(lp)+ list.get(rp) == target){
//                 return true;
//             }
//             if(list.get(lp)+ list.get(rp) < target){
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }
//         return false;
//     }

// //  #~Qs.3 find sum of nums
// //     approach for solving the problem is:
// //      1.hum find out karenge pivot point pivot pt o pt hota hia jahase array brack hota hai.
// //      2.is problem ko solve karne keliye hum modular arithmatic ka use karte hai.
//     public static boolean PairSum2(ArrayList<Integer> list, int target){

//         int n =list.size();
//         int BP = -1;
//         for(int i=0; i<list.size(); i++){
//             if(list.get(i) > list.get(i+1)){
//                 BP = i;
//                 break;
//             }
//         }


//         int lp = BP+1;
//         int rp = BP;

//         while(lp != rp){
//             // case 1:
//             if(list.get(lp)+list.get(rp) == target){
//                 return true;
//             }
//             // case 2:
//             if(list.get(lp)+list.get(rp) < target){
//                 lp = (lp+1) % n;
//             } else{
//                 rp = (n+rp-1) % n;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//          list.add(11);
//          list.add(15);
//          list.add(6);
//          list.add(8);
//          list.add(9);
//          list.add(10);

//          int target = 16;

//         System.out.println(PairSum2(list, target));
//     }
// }

// import java.util.*;
// public class ArrList {

//     // public static int StoreWater(ArrayList<Integer> height){
//     //     int maxwater = 0;  // ye isliye hai ki agar line one hi ra ha to hum pair nahi bana sakate.

//         // for(int i=0; i<height.size(); i++){
//         //     for(int j=i+1; j<height.size(); j++){
//         //         int ht = Math.min(height.get(i),height.get(j));
//         //         int width = j-i;
//         //         int currWater = ht * width;
//         //         maxwater = Math.max(maxwater,currWater);
//         //     }
//         // }
//     //     return maxwater;
//     // }

//         public static int StoreWater(ArrayList<Integer>height){

//             int maxwater = 0;
//             int lp = 0;
//             int rp = height.size()-1;

//             while(lp < rp){

//                 int ht = Math.min(height.get(lp), height.get(rp));
//                 int width = rp - lp;
//                 int currWater = ht * width;
//                 maxwater = Math.max(maxwater, currWater);

//                 if(lp < rp ){
//                     lp ++;
//                 } else {
//                     rp --;
//                 }
//             }
//             return maxwater;
//         }
//     public static void main(String[] args) {

//         ArrayList<Integer> height = new ArrayList<>();

//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println( "the maximum water store in the container is : " + StoreWater(height));

//     }
// }


//import java.util.*;
//public class ArrList {

// public static boolean pairSum1(ArrayList<Integer> list,int target){


//     for(int i=0; i<list.size(); i++){
//         for(int j=i+1; j<list.size(); j++){
//             if(list.get(i) + list.get(j) == target){
//                 return true;
//             }
//         }
//     }

//     return false;
// }

//    public static int pairSum2(ArrayList<Integer> list,int target){
//
//        int lp=0;
//        int rp=list.size()-1;
//
//        while(lp != rp){
//            if(list.get(lp) + list.get(rp) == target){
//                return lp * 1000 + rp;
//            }
//            if(list.get(rp) + list.get(lp) < target){
//                lp++;
//            } else {
//                rp--;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//
//        int target = 8;
//
//        System.out.println(pairSum2(list, target));
//
//    }
//}


//import java.util.*;
//
//public class ArrList {
//    public static void main(String args[]){
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(12);
//        list.add(2);
//        list.add(12);
//        list.add(24);
//        System.out.println(list);
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println(list);
//
//        int max = Integer.MIN_VALUE;
//
//        for(int i=0; i<list.size(); i++){
//            if(max < list.get(i)){
//                max = list.get(i);
//            }
//            max = Math.max(max,list.get(i));
//        }
//        System.out.println(max);
//
////        list.remove(0);
////        System.out.println(list);
//
//
//    }
//}
