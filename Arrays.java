// ARRAYS :-
// LET suppose that we have to store the 3 sub marks so how we can store, as follows:
//      int sub1=78; int sub2=89; int sub3=90; but
//     if someone said you have to store 50 sub marks so it going to be difficult
//     store like as above for that we can use Arrays.

//    #~ java work on zero-based indexing.
//    #~ in java always indexing starting from zero.

//  FORMAL DEFINATION OF ARRAYS :
//     IT IS A LIST OF ELEMENT OF SAME TYPE
//      placed in contiguous memory location

//   for Ex: if("mango" "apple" ,'8.2','45')  so this will wrong in arrays because
//               we can store only same data type like - int, float,char: at one time
//              (rohit,virat,dhoni) or (18,45,07) this will be correct.


// 29/10/2023:

// public class Arrays{
//     public static void main(String[] args) {
//         System.out.println("hellp ggg");
//     }
// }

// OPRATIONS IN ARRAYS :

//   #~ Create
//   #~ Input
//   #~ Output
//   #~ Update

//   Creating an Arrays:

//   dataType arrayName[] = New dataType[size];
//     New- keyword which help us to finding the location in computer memory.
//     Ex:- int marks[] = new int[50];

// class Arrays {
//     public static void main(String[] args) {
//         int marks[] = new int[50];

//         int number[] = {1,2,3,};

//         float num[] = {1.2f,2.4f,4.5f,}; // always write f in front of floating value.

//         String fruit[] = {"mango","apple","banana"};
//     }
// }

// Passing arrays as argument:
//
// arrays are passes by reference


//import java.util.*;

// class Arrays {
//     public static void update(int marks[]){
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i] +1;
//         }
//     }
//         public static void main(String[] args) {
//         int marks[] = {91, 92, 93};
//         update(marks);

//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }


// // inputs/output in arrays :

// import java.util.*;
// class Arrays{

//     public static void main(String[] args) {
//         int marks[] = new int[100];
//         Scanner sc= new Scanner(System.in);

//         marks[0]= sc.nextInt();
//         marks[1]= sc.nextInt();
//         marks[2]= sc.nextInt();

//         System.out.println("phy :"+ marks[0]);
//         System.out.println("chem :"+ marks[1]);
//         System.out.println("math :"+ marks[2]);

//         int add = (marks[0]+ marks[1]+ marks[2]);
//         System.out.println("sum is :"+ add);


//         System.out.println();
//     }

// }



// LINEAR SEARCH :
//
//import java.util.*;
//class Arrays {
//
//    public static int Linear_Search(int numbers[], int key){
//        for(int i=0 ; i<numbers.length; i++){
//            if( numbers[i] == 14){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10,12,14};
//        int key=14;
//        int index = Linear_Search(numbers, key);
//        if(index == -1){
//            System.out.print( "Not Found");
//        }else{
//            System.out.println("the key is on index  "+index);
//        }
//
//    }
//}

// import java.util.*;
// class Arrays{

//     public static int Menu_Search(String Menu[], String key){
//             for(int i=0; i<Menu.length ; i++){
//             if(Menu[i] == "vada pav"){
//              return i;
//              }
//         }
//             return -1;
//     }


//     public static void main(String[] args) {
//     String Menu[] = {"vada pav", "kachori", "samosa", "coke"};
//     String key = "vada pav";

//         int index = Menu_Search(Menu, key);
//         if(index == -1){
//             System.out.println("Not Found");
//         } else{
//             System.out.println("the keys on index :" + index);
//          }


//        }
//   }


// LARGEST NUMBER IN ARRAYS:
// finding lagest num in given arrays:

// ( Minus infinity:- integer.MIN_VALUE)
// ( Plus infinity:- integer.MAX_VALUE)
//

// import java.util.*;
// class Arrays{

//     public static int Largest_Value(int numbers[]){
//         int lagest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<numbers.length; i++){

//            if(lagest<numbers[i]){
//             lagest = numbers[i];
//            }

//            if(smallest > numbers[i]){
//             smallest = numbers[i];
//            }
//         }

//         System.out.println("samllest value is "+ smallest);
//         return lagest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8};

//         System.out.println("largest value is "+Largest_Value(numbers));

//     }
// }
//
//
//           30/10/2023:

//  #~ BINARY SEARCH :

// binary search required sorted arrays.

//
//   #~ pseudo_code:
//    start=0, end=n-1
//    while(start <= end)
//         find mid  // (start + end) / 2
//           compare mid & key
//              mid == key  - found
//              mid < key  - right
//              mid > key  - left

