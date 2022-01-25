package Emailapp;

public class Email {
    public static void main(String args[])
    {
        EmailappObjects Em1=new EmailappObjects("john","Doe");
Em1.setAltemail("ls@gmail.com");
System.out.println(Em1.getAltemail());
System.out.println(Em1.Showinfo());
    }
}
