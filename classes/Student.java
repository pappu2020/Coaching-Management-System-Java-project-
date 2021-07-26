package classes;
import interfaces.*;
import java.util.Scanner;
public class Student implements Istudent{
    public String firstname;
    public String lastname;
    public String address;
    public String mobilenumber;
    public String dateOfBirth;
    public int Class;
    public int studentId;
    public String courses="";
    public int tutionfees;
    public static int costOfCourse=200;
    public int uddatetuitionFess=0;
    boolean flag = false;
    
    public void studentAdmission(){
        do{
        try{
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the student first name: ");
        this.firstname = input.nextLine();
        System.out.print("Enter the student last name: ");
        this.lastname = input.nextLine();
        System.out.print("Enter the address: ");
        this.address = input.nextLine();
        System.out.print("Enter the mobile number: ");
        this.mobilenumber = input.nextLine();
        System.out.print("Enter the student Date of birth: ");
        this.dateOfBirth = input.nextLine();
        System.out.print("Enter the ID: ");
        this.studentId=input.nextInt();
        System.out.println("==============Class List==================");
        System.out.print("1.Class 6\n 2.class 7\n 3.Class 8\n 4.Class 9\n 5.Class 10\nEnter the class:");
        this.Class=input.nextInt();
        flag = true;
        }
        catch(Exception e){
            System.out.println("======Your are entering wrong input=======");
            System.out.println("===============Try again!!!================");
            
        }
        }while(!flag);
    }
    
    public void setId(int studentId){
        this.studentId=studentId;
        
    }
    public int getId(){
        return studentId;
    }

    public void ShowInfo(){
        System.out.println("-----Information about Student----------");
        System.out.println("Name of the student is: "+ firstname +" "+ lastname);
        System.out.println("Address: "+ address );
        System.out.println("Mobile number: "+mobilenumber);
        System.out.println("Date of Birth: "+ dateOfBirth);
        System.out.println("Class: "+ Class);
        System.out.println("ID: "+ studentId);
           
    }
}

