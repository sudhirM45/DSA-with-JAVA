
/*
   # What is means by 'Heaps' or 'Priority Queues'?

  ->  heap is basically like a mountain structure and by using the heap data structure we
      create a new data structure named as Priority Queues.

  ->  Ex :- A priority queue is like a special type of queue where each item has a priority level.
            Imagine you're waiting in line at a hospital. Usually, the person who comes first gets served first,
            right? But if someone with a more urgent need (like a severe injury) arrives, they get to skip the
            line and go first.

           In a priority queue, items are processed based on their priority rather than just the order they arrive.
           The item with the highest priority gets served before those with lower priorities.
           If two items have the same priority, they are served based on their arrival order,
           just like in a regular queue.

    #  priority queues in java collection framework :

    A Priority Queue in Java is a type of queue where elements are stored in a way that allows the smallest
    (or sometimes the largest) element to be accessed quickly, even if it's not the first one added.
    It's part of the Java Collection Framework and is used when you need to process elements based on priority
    rather than the order they were added.

    Here's how it works:

    Order of Elements: In a regular queue, the first element added is the first one removed (like a line at a store).
    But in a priority queue, elements are removed based on their priority (which is often determined by their
    natural ordering, like numbers in ascending order).

    Implementation: In Java, a Priority Queue is implemented as a min-heap, meaning the smallest element is always
    at the front.

    Common Uses: It's useful in scenarios like scheduling tasks (where some tasks should be done before others)
    or in algorithms like Dijkstra's for finding the shortest path


import java.awt.dnd.DragGestureEvent;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Heaps {

    static class Student implements Comparable<Student>{ // comparable is a function in a java which is
                                                        // inbuilt from which classes are compared with objects
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        // on the above static class we don't know how to give the priority to the students and the rank
        // so in this type of the class when we have to set the priority we implement a special interface
        // called as comparable so here we compare the rank and name of the student
        @Override
        public int compareTo(Student S2){
            return this.rank - S2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A",4));
        pq.add(new Student("B",9));
        pq.add(new Student("C",3));
        pq.add(new Student("D",8));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " "+ "->" +" "+ pq.peek().rank);
            pq.remove();
        }
    }
}
 */

