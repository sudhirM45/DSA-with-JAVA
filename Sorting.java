//package org.studyeasy;

//        Sorting is a basically arreanging an
//               perticular object in an order.

//        Basic sorting algorithms
//       a) bubble sort
//       b) selection sort
//       c) Insertion sort
//       d) Counting sort (advanced)

//      1) bubble sort converts unsorted arrays into the sorted arrays
//  ex:- {2,4,5,3,1,6} unsorted array
//        {1,2,3,4,5,6} sorted array


//class Sorting {
//
//    public static void BubbleSort(int arr[]){
//
//        for(int turn=0; turn<arr.length; turn++){
//            for(int j=0; j<arr.length-1-turn; j++){
//                if(arr[j] > arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void printArray(int arr[]){
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//
//    public static void SelectionSort(int arr[]){
//
//        for(int i=0; i<arr.length-1; i++){
//            int smallest = i;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[smallest] > arr[j]){
//                    smallest = j;
//                }
//            }
//            //swap
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
//
//    }
//
//
//
//    public static void InsertionSort(int arr[]){
//
//        for(int i=0; i<arr.length; i++){
//            int curr = arr[i];
//            int prev = i-1;
//
//            while( prev >=0 && arr[prev] > curr){
//                arr[prev+1] = arr[prev];
//                prev--;
//            }
//            // insertion
//            arr[prev+1] = curr;
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {5,4,8,1,7,3,2,6,};
//        InsertionSort(arr);
//        printArray(arr);
//    }
//}




