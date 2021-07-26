package classes;
import interfaces.*;
import java.util.Scanner;
public class Teacher implements Iteacher{
    public String teacherName;
    public String teachingSubject;
    public String teacherAddress;
    public String mobileNumber;
    public int teacherId;
    public int salary;
    boolean flag = false;
   


    public void AddTeacher(){
        do{
        try{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        this.teacherName = input.nextLine();
        System.out.print("Enter the Teaching subjects: ");
        this.teachingSubject = input.nextLine();
        System.out.print("Enter the mobile number: ");
        this.mobileNumber = input.nextLine();
        System.out.print("Enter the Address: ");
        this.teacherAddress = input.nextLine();
        System.out.print("Enter the ID: ");
        this.teacherId = input.nextInt();
        System.out.print("Enter the salary: ");
        this.salary = input.nextInt();
        flag = true;
        }
        catch(Exception e){
            System.out.println("======Your are entering wrong input=======");
            System.out.println("===============Try again!!!================");
        }
        }while(!flag);
       

    }

   public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setTeacherId(int teacherId){
        this.teacherId=teacherId;
    }
    public int getTeacherId(){
        return teacherId;
    }

    public void setTeacherAddress(String teacherAddress){
        this.teacherAddress=teacherAddress;
    }
    public String getTeacherAddress(){
        return teacherAddress;
    }

    
    public void showTeacherInfo(){
        System.out.println("===============Teacher Info===================");
        System.out.println("ID: "+ teacherId);
        System.out.println("Name: " + teacherName);
        System.out.println("Address: "+  getTeacherAddress());
        System.out.println("Mobile Number: "+ mobileNumber);
        System.out.println("Teaching Subjects: "+ teachingSubject) ;
        System.out.println("Teacher salary: "+ salary);
        
    }
}

