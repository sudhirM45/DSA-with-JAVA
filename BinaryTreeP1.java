//package org.studyeasy;

/*
    what is a Binary Search Tree (BTS) :-

        -> BST is the revolve version of the Binary tree in which the time complexity of
           searching is reduced.

        -> for searching in binary O(N) time Complexity is required where the N is the node
           of the tree.

        -> but in BTS we need O(H) Time Comp where the H is the height of the tree,in average
           cases the time comp of the BTS is O(N) when the tree are balanced,in that cases the
           time comp of the BTS id very less that's why we use BTS.

        -> BST inheritance ly is the Binary tree, mean all the properties of binary trees are
           present in the BTS.

        # Additional properties of the BST:

        1) in BST the values of left Subtree nodes are always less than the Root Node.

                              Ex:-              (4)
                                              /     \
                                            (2)     (5)
                                           /   \       \
                                         (1)   (3)     (6)

        2) the values of right Subtrees are always Greater than the Root Node.

        3) Not only the root node but the leftSubtree and rightSubtree are also
           the BTS with no duplicates.

        # Special property of the BST:

          -> The InOrder traversal of BST is always give sorted sequence order.

        -> we know that the logic of binary search so same concept is we going to use
           in BST we take a key and check whether it is equal to root if the key is not
           equal to root then we check the two conditions if key > node and key < node

           let suppose in above case the key is 1 then our second case will be satisfied,
           and we go into left subtree and check
                                                (4)
                                              /     \
                                            (2)     (5)
                                           /   \       \
                                         (1)   (3)     (6)
      Q1. Build a Binary Search Tree:

      Q2. Delete Node in BinarySearchTree:
         three cases will form to delete the node
         1) leaf Node of Node has no child:
           to delete the leaf node we just need to return null to the parent of the node.

         2) Single child
            in second case we just delete the node and attach the child node to the parent node.

         3) when two children is present
            the first step to find out the inorder Successor , inorder successor means when we find
            out inorder traversal of a tree and let suppose we have to delete the val 5 of the node
            then just after the key value whatever the node is present it is called as IS.

            for Ex :
                                                (4)
                                              /     \
                                            (2)     (5)
                                           /   \       \
                                         (1)   (3)     (6)
            if we find out the inorder traversal of the above tree then the values comes as
            (1,2,3,4,5,6) then if we have to delete the key 3 then after the 3 key whatever the
            key (4) is present it is called as inorderSuccessor.

            for that we firstly find out the inorder successor and then replace it by the
            whatever the node we have to delete and, then we delete the inorderSuccessor.

            #* inorder successor in BST --> left most node in rightSubtree


      Q. Validate BST :- in this problem we have given an BST for which we have to check whether
                         the tree is validated BST or not validated mean which follows all the
                         conditions or properties of Binary tree
         Approach 1:
           -> approach one is we check the root is larger than left node and
              smaller than the right node then all the conditions are satisfied then the
              tree is valid BTS. but the above approach is not satisfied for the below
              condition.
                                                (3)
                                              /     \
                                            (2)     (5)
                                           /   \
                                         (1)   (4)
               in this case the 4 node is lying in the left subtree and, it is larger than the
               root node so in this case it not a valid BST.

               the simplest option to find out the valid BST is checked the inorder traversal
               of the BTS if it is in sorted sequence then the tree is valid BTS.

            Approach 2:
               the second method to check the valid BTS is ,
               to find out the maximum value of leftSubtree and minimum value of rightSubtree and,
               compare the both values with root node it these values are satisfied
               then the tree is valid BTS.



import javax.lang.model.util.Elements;
import java.util.ArrayList;

public class BinarySearchTree{

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
           root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left,val);
        } else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inOrder(Node root){

        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static boolean searchKey(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return searchKey(root.left,key);
        }
        else{
            return searchKey(root.right,key);
        }

    }

    public static Node delete(Node root,int val){

        if(root.data < val){
            root.right = delete(root.right,val);
        }
        else if(root.data > val){
            root.left = delete(root.left,val);
        }
        else{
            // case 1 - leaf node null
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 - one of the child is null or present
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root,int k1,int k2){

        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data < k1){
            printInRange(root.left,k1,k2);
        }
        else {
            printInRange(root.right, k1, k2);
        }
    }


    public static void printPath(ArrayList<Integer> path){

        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println("null");
    }
    public static void printPathRoot2Node(Node root, ArrayList<Integer> path){

        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }

        printPathRoot2Node(root.left,path);
        printPathRoot2Node(root.right,path);

        path.remove(path.size()-1);
    }

    public static boolean isValidBTS(Node root,Node min,Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data ){
            return false;
        }

        return isValidBTS(root.left,min,root) &&
                isValidBTS(root.right,root,max);
    }
    public static void main(String [] args){
//        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        int values[] = {1,1,1};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        inOrder(root);
        System.out.println();

        if(searchKey(root,1)){
            System.out.println("found");
        } else{
            System.out.println("not found");
        }

        delete(root,5);
        System.out.println();

        inOrder(root);

        printInRange(root,5,9);
        printPathRoot2Node(root,new ArrayList<>());

        if(isValidBTS(root,null,null)){
            System.out.println("valid");
        } else{
            System.out.println("not valid");
        }

    }
}
*/


