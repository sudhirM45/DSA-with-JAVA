

//      information in computer stored in manner of binary system .
//      in computer binary number system is used .
//      1 - (001)
//      2 - (010)
//      7 - (111)
//      10 - (1010)

//      BIT WISE OPERATORS :-
//      Binary AND - (&)
//      Binary OR  - (!)
//      Binary XOR - (^)
//      Binary One's Complement -
//      Binary Left Shift - (<<)
//      Binary Right Shift- (>>)
//      5=(0>0000101>) the startig 0 is called as (Most Significant Bit )
//      and the last 1 is called as (least significant Bit)

//      Binary Left Shift :- binary values shifted to left side.
//      the formulae is (a<<b) = a*2^b
//      for ex:- 5<<2 = 5*2^2 = 5*4= (20)in decimal.

//      Binary Right Shift :- binary values shifted to right side.
//      the formulae is (a>>b) = a/2^b
//      ex:- 6>>1 = 6/2^1 = 6/2 = (3) in decimal.

//      check if number is odd or even
//      for that if no.is odd the (lsb)=1 and if no.is even (lsb)= 0.
//      (n & 1) for ex:-
//      n=3 (011)/(001)= (001) = (1)in decimal.
//      in coding 1 is called as (bit Mask).

// import java.util.*;

//public class BitMan {
//    public static void oddoreven (int n){
//        int bitmask = 1;
//        if((n & bitmask) == 0){
//            System.out.println("number is even");
//        }
//        else if ((n & bitmask) == 1){
//            System.out.println("number is odd");
//        }
//    }
//
//    public static int getithbit (int n, int i){
//        int bitMask= 1<<i;
//
//        if((n & bitMask) == 0){
//            return 0;
//        } else{
//            return 1;
//        }
//    }
//
//    public static int setithbit(int n, int i){
//        int bitMask = 1<<i;
//        return n|bitMask;
//    }
//    public static int clearithbit(int n, int i){
//        int bitMask = ~(1<<i);
//        return n & bitMask;
//    }
//
//    public static int updateithbit(int n,int i,int newBit){
//        if(newBit == 0){
//            return clearithbit(n,i);
//        }else {
//            return setithbit(n, i);
//        }
//    }
//
//    public static int clearIthbit(int n,int i){
//        int bitmask = (~0)<<i;
//        return n & bitmask;
//    }
//
//    public static int clearIthbitrange(int n,int i,int j){
//        int a = (~0)<<j+1;
//        int b = (1<<i)-1;
//        int bitmask = a|b;
//        return n & bitmask;
//
//    }
//
//    public static boolean isNopowerof2(int n){
//        return (n&(n-1)) == 0;
//    }
//
//    public static int countsetBit(int n){
//        int count = 0;
//
//        while (n>0) {
//            if((n&1) != 0){
//                count ++;
//            }
//            n = n>>1;
//        }
//        return count;
//    }
//
//    public static int fastExp(int n ,int a){
//        int ans = 1;
//
//        while (n>0) {
//            if((n & 1) != 0){
//                ans = ans * a;
//            }
//            a = a*a;
//            n = n>>1;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        // oddoreven(3);
//        //System.out.println(clearithbit(10, 1));
//        System.out.println(fastExp(5, 3));
//    }
//
//}
//
