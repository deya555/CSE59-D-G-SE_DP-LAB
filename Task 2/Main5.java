public class Printer{
    void printData(String text){
        System.out.println(text);
    }
    void printData(int  number){
        System.out.println(number);
    }
    
    public static void main (String[]args){
        Printer p = new Printer();
        
        p.printData("Hello World");
        p.printData(123);
    }
}

