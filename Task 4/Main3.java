public class main43{
    public static void main(String[] args){
        MessageSender s = new EmailSender();

        Notification n = new Notification(s);

        n.alertUser("Meeting at 3 PM");
    }
}

interface MessageSender{
    void sendMessage (String message);
}

class EmailSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("email message: " + message);
    }
}
class Notification{
    private MessageSender messageSender;
    public Notification(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void alertUser(String msg){
        messageSender.sendMessage(msg);
    }
}
