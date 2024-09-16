
//  import java.util.*;

// public class Strings {

//     public static void PrintLetter(String str){
//         for(int i=0; i<str.length(); i++){
//             System.out.print(str.charAt(i)+"  ");
//         }

//     }

//     public static void main(String[] args) {
// char arr[]= {'a', 'b', 'c', 'd'};
// String str= "abcd";
// String str2= new String("abcd");


// Scanner sc = new  Scanner(System.in);
// String name;
// name = sc.nextLine();
// System.out.println(name);
// String fullName = "sudhir mhamane";
// System.out.println(fullName.length());

// concatenation
// String firstname = "sudhir";
// String lastname = "mhamane";
// String fullname = firstname + " " + lastname;



//PrintLetter(fullname);

//}
//}

// strings are IMMUTABLE
//  STRING NEVER CHANGES IN JAVA
//  FOR ANY CHANGE IN STRING NEW STRING WILL BE FORM AND
//  WEE CANNOT MAKE CHANGES IN OLD STRING.


//import java.util.*;
class strings{

    public static boolean ispalindrome(String str){

        int n = str.length();
        for(int i=0 ; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float Short_Path(String path){
        int x=0;
        int y=0;

        for(int i=0; i<path.length(); i++){
            char dir= path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if (dir == 'W'){
                x--;
            }
            else if (dir == 'E'){
                x++;
            }
        }
        int X2 = (x*x);
        int Y2 = (y*y);
        return  (float) Math.sqrt(X2 + Y2);
    }
    public static String UpcaseWord (String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));//taking 1st letter of string convertig to upper case
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String comprase(String str){
        StringBuilder sb = new StringBuilder("") ;

        for(int i=0; i<str.length(); i++){
            Integer count = 1;

            while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "aaabbcccdd";
        System.out.println(comprase(str));

        // String str = "hi , i am sudhir";
        // System.out.println(UpcaseWord(str));
        // String fruits[] = {"banana","bango","apple"};{
        //     String largest = fruits[0];
        //     for(int i=1; i<fruits.length; i++){
        //         if(largest.compareTo(fruits[i])<0){
        //             largest = fruits[i];
        //         }
        //     }

        //     System.out.println(largest);
        // }

        //StringBuilder sb= new StringBuilder(""); // string builder //in which we can make changes
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch); // this is for add backend of string
        // }
        // System.out.println(sb);
        // System.out.println(sb.length());
        //System.out.println(ispalindrome(str));
        //System.out.println(Short_Path(path));
        //System.out.println(str.substring(0,4));
        //System.out.println(str.substring(4));
    }
}
