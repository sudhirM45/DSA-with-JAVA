

//  backtrcking yani ak particular raste pe nikalna but jaise hum aage jayenge tabhi hame pata chalta hai ki hum galt
//  raste pe aagye hai to hum use same raste se firse original postion keliye backtrack karte hai.

//  #~  Types of Backtracking:
//  1.  DICISION : yai ak problem hai uske liye ye check kaarta hai ki koi solution hai ya nahi.

//  2.  OPTIMIZATION : haya pe isa hota hai ki humare pas boho sare solution hote hai unmese
//                     best optimized solution hume choose karana hota hai.

//  3.  Enumaeration : YAI HUME HUMARE PASS KITNE problem solution hai o batana hai.


//  --------x--------------x--------------x-----------------x-------------------x-----------x-------

//   #~Qs1 ===> Backtracking on empty array :
//     ~ qustion ke andar hume arr ka size define karke diya hoga
//     ~ to use ke liye hume ak recursive fun likhanna hai jo i =0 se i<arr.length tak jake arr ko bhar de.
//     ~ is ke bad jase hi hum base case ko hit karde to hum arr ko kardenge print and vaha se kardene return.
//     ~ aur return karte time -2 se return kar denge.


public class Backtracking {
    public static void ChangeArr(int arr[],int i, int val){
        // yaha pe ak to arr chahiye aur arr ko triverse karneko
        //ak index (i) chhiye and ak or variable cahiye (val)
        //jo ki o index pe assign ho.
        //yaha pe 2 basic case hai jo ki hai Bace case and recursion.
        //base case
        if ( i == arr.length) {
            PrintArr(arr);
            return;
        }

        //recusion me hum arr ke index pe value ko assign karna hai.
        arr[i] = val;
        ChangeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 1;
    }

    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArr(arr, 0, 1);
        PrintArr(arr);
    }
}
//   ----------X------------X--------------X-----------x-----------x------------------x--------------------x

//  #~  SETs : Is the collection of object.
//  #~  SUBSET :  Colletion of small set called as subset.

//  Qs.2 #=> find and print all subset of given string.

//   ~ agar ki bhi string ki length (n) ke barabar hoti hai to use subset (2^n)  ke barabar hote hai.



//public class Backtracking{

// do kaam karna hai:

//  Base Case:

//  Recursion Fun ko call karna :

//     public static void PrintSubset(String str, String ans, int i){

//         //   Base Case
//         if(i == str.length()){
//             if(ans.length() == 0){
//                 System.out.println("null");
//             } else{
//                 System.out.println(ans);
//             }
//             return;
//         }

//         //  Recursion Call
//         //  For Yes
//         PrintSubset(str, ans+str.charAt(i), i+1);

//         // For No
//         PrintSubset(str, ans, i+1);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         PrintSubset(str, "", 0);
//     }
// }


//----------x---------------------x----------------x------------x------------------x------------------x------------

//  #~ Qs.3==> find permitations:
//
// public class Backtracking {
//     public static void FindPermitations(String str,String ans){
//         // Base Case
//         if(str.length() == 0){
//             System.out.println(ans);
//             return;
//         }

//         // Recursion call

//         for(int i=0; i<str.length(); i++){
//             char curr = str.charAt(i);   // ith index pe jo char hai o curr charecter hai.
//             String NewStr = str.substring(0, i) + str.substring(i+1);
//             FindPermitations(NewStr, ans+curr);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         FindPermitations(str, " ");

//     }
// }

// ------------x-----------------x-----------------x-----------------x------------------x----------------x--------


// #~ Qs.3==> nQueens Print

// public class Backtracking {

//     public static boolean isSafe(char board[][],int row, int col){

//         // vertical up
//         for(int i=row-1; i>=0; i--){
//             if((board[i][col]) == 'Q'){
//                return false;
//             }

//         }