/*
      Heap:
      -> heap is a binary tree and at most 2 child are present of heap.

      -> Complete Binary Tree: A heap is a complete binary tree, meaning all levels are fully filled except possibly
         the last one, which is filled from left to right.

      -> Heap Order priority:

         children Node >= parents(MinHeap)
         children Node <= parents(MaxHeap)


      A Heap in Java is a special type of binary tree that is used to implement priority queues.
      It helps in quickly finding the minimum or maximum element in a collection.

     Key Features of Heaps:

    Binary Tree: A heap is a complete binary tree, meaning all levels are fully filled except possibly the last one,
    which is filled from left to right.

    Two Types:

    Min-Heap: The smallest element is at the root (top), and each parent node is smaller than its child nodes.

                                                    (1)
                                                   /    \
                                                (2)     (4)
                                               /   \
                                              (5)  (7)



    Max-Heap: The largest element is at the root, and each parent node is larger than its child nodes.

                                                    (20)
                                                   /    \
                                                (5)     (4)
                                               /   \
                                              (1)  (2)

    Efficient Operations:

    Insertions and Deletions: Both can be done in O(log n) time.

    Accessing Min/Max: You can access the minimum (or maximum) element in O(1) time because it’s always at the root.

    heap class is not implemented as a class :

    The Heap class is not explicitly implemented as a separate class in Java because its functionality is already
    provided through the PriorityQueue class.

   Why No Separate Heap Class:

    PriorityQueue Uses a Heap: The PriorityQueue class in Java is built using a binary heap under the hood.
    It provides all the necessary operations like insertion, deletion, and access to the smallest or largest
    element efficiently, using the heap structure.

    General Purpose: The PriorityQueue class is designed to be flexible and general-purpose, allowing you to create
    min-heaps or max-heaps with custom orderings using Comparators. So, a separate Heap class isn't needed.

    Abstraction: By providing a PriorityQueue class, Java abstracts away the specific details of heap implementation,
    making it easier for developers to use without worrying about the underlying structure.

    -> let suppose we are inserting a num in the minHeap so for that we need O(N) time complexity and
       after the inserting the binary tree is not satisfied the conditions, or we can say that the
       tree becomes imbalanced and for that we needed extra time complexity,
       and in the QueuesPriority for add operation we need only log(n) time complexity that's why
       we use QueuePriority and heap is not implemented as class.

       Heaps as array and arrayList :

       heaps are visualize in the form of tree because we have to show the relationship between the parents and
       child.
       in the min heap we have to show that value of the parent node in the tree is less than or equal to the child

                                                        (2)
                                                      /     \
                                                     (3)    (4)
                                                    /   \
                                                   (5)  (10)
       Now we visualize the above tree in the array form,
       we will give num from root node 1 to n from left to right
       so at 1 num node 2 will store in array, at 2-> 3, at 3-> 4, at 4-> 5, at 5-> 10 will store.
       so Array = [2, 3, 4, 5, 10];

       when we visualize the array in heap we get a special property of the heap that is ,
       if we have a node that's index is equal to i -> [node idx = i];
       in that case the idx of the left child become 2i + 1;
       and the idx of right child becomes 2i + 2;


       # Insertions in Heaps:

       -> add in array list at last index.
       ->



import java.util.ArrayList;

public class Heaps {

    static class heap{
        // here we simply define a arrayList
        ArrayList<Integer> arr = new ArrayList<>(); // Integer is because we store the integer value.

        // now we define a function
        public void add(int data){ // int data is the data which we want to add in heap

//      for adding the new value in heap we need to add the data in last position of the arraylist.
            arr.add(data);

            // after that we want to find out index of the parent node.
            int x = arr.size()-1; // x is the child index
            int parent = (x-1)/2; // arr.size()-1 is the parent node which one we added in arr.

            while(arr.get(x) < arr.get(parent)){ // this condition state that child value is less the
                                                // parent value it will run. and swap the values of parent and child.

                // swap
                int temp = arr.get(x); // we store the value of child in temp arr.
                arr.set(x,arr.get(parent));// then we have to store parent value in the child index.
                arr.set(parent, temp);
            }

        }

        // for get the min value of heap we just need peek the Oth index of the arr-> arr.peak(0).
        public int peek(){
            return arr.get(0);
        }
    }
    public static void main(String[] args) {

    }
}

 */

