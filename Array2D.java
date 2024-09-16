
//     #~ in 2D Arrays data stored in two dimension
//      like in matrix by column vise or row vise
//


// import java.util.*;
// class Array2D{
// public static boolean search(int matrix[][],int key){
//     for(int i=0; i<matrix.length; i++){
//         for(int j=0; j<matrix[0].length; j++){
//             if(matrix[i][j] == key){
//                 System.out.println("found at cell :("+i+","+j+")");
//                 return true;
//             }
//         }
//     }
//     System.out.println("not found the key");
//     return false;
// }
//     public static void main(String [] args){
//         int matrix[][] = new int [3] [3];

//         int n=matrix.length,m=matrix[0].length;
//         Scanner sc = new Scanner(System.in);

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         // output

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//            System.out.println();
//         }
//     }
//  }


//  spiral matrix:

//      1 2 3 4
//      5 6 7 8
//      9 10 11 12
//      13 14 15 16
//      output : 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

//      approach for print:
//     firstly cover the border
//    taking four variables :-
//   1)startRow  2)startColm  3)endRow  4)endColm
//      for the first boundary :
//    startRow=0;  startCom=0;  endRow= n-1;  endColm=m-1;
//      for the second boundary :
//    startRow=1;  startCom=1;  endRow= n-2;  endColm= m-2;
//   for the updation:
//   startRow++  endRow--   startColm++  endColm--
//    j = colm   i = row

//import java.util.*;
class Array2D{


    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow &&  startCol <= endCol) {
            // top side
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }
            // right side
            for(int i=startRow + 1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+ " ");
            }
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+ " ");
            }
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+ " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    // 1st diagonal i==j
    // 2nd diagona i+j == matrix.length
    public static int diagonalsum(int matrix[][]){
        int sum = 0;
        //     for(int i=0; i<matrix.length; i++){
        //         for(int j=0; j<matrix[0].length; j++){
        //             if(i == j){
        //                 sum+= matrix[i][j];
        //             }
        //             else if(i+j == matrix.length -1){
        //                 sum+= matrix[i][j];
        //             }
        //         }
        //     }

        //  or

        for(int i=0; i<matrix.length; i++){
            sum+= matrix[i][i];

            if(i != matrix.length-1-i)
                sum+= matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    //serach in sorted arrays
    // (n-1,0)
    //  if key > cell value
    //    right move
    //  if(key < cell value)
    //    top move

    // (0,m-1):
    //  if(key > cell value)
    //     bottom move
    //  if(key < cell value)
    //     left move
    public static boolean searchkey(int matrix[][], int key){
        int  row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("key found at (" + row + ","+ col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] ={{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int key=33;
        System.out.println(searchkey(matrix, key));
    }
}


