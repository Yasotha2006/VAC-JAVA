public class LearnMethods
{
public void makeCall()
{
System.out.println("MAKE CALL");
}
public void sendSms()
{
System.out.println("SEND SMS");
}
public static void main(String args[])
{
System.out.println("---------------------------------");
System.out.println("MAIN METHOD");
LearnMethods phone=new LearnMethods();
phone.makeCall();
phone.sendSms();
}
}