//         // diag left
//         for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
//             if((board[i][j] == 'Q')){
//                 return false;
//             }
//         }
//         // diag right
//         for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
//             if((board[i][j]) == 'Q'){
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void nQueens(char board[][],int row){

//         // base case
//         if(row == board.length){

//             count++;
//             //PrintBoard(board);
//             return;
//         }

//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row,j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);  // funcion call
//                 board[row][j] = '.'; // backtracing
//             }
//         }
//     }

//     public static void PrintBoard(char board[][]){

//         System.out.println("-------Chess Board--------");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length;  j++){
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int count =0;
//     public static void main(String[] args) {
//         int n=5;
//         char board[][] = new char [n][n];
//         // initalization
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = '.';
//             }
//         }

//         nQueens(board, 0);
//         System.out.println("total ways to cal nQueens is = " + count);
//     }
// }


//-----------x-----------------x----------------x-----------------x------------------x--------------x---------


//  #~  Qs.4 ==> Gride ways :-

// public class Backtracking {

//     public static int GrideWays(int i, int j, int n, int m){


//         if(i ==n-1 &&  j==n-1){
//             return 1;
//         }
//         else if(i == n || j==n){
//             return 0;
//         }

//         // recursion

//         int w1= GrideWays(i+1, j, n, m);
//         int w2= GrideWays(i, j+1, n, m);

//         return w1+w2;

//     }
//     public static void main(String[] args) {
//         int n=3; int m=3;
//         System.out.println(GrideWays(0, 0, m, n));
//     }
// }

//----------------x-------------x--------------------x------------------x------------------x-----------------x-


//
//public class Backtracking {
//
//    public static boolean isSafe(int sudoko[][], int row, int col, int digit){
//
//        // col
//        for(int i=1; i<=8; i++){
//            if(sudoko[i][col] == digit){
//                return false;
//            }
//        }
//
//        // row
//        for(int j=1; j<=8; j++){
//            if(sudoko [row][j] == digit){
//                return false;
//            }
//        }
//
//        // gride
//        int sr = (row/3) * 3;
//        int sc = (col/3) * 3;
//
//        for(int i=sr; i<sr+3; i++){
//            for(int j=sc; j<sc+3; j++){
//                if(sudoko[i][j] == digit){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//    public static boolean SudokoSolver(int sudoko[][], int row, int col){
//
//        // base case
//        if(row == 9 && col == 0){
//            return true;
//        }
//        //digit ko place karan keliye
//        int nextRow = row; int nextCol = col+1;
//        if(col+1 == 9){
//            nextRow = row+1;
//            nextCol = 0;
//        }
//
//        // ye if is liye ki jb hamare sodoko me pahilese koi dusra digit exits karta hai to use ham hatayenge nahi aur soduko ko call karenge
//        if((sudoko[row][col] != 0)){
//            return (SudokoSolver(sudoko, nextRow, nextCol));
//        }
//
//        for(int digit=1; digit<=9; digit++ ){
//            if(isSafe(sudoko,row,col,digit)) {  // digit ko place karna issafe hai kya.
//                sudoko[row][col] = digit;
//                if(SudokoSolver(sudoko, nextRow, nextCol)){
//                    return true;
//                }
//                sudoko[row][col] = 0;
//            }
//        }
//
//        return false;
//    }
//
//    public static void PrintSoduko(int sodoko[][]){
//        for(int i=0; i<9; i++){
//            for(int j=0; j<9; j++){
//                System.out.print(sodoko[i][j] +" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        int sudoko[][] ={ {0, 0, 8, 0, 0, 0, 0, 0, 0,},
//                {4, 9, 0, 1, 5, 7, 0, 0, 2,},
//                {0, 0, 3, 0, 0, 4, 1, 9, 0,},
//                {1, 8, 5, 0, 6, 0, 0, 2, 0,},
//                {0, 0, 0, 0, 2, 0, 0, 6, 0,},
//                {9, 6, 0, 4, 0, 5, 3, 0, 0,},
//                {0, 3, 0, 0, 7, 2, 0, 0, 4,},
//                {0, 4, 9, 0, 3, 0, 0, 5, 7,},
//                {8, 2, 7, 0, 0, 9, 0, 1, 3,}};
//
//        if(SudokoSolver(sudoko, 0, 0)){
//            System.out.println("solution is exits");
//            PrintSoduko(sudoko);
//        } else {
//            System.out.println("solution does not exits");
//        }
//    }
//
//}
