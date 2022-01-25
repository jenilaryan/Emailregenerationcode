package Emailapp;

import java.util.Locale;
import java.util.Scanner;

public class EmailappObjects
{
    private String firstName;
    private int defaultpasswordlength=10;
    private String email;

    private String lastName;
    private String password;
    private String department;
    private int mailboxcapacity;
   private  String altemail;
   private String Companysuffix="company.com";
   public EmailappObjects(String firstName,String lastName)
   {
       this.firstName=firstName;
       this.lastName=lastName;
       System.out.println("EMAIL CREATED"+""+this.firstName+" "+ this.lastName);
       this.department=setDepartment();
       System.out.println("Department is:"+this.department);
       this.password=randomPassword(defaultpasswordlength);
       System.out.println("Your password is"+this.password);
       email=firstName.toLowerCase()+""+lastName.toLowerCase()+"@"+department+"."+Companysuffix;
       System.out.println("Your email is"+email);
   }

   private String  randomPassword(int length)
   {
       String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
       char[] password=new char[length];
       for(int i=0;i<length;i++)
       {
           int rand=(int)(Math.random()*passwordset.length());
           password[i]=passwordset.charAt(rand);
       }
       return new String(password);
   }
   public void setmailboxcapacity(int capacity)
   {
       this.mailboxcapacity=capacity;
   }
   public void setAltemail(String altemail)
   {
       this.altemail=altemail;
   }
   public void changepassword(String password)
   {
       this.password=password;
   }
   public int getemailboxcapacity()
   {
       return mailboxcapacity;
   }
   public String getAltemail()
   {
       return altemail;
   }
   public String getPassword()
   {
       return password;
   }
   public String Showinfo()
   {
       return "SHOW NAME"+"\n"+firstName+""+lastName+"\n"+"COMPANY EMAIL"+email+"\n"+"ALTERNATE EMAIL"+altemail;
   }

   private String setDepartment()
   {
       System.out.print("Enter the department code \n1 for sales \n2 for Development \n3 for Accounting \n0 for none ");
       Scanner in=new Scanner(System.in);
       int deptChoice=in.nextInt();
       if(deptChoice==1)
       {
           return "sales";
       }
       else if(deptChoice==2)
       {
           return "Development";

       }
       else if(deptChoice==3)
       {
           return "Account";
       }
       else {
           return "Wrong choice";
       }

   }
}
