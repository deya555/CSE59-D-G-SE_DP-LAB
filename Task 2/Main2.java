class numberchecker{
    void check (int num){
        boolean result = (num%2==0) && (num > 10);
        System.out.println(result);
    }
}
public class Main {
    public static void main (String[] args){
        numberchecker c = new numberchecker();
        c.check(14);
    }
}
