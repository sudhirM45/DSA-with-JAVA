

//      what is linked list ?
//  ==>> linked list ak linear data structure hai.
//  ==>> linked list me element ka chain banta hai.
//  ==>> single element ko node kehate hai.
//

//    #~ ak singal element ke andar do data store hote hai
//        1 hota hai DATA and 2 hota hai NEXT

// -->> NEXT :- ye ak pointer ki taraha hota hai jo next element ki tarf point karta hai.

//    ak linked list ko banane keliye hame node ka class banana padta hai.
//      ==>> to create single node:-
//      class Node {
//         int data;
//         Node next;
//
//          public Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//      }
//    #~~ linked list me do node ko hamesh hum track karte rahte o hai
//        --> HEAD NODE and TAIL NODE
//        head node o node hoti hai jo linked list me sabse pahile aata hai and
//        tail node o node hota hai jo null value ke pahile aata hai.

// to create a singal node following code is given:-
public class LinkedListP1 {

    public static class Node {
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step 1 add new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;// yaha pe ak node dusre node se link huva hai

        //head bnjaye newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){

        if(head == null){
            System.out.println("Linked List is null");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx , int data){

        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        int i=0;

        for(i=0; i<size-2; i++){
            prev = prev.next;

        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size --;
        return val;

    }

    public static int itrSearch(int key){

        Node temp = head;
        int i=0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public static int helper(Node head, int key){

        if (head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx =  helper(head.next,key);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }
    public static int recSearch(int key){
        return helper(head, key);
    }

    // 14-03-2024

    // reverse in the Linked List.

    //  ~ linked list ko reverse karne keliye pahile to 3 vairable chahiye 1.curr 2.prev 3.next
    //  ~ pahile to next ko curr ka next banayenge yani-(Node next = curr.next;).
    //  ~ second time me curr ke next ko prev ki tarf point karayenge yani- (curr.next = prev).
    //  ~ third time me ab prev ko curr banayege yani-(prev = curr).
    //  ~ last me hum next ko curr banayenge yani-(curr = next).
    //  ~ hume ak curr variale lena hai use head ke equal initalise karenge and prev ko null se initilise karenge because head ke phile hamesh koi value nahi rehati .

    public void reverse(){

        Node curr = tail =  head; // java ke inner me hamesh assignment right se left hota hai is liye head tail me assign hoga and tail curr me assign hoga.
        Node prev = null;
        Node next; // next ko hamesh loop me initilise karenge.

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        int sz = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        int i=1;
        int iToFind = sz-n;
        Node Prev = head;

        while (i < iToFind) {
            Prev = Prev.next;
            i++;
        }

        Prev.next = Prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // because the slow is the actul mid.
    }

    public boolean isPalindrome(){

        if(head == null || head.next == null){
            return true;
        }
        // finding the mid
        Node midNode = findMid(head);

        // reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //head = prev;

        Node right = prev; // rightt side ka head.
        Node left = head;  // left side ka head.

        // check right half == left half

        while (right != null) {
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2){

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }
        //Find Mid
        Node mid = getMid(head);

        //right and left perform merge
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge right and left
        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        LinkedListP1 ll = new LinkedListP1();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        //ll.head = ll.mergeSort(ll.head);
        ll.print();

    }
}

// ADD in LinkedList:-
// linked list me hum do jagah pe add kar sakte hai first and last.
// fist place me add karne ka mtlab hai ki purane head ke samne ak node ko add karna.

//   add Node to fistPosition:
// step 1 : phile ak naya node create karna hoga.
// step 2 : naye node ka next last vale head ki tarf point kare.
// step 3 : jo purane vala head hai usko hatake naye create kiye huve node ko head denge.

//   add Node To lastPosition:
//  step 1 : phile ak naya node create karna hoga tail ke bad.
//  step 2 : ab tail node ka next naye node ki tarf point karega.
//  step 3 : ab hum tail ki value new node ko ass kareng.

//     how to add middle in Linked list ?
// ==> step 1 : pahile to ak temp node banana padega jo head ki taraf point karega.
