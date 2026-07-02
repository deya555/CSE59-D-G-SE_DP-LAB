import java.util.scanner 
public class main42{
    public static void main(String[] args){
        scanner sc = new scanner(System.in);
        multi copy = new multi();

        copy.printDoc();
        copy.scanDoc();
        copy.faxDoc();

        BaseP p = new BaseP();
        p.printDoc();
    }
}
interface Printer {
    void printDoc();
}

interface Scanner {
    void scanDoc();
}

interface Fax{
    void faxDoc();
}
class multi implements Printer, Scanner, Fax{
    public void printDoc(){
        System.out.println("printing...");
    }

    public void scanDoc(){
        System.out.println("Scanning...");
    }

    public void faxDoc(){
        System.out.println("Faxing...");
    }
}

    class BaseP implements Printer{
        public void printDoc(){
            System.out.println("printing...");
        }
    }
