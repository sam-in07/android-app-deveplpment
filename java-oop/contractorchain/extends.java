 class constractorchainchild extends Main {

         int value3;
         int value4;

         constractorchainchild() {
             super(11, 22);
             value3 = 3;
             value4 = 4;
             System.out.println("Inside the Constructor of Child");
         }

         public void display() {
             System.out.println("Value1 === " + val1);
             System.out.println("Value2 === " + val2);
             System.out.println("Value3 === " + value3);
             System.out.println("Value4 === " + value4);
         }

         public static void main(String args[]) {
             constractorchainchild c1 = new constractorchainchild();
             c1.display();
         }
}







