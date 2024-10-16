/*
In Java, we can overload constructors like methods. The constructor overloading can be defined as the concept of having more
than one constructor with different parameters so that every constructor can perform a different task.
 */
// main  contractor over load
public class Main {
   int val1 ;
   int val2 ;
    Main() {
        val1  = 10 ;
        val2 = 20 ;
     System.out.println("Inside 1st  contracttor");
    }
    Main(int a ) {
        val1 = a ;
        System.out.println("Inside 2nd contractor");
    }
    Main(int a , int b ) {
        val1 = a ;
        val2 = b ;
        System.out.println("Inside 3eRd contractor");
    }
    public void  display() {
        System.out.println("value 1 ====" +val1);
        System.out.println("value 2 ====" +val2);
    }
   public static void main(String[] args) {
        Main  c1 = new Main(); // c1 referrence  new ta creating obj
        Main  c2 = new Main(100); // c1 referrence  new ta creating obj
        Main  c3 = new Main(145 , 45); // c1 referrence  new ta creating obj
        c1.display();  // active  mode
        c2.display();  // active  mode
        c3.display();  // active  mode
   }
}
