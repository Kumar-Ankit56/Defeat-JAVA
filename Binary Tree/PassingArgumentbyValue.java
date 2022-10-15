/**
 * Passing Argument by Value
 */
// public class PassingArgumentbyValue {
//     public static void main(String[] args) {
//         int result=sum(1,2); //ARgument;
//         System.out.println(result);
//     }
//     public static int sum(int x,int y){ ///Parameter
//         return x+y;
//     }
    
// }


public class PassingArgumentbyValue {
    public static void main(String[] args) {
        int x=1;
        increase(x);
        System.out.println(x);
    }
    public static void increase(int x) {
        x++;
        System.out.println(x);
    }
    
}