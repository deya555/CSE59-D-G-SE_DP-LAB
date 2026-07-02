import java.util.scanner
public class main41{
    public static void main(String[] args){
        scanner sc = new scanner(System.in);
        System.out.println("name");
        b employee = new b("jhon");

        contructor contructor = new contructor("Mike");

        employee.calculateBonus();
        contructor.work();
    }
}

class teammember{
    protected String name;

    public teammember(String name){
        this.name = name;
    }
}

class b extends teammember{
    public b(String name){
        super(name);
    }
    public void calculateBonus(){
        System.out.println(name + " eligible");

    }
}
class contructor extends teammember{
    public contructor (String name){
        super(name);
    }
    public void work(){
        System.out.println(name + " working");
    }
}
