/*
In Java, we can overload constructors like methods. The constructor overloading can be defined as the concept of having more
than one constructor with different parameters so that every constructor can perform a different task.
 */
// constractorchainchild
public class Main {
   int val1 ;
   int val2 ;
    Main() {
        val1  = 10 ;
        val2 = 20 ;
     System.out.println("Inside 1st  parents  contructor ");
    }

    Main(int a , int b ) {
        val1 = a ;
        val2 = b ;
        System.out.println("Inside 2nd parents  contractor");
    }

}
