

//      What is Recursion?
// ===> f(x) = f(x)^2  ==> f(4) = f(4)^2 = 16
//      f(f(x)) = f(f(x)^2)  ==> f(f(2)^2) = 16
//      n! = (n-1)! + (n-2)! + (n-3)!

//      recursion works on three steps:
//      ~. bace case ko define karan
//      ~. hum jis bhi function me hai vana kuch kamm karte rehna hai.
//      ~. ki aap ko inner fun ko call lagane ka hai and hume pura vishvas hai ki o kuch kam karke dega.
//      1.recursion yani dividing problem into smaller instance of similar func.
//      2.recursion is one of the core concept of the programming language.
//      3.use of recursion is more in the Trees, Graps,DP etc.
//      4.iteration and recursion are bhai bhai ham recursion se jo kam kar sakle vahi
//        kam hum iteration se bhi kar sakte hai but recursion se adv programming karna
//        bohot easy hota hai(ex=> trivsing the trees).depending on que hum dono me se
//        ak use karte hai.
//      5.jub ak fun khudi ko bar bar call karta hai to us process ko recursion kehte hai.
//      6. two diraction me recursion kam karrta hai.
//          a) top se lekar base case tak jahan hum badi problem ko choti problem me
//              convert karenge.
//          b) ab hum base cass se upper jayenge solution ko combine kar kar ke.
//      7. using flow:
//          main ==>  fun ==>  fun ==> fun ==> Base Case and reverse the process.
//

//  #~ Recursive fun==> recursive fun o fun hote hai jo khud hi ko bar bar call
//                      karte hai for apnese small problem.
//  #~ base case==> yani jahan pe recursion khatm hota hai.

//  #~ call stack==> call stack java ke andar ak data structure hota hai java me ak fun dusre fun ko
//                 call karta hai to o call stack banta hai.
//  ~jabhi ak chiz ko dusre chiz pe rakate hai to use stack kehte hai.
//
//  #~ STACK OVERFLOW ==>stack overflow ak error hai jo tab aata ha jb bahut sare parameter high memory aqure
//                       karte hai or too many recursion call hote hai tab isse pura memory stack bhar jata
//                       aur stack overflow error occure ho jata hai.
//  ~jbhi hum recursion karte hai to hume Base Case pata hona chaiye nahi to humara code crash ho jata hai.