/*
                                    Binary Search Tree Part-2:

        Q1. Sorted array to Balance Tree:

        here in this problem we are going to use the Binary search basic method
        in which we firstly calculate the mid and then create a node then create of search
        in the left subtree and then right subtree and last return the root node.

        for the conformation we create the inorder traversal function and the static class to store
        information of the nodes.

public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }


    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBST(int arr[],int start,int end){
        if(start > end){
            return null;
        }

        int mid = (start+end)/2;

        Node root = new Node(arr[mid]);
        root.left = createBST(arr,start,mid-1);
        root.right = createBST(arr,mid+1,end);

        return root;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        Node root = createBST(arr,0, arr.length-1);
        preOrder(root);
    }
}


    Q2. Convert BST to Balanced BST:

        in this problem at first we calculate inorder sequence for the given BST
        once the inorder sequence is form then we crate the sorted arrList to form this arr
        List we pass the arrList in the inorder function then we know the binary search method,
        we just apply it and the balanced BST will form.

import java.util.ArrayList;

public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }


    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){

        if(root == null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder,int st,int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;

        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);

        return root;
    }
    public static Node balanceBST(Node root){

        // get sorted inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);

        root = createBST(inorder,0, inorder.size()-1);
        return root;
    }

    public static void main(String[] args) {
                                                /*
                                                (8)
                                               /   \
                                             (6)   (10)
                                             /        \
                                           (5)       (11)
                                           /             \
                                         (3)            (12)
        Node root = new Node(8);
         root.left = new Node(6);
         root.left.left = new Node(5);
         root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balanceBST(root);
        preOrder(root);
    }
}


        Q3. size of Largest BST in Binary Tree:

        ->


import com.sun.java.accessibility.util.AccessibilityListenerList;
import org.w3c.dom.Node;
import java.util.*;

public class BinarySearchTree {


    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }


    }
    static class Info{
        boolean isBST;
        int size;
        int max;
        int min;

        public Info(boolean isBST,int size,int max,int min){

            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }

    }

    public static int maxBST=0;

    public static Info largestBST(Node root){

        if(root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        if(root.data <= leftInfo.max ||  root.data >= rightInfo.min){
            return new Info(false,size, max,min);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST,size);
            return new Info(true,size, max, min);
        }

        return new Info(false,size,max,min);

    }
    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largestBST(root);
        System.out.println("largest BST size is "+ maxBST);

    }
}
    Q4. Marge two Binary Search Trees:

        Approach to solve this problem is easy we just find out the inorder sequence of the BST1
        and then after the find out the BST2's inorder Sequence.

        then marge both the sorted inorder and crate one big arr then just create a balanced BST.


import java.util.ArrayList;
import java.util.Iterator;

public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root , ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }

    public static Node createBST(ArrayList<Integer>arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start+end)/2;

        Node root = new Node(arr.get(mid));
        root.left = createBST(arr,start,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }

    public static Node margeBST(Node root1,Node root2){
        // st1 : to get inorder for root1

        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        // step 2 : to get inorder for root2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);

        // marge the arr1 and arr2:

        int i=0; int j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();

        while (i < arr1.size() && j< arr1.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            } else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }

        while (j<arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }
        // step4: crate a balance tree using sorted arrList.

        return createBST(finalArr,0,finalArr.size()-1);

    }

    public static void preOrder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

       Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = margeBST(root1,root2);
        preOrder(root);
    }
}
 */

/*
        # AVL trees:
        ->  AVL trees are the spacial trees in the Binary Search Tree which are the self Balancing
        ->  We can say that the AVL is self-balancing the whatever the functions are written internally

        concept 1: why we need balancing
        ->  in the normal bst the operations like insert, remove, search these all the operations are
            performed on the basics of the height and in normal cases the complexity remains log(n)
            But our BST may be skewed(means tree are going in only on downward direction) in the wrost case
            the TC will become O(N) here the N is the Nodes of the tree,
            and the BST but if the BST is balanced in that case the time Comp will be less log(n),
            and this lg(n) is very less than the skewed case.

        Special Property Of the BST:

        BST has the special property called as 'balance factor' and value of this factor for any node
        will be (-1,0,1) for calculating the BF we calculate ht of left subtree and right subtree and
        we minus the lh-rh the values should be 0,-1,1.
        if we take the mod of lh and rh the value should be less than the 2.

        # Rotations:

        case1 : LL->(Left,Left)

            (Before Insert)            (Insert 10)                      after rotation
                (30)                       (30)                             (20)
               /                          /                                 /   \
             (20)                       (20)  rotate right                (10)  (30)
                                       /
                                     (10)
        the new node is insert in left of left subtree that's why we call this as Left Left rotation.
       process :
       1) insert as we insert in BST.
       2) we check the case where the balance factor is disorder
       3) when the LL case is present we rotate the tree in right direction so in that case the 20 comes
          in the centre and 10 comes in left side and 30 comes in right side.

        case 2: LR->(left,Right)

             (Before Insert)            (Insert 20)                      after rotation
                (30)                       (30)         (30)                 (20)
               /                          /            /                     /   \
             (10)                       (10)          (20)                 (10)  (30)
                                           \          /
                            left ro       (20)       (10) right ro
        -> whenever the LR case is comes we rotate left and then rotate right

        case 3: RR->(Right,Right)

            (Before Insert)            (Insert 30)                      after rotation
                (10)                       (10)                                (20)
                   \                          \                                /   \
                   (20)                       (20)                           (10)  (30)
                                                \
                                      left left  (30)

        -> whenever the RR case is comes we rotate left.

        case 4: RL->(Right,Left)

            (Before Insert)             (Insert 20)                                after rotation
                (10)                       (10)            (10)                         (20)
                   \                          \               \                        /   \
                  (30)                       (30)             (20)                   (10)  (30)
                                             /                  \
                                           (20) right ro       (30) rotate left

 */

