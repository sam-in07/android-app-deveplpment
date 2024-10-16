// Access modifiers: public, abstract, final
public class Main {
   int val1 ;
   int val2 ;
    Main() {
        val1  = 10 ;
        val2 = 20 ;
     System.out.println("Inside contracttor");
    }
    public void  display() {
        System.out.println("value 1 ====" +val1);
        System.out.println("value 2 ====" +val2);
    }
   public static void main(String[] args) {
        Main  c1 = new Main(); // c1 referrence  new ta creating obj
        c1.display();  // active  mode
   }
}