//public class Recursion {
//
//    // prob #1: print the values in dec order(n to 1)
//    public static void printDecNum(int n){ // void type is liye kyunki kuchh return nahi kar raha.
//        if(n == 1){               // ab hum Base case ko print karenge jayse hi apna n ak ke barabar hoga
////                                   to hum n ko print karege and  return kar denge .
//            System.out.print(n);
//            return;
//        }
//        System.out.print(n+" "); // fun ka phila kaam ye statement print karega 'n' ki value ko.
//        printDecNum(n-1);        // fun ka dusra kamm aapne inner fun ko call karne ka
//    }
//
//    // prob #2: print the values in inc order(1 to n)
//    // saabse phile huma re fun me int n ak parameter aaye jise hum as 5 define karenge.
//    // yaha pe hum 'n' ko print karnese pahile hum 'n-1' tak sare values print karenge aur usme 'n' ko add karenge
//
//    public static void PrintInc(int n){
//        if(n == 1){
//            System.out.print(n+" ");
//            return;
//        }
//        PrintInc(n-1);
//        System.out.print(n+" ");
//    }
//
//    // prob #3: print factorial of given number .
//
//    public static int Fact(int n){
//
//        if(n == 0){
//            return 1;
//        }
//        int Fnm1 = Fact(n-1); // phile to hum f(n-1) nikalene using Fact(n-1)
//        int Fn = n * Fnm1;   // yahape fact(n) nikalenge
//        return Fn;
//    }
//
//    // prob #4: print sum of first n natural number.
//
//    public static int CalcSum(int n){
//        if(n == 1){
//            return 1;
//        }
//        int Fnm1 = CalcSum(n-1); // phile func ko call karke hum Fnm1 calc karege.
//        int Fn = n + Fnm1;
//        return Fn;
//    }
//
//    // prob #5:calc nth term of fibonacci.
//    // fibn = fib(n-1) + fib(n-2)
//
//    public static int fib(int n){
//
//        if(n == 0 || n== 1){
//            return n;
//        }
//        int Fnm1 = fib(n-1);
//        int Fnm2 = fib(n-2);
//        int Fn = Fnm1 + Fnm2;
//        return Fn;
//    }
//
//
//    // prob #6:check given array is sorted of not.
//    //  {1,2,3,4,5}
//    //  array sorted hai use hum assending order me dekha re honge.
//    //  phile hum har ak pair ko compare karenge ,ki phila vala num dusre se
//    //  chota hai to return true kar denge. aur baki part ko recursion se call karenge .
//
//    public static boolean isSorted(int arr[],int i){ // 'i' o starting point hai jahase hum compare
////                                                       karna chalu karenge.
//        if(i == arr.length -1){ // base case
//            return true;
//        }
//        if( arr[i] > arr[i+1]){ //yaha pe commparsion hoga
//            return false;
//        }
//        return isSorted(arr, i+1); // i+1 se recursion call hoga.
//    }
//
//
//    // Que #7: WAF to find the first occurence of an element in the arry.
//
//    public static int firstOccur(int i,int arr[],int key){
//        if(i == arr.length){
//            return -1; // -1 isliye ki o show karta hai ki key pure index me found nahi huvi or o ak invalid index hai.
//        }
//        if(arr[i] == key){
//            return i;
//        }
//        return firstOccur(i+1, arr, key); // yaha i+1 se start karenge kunki i keliye check ho gaya hai.
//    }
//
//
//
//    // Que #8: WAF to find the last occurence of an element in the arry.
//
//    public static int lastOccur(int arr[],int key,int i){
//        if(i == arr.length){ // base case
//            return -1;
//        }
//        int isFound = lastOccur(arr, key, i+1); // pahile look forward karenge
//        if(isFound == -1 &&  arr[i]== key){ // next khud ko yani pahile value ko campare karenge.
//            return i;
//        }
//
//        return isFound;
//    }
//
//    //Que #9: print x to the power n.
//    // power (x ,n) = x * (x^n-1)
//
//    public static int power(int x,int n){
//        if(n == 0){// base case
//            return 1;
//        }
//        // int xnm1 = power(x, n-1);
//        // int xn = x * xnm1;
//        // return xn;
//
//        return x * power(x, n-1);
//    }
//
//
//    // Que #10: print x to the power n (optimized).O(logn)
//    // x^n ==> (x^n/2 * x^n/2) for even
//    // 2^10 = ( 2^5 * 2^5 )
//    // x^n ==> (x * x^n/2 * x^n/2) for odd
//
//    // ab pehle aapni power ko half se divide karana hai aur upper vale level ke liye call lagani hai.
//    // aaye huye value ko half
//    public static int optimizedPower(int a, int n){
//
//        if(n == 0){
//            return 1;
//        }
//        int halfpower = optimizedPower(a, n/2);
//        int halfpowersr = halfpower* halfpower;
//
//        // agar hamara n ak even power hai to koi pharkh nahi padega isko return kar denge but agar power
//        //  odd aaye to hum is variable ke value ko 'a' se muliply karna padega.
//        if( n % 2 != 0){
//            halfpowersr = a * halfpowersr;
//        }
//        return halfpowersr;
//    }
//
//    // Que #11: tiling problem
//    // Given a "2*n" board and tiles of size "2*1", count the number of ways to tile
//    // the board using the 2*1 tiles .(A tile can either be placed horizontally or vertically).
//
//    // tiling problem approach
//    // jb n=0(2*0) hota hai to tab koi bhi tile nahi use hota o bhi a way hai isliye (1 Ways)
//    // jb n=1(2*1) hota hai tb ak hi way hota o hai vertically.
//    // jb n=2(2*2) hota tb (two ways hote hai)ak way vertically karskte hai aur ak way horizontally kar skate hai.
//    //  ==> is me apna Base Case ==> jub hamara n(0,1) ho ta hai tab ak hi way hota hai.
//
//    // recursion ke har ak level pe ak choice hoti hai.
//
//    //      vertically   <<=== choice ===>>   horizontally
//
//    // first logic ===>> suppose hamara floar (2*n) hai and hum ne vertically choice li .to o tile 1 leng area gher lega
//    //         to floar me n-1 part bach jayega to ab hame (2*n-1) hise ko bharna hai
//    //          hum ne (2*n) ke liye ho gaya hai.
//    //  hamara fun f(n) hamare floar 2 x n ko bharta hai, to ab fun f(n-1) fun (2 x n-1) ko bharega.
//
//    // second logic ===> hum jaise horizontal tiles ko floar me bharenge uske bad hum vertical nahi bhar sakte uske niche.
//    // to jaise hum horizonally tiles ko bharenge tabhi o 2 leng space aquare karegi and and hame (n x n-2) ko bharna hoga.
//
//    // total ways = f(n-) + f(n-2)
//
//    public static int tilingproblem(int n){ // n is liye ki hamare floar ka size 2xn ke barabr hai , n batata hai ki floar ki length kitni hai.
//
//        // base case
//        if( n == 0 || n==1){
//            return 1;
//        }
//        // choice hai
//        //1.vertically
//        int fnm1 = tilingproblem(n-1);
//        // 2.horizonally
//        int fnm2 = tilingproblem(n-2);
//
//        int totalways = fnm1 + fnm2 ;
//        return totalways;
//
//    }
//
//
//    // Que #12: Removing duplicates in string.(asked by google ,microsoft)
//    // (appnnacollege)
//
//    // solving approach :
//    // to hume ak string di hogi to usmese hume duplicate letter ko hatana hai duplicates yani jo letter dubara string me aaraha hai.
//    // sabse pahila tarika ==> hum ak khali string banayenge aur ak ak string tak jayenge aur check karenge ager ak alphabet
//    //                         dubara aaraha hai to o hum print nahi karenge.hame us keliye 3 variable banane honge.
//
//    // 1. newString(SB) ===> hum har bar ak char ko add kar rahe hai to us keli string Builder ka use karna padega.
//    //  StringBuilder >>>> ye ak asa data type ha jo string se kum time me program execution kar ke dega.
//    // 2. index ===> index variable track karega ki hum String ke kis index pe hai.
//    // java ko yad rakhavane ke liya ki konsa char aachuka hai aur konsa nahi to hum ak array banayenge boolean type ka .
//    // hum is arr ko map nam dete hai.aur uska size hum rakenge 26.kunki hume 'a se z ' tak jana hai.
//
//    // type convesion in expresion ==> jub sare ke sare char kisi expersion me aate hai to o int me convert ho jate hai.
//
//    // index(map arr[]) = currchar - 'a'
//    // base case ==>> 0 se badkar 'n' tak ajayega to hume newString return karna hai.
//    //
//
//    public static void removeDup(String str, int idx, StringBuilder newStr,boolean map[]) {
//        if(idx == str.length()){ // Base case : hamara idex badte badte str.length ke barabar ho jayega
//            System.out.println(newStr);  //vaise hi hame sare char ko dekh liya ab hame new string print karna hai.
//            return;
//        }
//        // kaam karna hai ki hayase ak char nikalu aur use check karu ki o map exist karta hai kya nahi.
//        char currChar = str.charAt(idx); // yaha jibhi index pe hai us index ka char nikala aur use currChar me store kiya.
//        if(map[currChar -'a'] == true){ // yaha se hame apna index mijayega map vala agar ye
//            removeDup(str, idx+1, newStr, map);//value true hai to hamara currChar ak dup hai to hume next index ke liye call lagani hai.
//            // dusra case agar upper vali case false ho jaye to hame esle vala likhana padega to us time map ke aandrr
//            // currChar - 'a' ko true karenge aur fun ko call lagayenge aur idx ko +1 karke newStr me currChar ko 'apend' karde ge
//            // to new string ke piche currChar jud jayega kunki first time aaraha hai aur iselye map me true kiya hai.
//        } else{
//            map[currChar - 'a'] = true;
//            removeDup(str, idx+1, newStr.append(currChar), map);
//        }
//    }
//
//    // Que #13: friends paring problem
//    //   given n num of friends, each one can remain single or make pair with another friend, but condition is
//    //   two friend can make only one pair so find out total number of ways in that friend can make pair or
//    //   remain single.
//
//    // Problem approach ===>
//    // >let suppose party n=1 peson hi gaya hai to o only single khada re sakta hai to possible ways
//    //   banenge only (1)
//    // >> agar party me n=2(a and b) person gaye hai to ab ka possibility banegi ki
//    //    ~ " a " akela khada ho sakata or vice varsa
//    //    ~ yato dono pair banaye to possible ways bane (2).
//    // >>> agar party me n=3(a,b,c) person gaye to
//    //    ~1st way hai ki a,b,c singal kadhe ho.
//    //    ~ 2nd way "a" single,(b,c) paired
//    //    ~ 3rd way "b" single,(a,c) paired
//    //    ~ 4th way "c" single,(a,b) paired
//
//    // >>>> Base case : agar n = 1(way 1) ho ya n =2(ways 2)
//    //      if(n == 1 || n  == 2) to hume return karna hai " n "
//
//    public static int friendParing(int n){
//        // // base cace
//        if(n == 1 || n == 2){
//            return n;
//        }
//        // // choice
//        // // single
//        // int fnm1 = friendParing(n-1);
//
//        // // paired
//        // int fnm2 = friendParing(n-2);
//        // int Pairways = (n-1) * fnm2;
//
//        // int totalways = fnm1 + Pairways;
//        // return totalways;
//
//        return friendParing(n-1) + (n-1) * friendParing(n-2);
//    }
//
//    // Que #14:print all binary string of size n  without conseutive ones.
//    // Base case n = 0 hoga to return karnge empty string .
//    //
//
//    public static void binaryString(int n, int lastplace, String str){
//        // base case
//        if(n == 0){
//            System.out.println(str);
//            return;
//        }
//        binaryString(n-1, 0, str +"0");// yaha pe 0 chair pe baitha hai.
//        if(lastplace == 0 ){
//            binaryString(n-1, 1, str +"1");
//        }
//
//    }
//    public static void main(String[] args) {
//        System.out.println(isSorted(null, 12));
//    }
//}