// import java.util.*;
// class Arrays{
//     public static int Binary_Search(int numbers[],int key){
//         int start = 0;
//         int end = numbers.length-1;

//         while(start <= end){
//             int mid = (start + end ) / 2;
//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid] < key){
//                 start = mid+1;
//             }else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 4, 6, 8 , 10, 12, 14, 15,};
//         int key=10;

//         System.out.println("the index for key is: "+Binary_Search(numbers, key));
//     }
// }

// time complexity for binary search:
//    binary search = (log n)

// import java.util.*;
// class Arrays{
//     public static void Reverse(int numbers[]){
//         int start = 0;
//         int end = numbers.length - 1;

//         while(start < end){
//             int temp = numbers[start];
//             numbers[start] = numbers[end];
//             numbers[end] = temp;

//             start++;
//             end--;
//         }
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1, 2, 3, 4, 5, 6,};
//         Reverse(numbers);
//         for(int i=0; i<numbers.length; i++){
//         System.out.print(numbers[i]+" ");
//     }
//         System.out.println();
//     }

// }

// we solve the problem using nested loop

// import java.util.*;
// class java{
//     public static void print_Pairs(int numbers[]){
//         int total_pairs = 0;
//         for(int i=0 ; i<numbers.length; i++){
//             int curr=numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("("+ curr+ "," +numbers[j] +")");
//                 total_pairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs is : "+ total_pairs);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10,12};
//         print_Pairs(numbers);

//     }
// }

//   3/11/2023

//  print Subarrays using nested loops:
//  continuous of arrays

// import java. util.*;
// class Arrays{
//     public static void print_subarray(int numbers[]){
//         int ts=0;
//         for(int i=0; i<numbers.length; i++){
//             //start
//             for(int j=i; j<numbers.length; j++){
//                 //end to start
//                 for(int k=i; k<=j; k++){
//                     System.out.print(numbers[k]+" ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total subarrasy is : "+ ts);
//     }
//     public static void main(String[] args) {
//         int numbers[] = { 2,4,6,8,10,12};
//         print_subarray(numbers);
//     }
// }



// max sum of subarrays:


//import java.util.*;
/**
 * Arrays
 */
// public class Arrays {
//     public static void sum_maxSubarrays(int numbers[]){
//         int currsum =0;
//         int Maxsum = Integer.MIN_VALUE;


//         for(int i=0; i<numbers.length; i++){
//             for(int j=i; j<numbers.length; j++){
//                 currsum=0;
//                 for(int k=i; k<=j; k++){
//                 currsum += numbers[k];
//                 }
//                 System.out.println(currsum);
//                 if(Maxsum < currsum)
//                 Maxsum = currsum ;
//             }
//         }
//         System.out.println("Max sum is:"+ Maxsum);

//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//        sum_maxSubarrays(numbers);
//     }


// }


// print subarrays using prifix variable:
// prifix = prifix(i-1) + numbers(i);
// sum = prifix(end) - prifix(i-1);
// using ternary operator the follwing equation becomes;
// sum == 0 ? prifix(j) : prifix (j) - prifix (i-1);

// public class Arrays{
//     public static void pr_subarrays(int numbers[]){
//         int maxVal = Integer.MIN_VALUE;
//         int sum = 0;
//         int priFix[] = new int[numbers.length];
//         priFix[0]=numbers[0];

//         // calclulate the prifix sum:
//         for(int i=1; i<priFix.length; i++){
//             priFix[i]=priFix[i-1] + numbers[i];

