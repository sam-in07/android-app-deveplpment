/*
to restrict accessing the propoerties of a class ouTsIDE OF THE WORLD
 */
//encapsulation

public class Main {
    private String  name ;
    private int age ;
    private String address;

    public Main(String name, int age , String address)  {
        this.name = name ;
        this.age = age ;
         this.address = address;
    }
    //outside world acces debar jonnno public
    public void setName(String name) {
        this.name = name ;

    }
    public void setAge(int age) {
        this.age = age ;

    }
    public void setAddress(String address) {
        this.address = address ;

    }

    public String getName() {
        return name ;
    }
    public  int getAge () {
        return age;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return ("StUdent name is "+ this,getName() +"< the age is :" + this.getAge()
                +"and address is : " + this.getAddress()) ;
    }

}