/*
    # Delete in the Heap
    -> delete in the Heap is the three-step process,

    step1 : first step is we have to swap the numbers of first node and second node.
            in the arraylist time complexity to remove from the last index is constant.
            whoever we swap the number the min value come to the last index of heap so from there

   step2 :  so after the min value comes at last index then we delete/remove last index.

   step3 :  after removing the element and swapping in the heap,heap become unbalanced or which does not,
            follows the rules so for that in third step we fix our heap.

   for fixing our heap we use the special function named as heapify and this fun we crate our own.

   # how the heapify function will work:

   let suppose we have a heap, (5) which we have to fix,
                              /   \
                            (3)   (4)
      then we call the fun heapify for the root node(i) then we find out left for the root which is 2i+1.
      and right root which is 2i+2
      after that heapify compare root,left and right and get the min value we compare the values and whatever
      the min value we get swap that value with the parent.




import java.util.ArrayList;

public class Heaps {

    static class heap{
        // here we simply define a arrayList
        ArrayList<Integer> arr = new ArrayList<>(); // Integer is because we store the integer value.

        // now we define a function
        public void add(int data){ // int data is the data which we want to add in heap

        //for adding the new value in heap we need to add the data in last position of the arraylist.
            arr.add(data);

            // after that we want to find out index of the parent node.
            int x = arr.size()-1; // x is the child index
            int parent = (x-1)/2; // arr.size()-1 is the parent node which one we added in arr.

            while(arr.get(x) > arr.get(parent)){  // *for max > is come.
                // this condition state that child value is less the
                // parent value it will run. and swap the values of parent and child.

                // swap
                int temp = arr.get(x); // we store the value of child in temp arr.
                arr.set(x,arr.get(parent));// then we have to store parent value in the child index.
                arr.set(parent, temp);

                // updating the parents and child values
                x = parent;
                parent = (x-1)/2;
            }

        }

        // for get the min value of heap we just need peek the Oth index of the arr-> arr.peak(0).
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){

            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) < arr.get(left)){ // maxheap <
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) < arr.get(right)){  // maxheap <
                minIdx = right;
            }

            if( minIdx != i){
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }

        public int remove(){

            // we get data which we have to delete
            int data = arr.get(0);

            //step1: swap the first and last index
            int temp = arr.get(0);  // temp var store the first index value
            arr.set(0,arr.get(arr.size()-1)); // at 0th index we put last value
            arr.set(arr.size()-1,temp); // last index put temp value.

            //step2: delete the last node
            arr.remove(arr.size()-1);

            //step3; heapify

            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {

        heap h = new heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.arr.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }


    }
}


 */

/*
 Date-27/08/24
        heap sort :

        -> heap sort also work as the merge sort and quick sort and work in nlog(n) time complexity.
        -> for the heap sort 2-step process.
        -> sorting the arr in ascending order by using the heap we have to crate max heap.
        -> sorting the arr in descending order by using the heap we have to crate min heap.

        Step1-> sorting the arr in ascending order by using the heap we have to crate max heap.
                we call the heapify function for the non-leaf nodes which will gives the
                maxheap.

        step2-> we swap the largest element in the heap to the last

                -> we swap(0,i) here the i start form the n-1 and goes to the 1.
                -> and then we call the heapify function heapify(0,i).


import java.util.*;

public class Heaps {

    //first we crate a heapSort function which contains int[] arr


    public static void heapify(int[] arr,int i, int size){

        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != i){

            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr,0,size);
        }
    }
    public static void heapSort(int[] arr){

        // step 1 : to build the maxheap.
        // in the step1 we call the heapify function for leaving the last level.
        int n = arr.length;
        for(int i=n/2; i>=1; i--){
            heapify(arr,i,n);
        }


        // step 2 : swap the first element in last.

        for(int i=n-1; i>0; i--){

            //swap the largest with last;
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        heapSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}

 */

/*
    Date- 28/08/24

    Q. near buy cars : we are given N points in 2D plane which are location of N cars
                       if we are at the origin, print the nearest kth car.

    # approach:
        -> we are given the cars coordinate in the 2D plane which are the distance form the origin
        -> And we are standing at the origin.
        -> we calculate the distance form the origin.
        -> wee are at the origin (0,0) and car is at distance (x,y) then the distance from the origin
            to the (x,y) is -> underRoot(X^2 + Y^2).
        -> and then we add the values in priorityQueue as the car and its distance.
        ->


import java.util.PriorityQueue;

public class Heaps {

    static class point implements Comparable<point> {
        int x;
        int y;
        int distSq;
        int idx;

        public point(int x,int y,int disSrq, int idx)  {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(point P2){
            return this.distSq - P2.distSq;
        }
    }
    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-2},{-2,44}};
        int k = 2;

        PriorityQueue<point> pq = new PriorityQueue<>();

        for(int i=0; i<pts.length; i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0],pts[i][1],distSq,i));
        }

        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}

 */

/*
    #Q. Connect the n-ropes with minimum cost,such that the cost of connecting two ropes are
        equal to the sum of both the ropes.

 */