//         }
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i; j<numbers.length; j++){
//                 // using ternary operator

//                 sum= i == 0 ? priFix[j] : priFix[j] - priFix[i-1];

//                 if(maxVal<sum)
//                 maxVal=sum;
//             }
//         }
//         System.out.println("maxmimum value is:"+ maxVal);

//     }
//     public static void main(String[] args) {
//         int numbers[]={1, -2, 6,-1, 3};
//         pr_subarrays(numbers);
//     }
// }


//maximum subarrys using kadane's algoritham:
//class Arrays{
// public static void maxSum_subarray(int numbers[]) {
//     int cs = 0;
//     int ms = Integer.MIN_VALUE;

//     for(int i=0; i<numbers.length; i++){
//         cs = cs + numbers[i];
//     if(cs < 0){
//         cs = 0;
//     }
//     ms = Math.max(cs,ms);
//     }
//     System.out.println("maximum subarrays sum is :"+ms);
// }
// public static void main(String[] args) {
//     int numbers[] = {1,2,3,4,5,6};
//     //maxSum_subarray(numbers);
// }
//}

// trapping rainwater:
// #22 que in DSA shit:

//    firstly we needed boundary to trap the water .
//     so for that formule becomes,
//     trapped water = (water level - hight of bar)
//     for trapping the water we need,
//      1) min no of bar > 2;
//      2) do not have single bar.
//      3) incresing and decresing bar also not allowed.
//      4) we need min 3 diffrent ht bar.
//      5) for checking water ht we compare (maxleft bound , mixright bound)
//      6) then

//     the logic bihind the code is,
//       calculate leftmax bound
//       calculate rightmax bound
//       using the loop
//       then we compare lmb and rmb
//       then calculate.

// import java.util.*;
// class Arrays{
//     public static int trappedrain_water(int hight[]){
//         int n= hight.length;
//         int trappedwater =0;
//         // cal left max boundery
//         int leftMax[] = new int[n]; // array define first.
//         leftMax[0] = hight[0];
//         for(int i=1; i<n; i++){
//         leftMax[i] = Math.max(hight[i] ,leftMax[i-1]);
//     }

//     // cal right max boundary
//        int rightMax[] = new int[n];
//        rightMax[n-1] = hight[n-1];
//        for(int i=n-2; i>=0; i--){
//         rightMax[i] = Math.max(hight[i] ,rightMax[i+1]);
//        }
//        for(int i=0; i<n; i++){
//         int water_level= Math.min(leftMax[i] , rightMax[i]);
//         trappedwater += (water_level - hight[i]);
//     }
//     return trappedwater;

//     }


//     public static void main(String[] args) {
//         int hight[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedrain_water(hight));
//     }
// }

// import java.util.*;
//  class Arrays {
//     public static int TrappedRain_water(int hight[]){
//         int n = hight.length;
//         int LeftMax[] = new int [n]; // array define
//         LeftMax[0] =  hight[0];
//         for(int i=1; i<n; i++){
//             // cal left max boundary
//             LeftMax[i] = Math.max(hight[i], LeftMax[i-1]);
//         }
//         int RightMax[] = new int[n]; //2nd array define
//         RightMax[n-1] = hight[n-1];
//         for(int i=n-2; i>=0; i--){
//             // cal  max right  boundary
//             RightMax[i] = Math.max(hight[i],RightMax[i+1]);
//         }
//         int trapped_water = 0;
//         for(int i=0; i<n; i++){
//         int water_level = Math.min(LeftMax[i],RightMax[i]);
//             trapped_water += water_level - hight[i];
//         }
//         return trapped_water;
//     }



//   buying and selling the stocks :

//  import java.util.*;

//     public class Arrays {
//         public static int BuyandSellstocks(int prices[]){
//             int Buyprice = Integer.MAX_VALUE;
//             int Maxprofit = 0;

//             for(int i=0; i<prices.length; i++){
//                 if(Buyprice < prices[i]){
//                     int profit = prices[i] - Buyprice;
//                     Maxprofit = Math.max(Maxprofit ,profit);

//                 }
//                 else{
//                     Buyprice = prices[i];
//                 }
//             }
//             return Maxprofit;
//         }
//     public static void main(String[] args) {
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println(BuyandSellstocks(prices));
//     }
// }




// class Arrays{
//     public static int TrappedRain_water(int hight[]){

//         int n = hight.length;

//         int leftMax[] = new int[n];
//         leftMax[0] = hight[0];

//         for(int i=1; i<n; i++){
//         leftMax[i] = Math.max(hight[i],leftMax [i-1]);
//         }

//         int RightMax[] = new int [n];
//         RightMax[n-1] = hight[n-1];

//         for(int i=n-2; i>=0; i--){
//         RightMax[i] = Math.max(hight[i], RightMax[i+1]);
//         }

//         int trapped_water =0;
//         for(int i=0; i<n; i++){
//         int water_level = Math.min(leftMax[i] , RightMax[i]);
//         trapped_water += water_level - hight[i];
//         }
//         return trapped_water;



//     }
//     public static void main(String[] args) {
//         int hight[] = {4,2,0,6,3,2,5};
//         System.out.println(TrappedRain_water(hight));
//     }
// }
//
//
//public class Arrays{
//
//    public static int maxDisInArr(int[] arrys){
//
//        int min = arrys[0];
//        int max = arrys[0];
//
//        for(int i = 1; i < arrys.length; i++){
//            if(arrys[i] < min) {
//                min = arrys[i];
//            }
//            if(arrys[i] > max) {
//                max = arrys[i];
//            }
//        }
//        return Math.abs(min - max);
//    }
//
//    public static void main(String [] args){
//        int arrys[] = {1, 2, 3, 4, 5};
//        int result = maxDisInArr(arrys);
//        System.out.println("Maximum distance: " + result);
//    }
//}

