import classes.*;
import interfaces.*;
import files.*;
import java.util.Scanner;
public class Start{
    public static void main(String[] args){
         Coaching c1 = new Coaching("Ashar alo pathshala",10,"Chottogram");
         FileDemo file = new FileDemo();
         
         
         ClassInformation c61 = new ClassInformation();
         ClassInformation c62 = new ClassInformation();
         ClassInformation c63 = new ClassInformation();
         ClassInformation c64 = new ClassInformation();
         ClassInformation c65 = new ClassInformation();
         ClassInformation c66 = new ClassInformation();
         ClassInformation c67 = new ClassInformation();
         ClassInformation c68 = new ClassInformation();
         ClassInformation c69 = new ClassInformation();
         ClassInformation c610 = new ClassInformation();
         
         
         ClassInformation c71 = new ClassInformation();
         ClassInformation c72 = new ClassInformation();
         ClassInformation c73 = new ClassInformation();
         ClassInformation c74 = new ClassInformation();
         ClassInformation c75 = new ClassInformation();
         ClassInformation c76 = new ClassInformation();
         ClassInformation c77 = new ClassInformation();
         ClassInformation c78 = new ClassInformation();
         ClassInformation c79 = new ClassInformation();
         ClassInformation c710 = new ClassInformation();
     
         
         
         ClassInformation c81 = new ClassInformation();
         ClassInformation c82 = new ClassInformation();
         ClassInformation c83 = new ClassInformation();
         ClassInformation c84 = new ClassInformation();
         ClassInformation c85 = new ClassInformation();
         ClassInformation c86 = new ClassInformation();
         ClassInformation c87 = new ClassInformation();
         ClassInformation c88 = new ClassInformation();
         ClassInformation c89 = new ClassInformation();
         ClassInformation c810 = new ClassInformation();
         
         
         
         ClassInformation c91 = new ClassInformation();
         ClassInformation c92 = new ClassInformation();
         ClassInformation c93 = new ClassInformation();
         ClassInformation c94 = new ClassInformation();
         ClassInformation c95 = new ClassInformation();
         ClassInformation c96 = new ClassInformation();
         ClassInformation c97 = new ClassInformation();
         ClassInformation c98 = new ClassInformation();
         ClassInformation c99 = new ClassInformation();
         ClassInformation c910 = new ClassInformation();
         
         
         
        ClassInformation c101 = new ClassInformation();
         ClassInformation c102 = new ClassInformation();
         ClassInformation c103 = new ClassInformation();
         ClassInformation c104 = new ClassInformation();
         ClassInformation c105 = new ClassInformation();
         ClassInformation c106 = new ClassInformation();
         ClassInformation c107 = new ClassInformation();
         ClassInformation c108 = new ClassInformation();
         ClassInformation c109 = new ClassInformation();
         ClassInformation c1010 = new ClassInformation();
         
         
         Teacher t1 = new Teacher();
         Teacher t2 = new Teacher();
         Teacher t3 = new Teacher();
         Teacher t4 = new Teacher();
         Teacher t5 = new Teacher();
         Teacher t6 = new Teacher();
         Teacher t7 = new Teacher();
         Teacher t8 = new Teacher();
         Teacher t9 = new Teacher();
         Teacher t10 = new Teacher();
         
         
         
         boolean flag = false;
         do{
         try{
         Scanner sc = new Scanner(System.in);
         boolean check = true;
         System.out.println("***WELCOME TO THE COACHING MANAGEMENT SYSTEM COSOLE APPLICATION***");
         System.out.println("=====================================================================");
         
         while(check){
             System.out.println(" 1.Student management");
             System.out.println(" 2.Teacher management");
             System.out.println(" 3.Coaching Income");
             System.out.println("****** press 0 for back to submenu and main menu ******");
             System.out.println("===================================================================");
             
             System.out.println("");
             System.out.print("Please chose your option[MAIN MENU]: ");
             
             
             int input = sc.nextInt();
             
             if(input == 1){
                 
             System.out.println("");
             do{
                 System.out.println("");
                 System.out.println("*****YOU HAVE SELECTED STUDENT MANAGEMENT*******");
                 System.out.println("  1.Student Admission");
                 System.out.println("  2.Show all student");
                 System.out.println("  3.Student Search");
                 System.out.println("  4.Student Remove");
                 
                 System.out.println("  Press 0 to quit");
                 System.out.println("==================================================");
                 System.out.println("");
                 System.out.print("Please chose your option(Student Management[0 to quit]): ");
                 
                 
                 int input1 = sc.nextInt();
             
                 if(input1 != 0){
                 if(input1 == 1){
                 System.out.println("");
                 System.out.println("****YOU HAVE SELECTED STUDENT ADMISSION****");
                 System.out.println("=====CLASS LIST=====");
                 System.out.println("   -> Class 6");
                 System.out.println("   -> Class 7");
                 System.out.println("   -> Class 8");
                 System.out.println("   -> Class 9");
                 System.out.println("   -> Class 10");
                 System.out.println("==============================================");
                 
             System.out.println("");
             
             do{
             System.out.print("Enter the class you want to admit student(0 to quit): ");
             int option11 = sc.nextInt();
              if(option11 != 0){
              
              if(option11 == 6){
                  do{
                      System.out.println("");
                      System.out.println("*** For Id 601 press 601: ***");
                      System.out.println("*** For Id 602 press 602: ***");
                      System.out.println("*** For Id 603 press 603: ***");
                      System.out.println("========================");
                      System.out.println("");
                      System.out.print("Enter your choice(0 to quit):  ");
                      Scanner obb = new Scanner(System.in);
                      int input111 = obb.nextInt();
                      if(input111 != 0){
                          if(input111 == 601){
                           c61.addmissionClass6();
                           c61.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c61.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c61);
                           c1.showClassInfo6();
                           
                           file.writeInFile("Class: 6\nId: 601"+"\n"+"First name: "+c61.firstname +"\n"+"Last name: "+ c61.lastname+"\n"+"Adress: "+c61.address+"\n"+"Mobile number: "+c61.mobilenumber+"\n"+"Date of Birth: "+c61.dateOfBirth+"\n"+"Student ID: "+c61.studentId+"\n"+"Corses enrolled : "+c61.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          if(input111 == 602){
                           c62.addmissionClass6();
                           c62.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c62.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c62);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 602"+"\n"+"First name: "+c62.firstname +"\n"+"Last name: "+ c62.lastname+"\n"+"Adress: "+c62.address+"\n"+"Mobile number: "+c62.mobilenumber+"\n"+"Date of Birth: "+c62.dateOfBirth+"\n"+"Student ID: "+c62.studentId+"\n"+"Corses enrolled : "+c62.courses6,"G:/Coaching Management System/files/History/Student.txt");
                           
                          }
                          if(input111 == 603){
                           c63.addmissionClass6();
                           c63.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c63.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c63);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 603"+"\n"+"First name: "+c63.firstname +"\n"+"Last name: "+ c63.lastname+"\n"+"Adress: "+c63.address+"\n"+"Mobile number: "+c63.mobilenumber+"\n"+"Date of Birth: "+c63.dateOfBirth+"\n"+"Student ID: "+c63.studentId+"\n"+"Corses enrolled : "+c63.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 604){
                           c64.addmissionClass6();
                           c64.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c64.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c64);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 604"+"\n"+"First name: "+c64.firstname +"\n"+"Last name: "+ c64.lastname+"\n"+"Adress: "+c64.address+"\n"+"Mobile number: "+c64.mobilenumber+"\n"+"Date of Birth: "+c64.dateOfBirth+"\n"+"Student ID: "+c64.studentId+"\n"+"Corses enrolled : "+c64.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 605){
                           c65.addmissionClass6();
                           c65.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c65.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c65);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 605"+"\n"+"First name: "+c65.firstname +"\n"+"Last name: "+ c65.lastname+"\n"+"Adress: "+c65.address+"\n"+"Mobile number: "+c65.mobilenumber+"\n"+"Date of Birth: "+c65.dateOfBirth+"\n"+"Student ID: "+c65.studentId+"\n"+"Corses enrolled : "+c65.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 606){
                           c66.addmissionClass6();
                           c66.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c66.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c66);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 606"+"\n"+"First name: "+c66.firstname +"\n"+"Last name: "+ c66.lastname+"\n"+"Adress: "+c66.address+"\n"+"Mobile number: "+c66.mobilenumber+"\n"+"Date of Birth: "+c66.dateOfBirth+"\n"+"Student ID: "+c66.studentId+"\n"+"Corses enrolled : "+c66.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 607){
                           c67.addmissionClass6();
                           c67.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c67.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c67);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 607"+"\n"+"First name: "+c67.firstname +"\n"+"Last name: "+ c67.lastname+"\n"+"Adress: "+c67.address+"\n"+"Mobile number: "+c67.mobilenumber+"\n"+"Date of Birth: "+c67.dateOfBirth+"\n"+"Student ID: "+c67.studentId+"\n"+"Corses enrolled : "+c67.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                           if(input111 == 608){
                           c68.addmissionClass6();
                           c68.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c68.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c68);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 608"+"\n"+"First name: "+c68.firstname +"\n"+"Last name: "+ c68.lastname+"\n"+"Adress: "+c68.address+"\n"+"Mobile number: "+c68.mobilenumber+"\n"+"Date of Birth: "+c68.dateOfBirth+"\n"+"Student ID: "+c68.studentId+"\n"+"Corses enrolled : "+c68.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 609){
                           c69.addmissionClass6();
                           c69.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c69.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c69);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 609"+"\n"+"First name: "+c69.firstname +"\n"+"Last name: "+ c69.lastname+"\n"+"Adress: "+c69.address+"\n"+"Mobile number: "+c69.mobilenumber+"\n"+"Date of Birth: "+c69.dateOfBirth+"\n"+"Student ID: "+c69.studentId+"\n"+"Corses enrolled : "+c69.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 610){
                           c610.addmissionClass6();
                           c610.enrollCourse6();
                           System.out.println("*************Tuition pay section*******************");
                           c610.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent6(c610);
                           c1.showClassInfo6();
                           file.writeInFile("Class: 6\nId: 610"+"\n"+"First name: "+c610.firstname +"\n"+"Last name: "+ c610.lastname+"\n"+"Adress: "+c610.address+"\n"+"Mobile number: "+c610.mobilenumber+"\n"+"Date of Birth: "+c610.dateOfBirth+"\n"+"Student ID: "+c610.studentId+"\n"+"Corses enrolled : "+c610.courses6,"G:/Coaching Management System/files/History/Student.txt");
                          }
                      }
                   else{
                       break;
                      }
                  }while(1 != 0);    
              }
              
              if(option11 == 7){
                  do{
                      System.out.println("*** For Id 701 press 701: ***");
                      System.out.println("*** For Id 702 press 702: ***");
                      System.out.println("*** For Id 703 press 703: ***");
                      System.out.println("========================");
                      System.out.println("");
                      System.out.print("Enter your choice(0 to quit):  ");
                      Scanner obb = new Scanner(System.in);
                      int input111 = obb.nextInt();
                      if(input111 != 0){
                        if(input111 == 701){
                           c71.addmissionClass7();
                           c71.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c71.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c71);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 701"+"\n"+"First name: "+c71.firstname +"\n"+"Last name: "+ c71.lastname+"\n"+"Adress: "+c71.address+"\n"+"Mobile number: "+c71.mobilenumber+"\n"+"Date of Birth: "+c71.dateOfBirth+"\n"+"Student ID: "+c71.studentId+"\n"+"Corses enrolled : "+c71.courses7,"G:/Coaching Management System/files/History/Student.txt");
                        
                        }
                        
                       
                          if(input111 == 702){
                           c72.addmissionClass7();
                           c72.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c72.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c72);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 702"+"\n"+"First name: "+c72.firstname +"\n"+"Last name: "+ c72.lastname+"\n"+"Adress: "+c72.address+"\n"+"Mobile number: "+c72.mobilenumber+"\n"+"Date of Birth: "+c72.dateOfBirth+"\n"+"Student ID: "+c72.studentId+"\n"+"Corses enrolled : "+c72.courses7,"G:/Coaching Management System/files/History/Student.txt");
                           
                          }
                          if(input111 == 703){
                           c73.addmissionClass7();
                           c73.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c73.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c73);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 703"+"\n"+"First name: "+c73.firstname +"\n"+"Last name: "+ c73.lastname+"\n"+"Adress: "+c73.address+"\n"+"Mobile number: "+c73.mobilenumber+"\n"+"Date of Birth: "+c73.dateOfBirth+"\n"+"Student ID: "+c73.studentId+"\n"+"Corses enrolled : "+c73.courses7,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 704){
                           c74.addmissionClass7();
                           c74.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c74.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c74);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 704"+"\n"+"First name: "+c74.firstname +"\n"+"Last name: "+ c74.lastname+"\n"+"Adress: "+c74.address+"\n"+"Mobile number: "+c74.mobilenumber+"\n"+"Date of Birth: "+c74.dateOfBirth+"\n"+"Student ID: "+c74.studentId+"\n"+"Corses enrolled : "+c74.courses7,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 705){
                           c75.addmissionClass7();
                           c75.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c75.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c75);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 705"+"\n"+"First name: "+c75.firstname +"\n"+"Last name: "+ c75.lastname+"\n"+"Adress: "+c75.address+"\n"+"Mobile number: "+c75.mobilenumber+"\n"+"Date of Birth: "+c75.dateOfBirth+"\n"+"Student ID: "+c75.studentId+"\n"+"Corses enrolled : "+c75.courses7,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 706){
                           c76.addmissionClass7();
                           c76.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c76.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c76);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 706"+"\n"+"First name: "+c76.firstname +"\n"+"Last name: "+ c76.lastname+"\n"+"Adress: "+c76.address+"\n"+"Mobile number: "+c76.mobilenumber+"\n"+"Date of Birth: "+c76.dateOfBirth+"\n"+"Student ID: "+c76.studentId+"\n"+"Corses enrolled : "+c76.courses7,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 707){
                           c77.addmissionClass7();
                           c77.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c77.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c77);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 707"+"\n"+"First name: "+c77.firstname +"\n"+"Last name: "+ c77.lastname+"\n"+"Adress: "+c77.address+"\n"+"Mobile number: "+c77.mobilenumber+"\n"+"Date of Birth: "+c77.dateOfBirth+"\n"+"Student ID: "+c77.studentId+"\n"+"Corses enrolled : "+c77.courses7,"G:/Coaching Management System/files/History/Student.txt");
                          }
                           if(input111 == 708){
                           c78.addmissionClass7();
                           c78.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c78.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c78);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 708"+"\n"+"First name: "+c78.firstname +"\n"+"Last name: "+ c78.lastname+"\n"+"Adress: "+c78.address+"\n"+"Mobile number: "+c78.mobilenumber+"\n"+"Date of Birth: "+c78.dateOfBirth+"\n"+"Student ID: "+c78.studentId+"\n"+"Corses enrolled : "+c78.courses7,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 709){
                           c79.addmissionClass7();
                           c79.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c79.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c79);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 709"+"\n"+"First name: "+c79.firstname +"\n"+"Last name: "+ c79.lastname+"\n"+"Adress: "+c79.address+"\n"+"Mobile number: "+c79.mobilenumber+"\n"+"Date of Birth: "+c79.dateOfBirth+"\n"+"Student ID: "+c79.studentId+"\n"+"Corses enrolled : "+c79.courses7,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 710){
                           c710.addmissionClass7();
                           c710.enrollCourse7();
                           System.out.println("*************Tuition pay section*******************");
                           c710.TutionPay7();
                           System.out.println("");
                           c1.InsertStudent7(c710);
                           c1.showClassInfo7();
                           file.writeInFile("Class: 7\nId: 710"+"\n"+"First name: "+c710.firstname +"\n"+"Last name: "+ c710.lastname+"\n"+"Adress: "+c710.address+"\n"+"Mobile number: "+c710.mobilenumber+"\n"+"Date of Birth: "+c710.dateOfBirth+"\n"+"Student ID: "+c710.studentId+"\n"+"Corses enrolled : "+c710.courses7,"G:/Coaching Management System/files/History/Student.txt");
                          }  
                      }
                   else{
                       break;
                      }
                  }while(1 != 0);    
              }
             
              
              if(option11 == 8){
                  do{
                      System.out.println(" *** For Id 801 press 801: *** ");
                      System.out.println("*** For Id 802 press 802: *** ");
                      System.out.println("*** For Id 803 press 803: ***");
                      System.out.println("==============================");
                      System.out.println("");
                      System.out.print("Enter your choice(0 to quit):  ");
                      Scanner obb = new Scanner(System.in);
                      int input111 = obb.nextInt();
                      if(input111 != 0){
                          if(input111 == 801){
                           c81.addmissionClass8();
                           c81.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c81.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c81);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 801"+"\n"+"First name: "+c81.firstname +"\n"+"Last name: "+ c81.lastname+"\n"+"Adress: "+c81.address+"\n"+"Mobile number: "+c81.mobilenumber+"\n"+"Date of Birth: "+c81.dateOfBirth+"\n"+"Student ID: "+c81.studentId+"\n"+"Corses enrolled : "+c81.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          if(input111 == 802){
                           c82.addmissionClass8();
                           c82.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c82.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c82);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 802"+"\n"+"First name: "+c82.firstname +"\n"+"Last name: "+ c82.lastname+"\n"+"Adress: "+c82.address+"\n"+"Mobile number: "+c82.mobilenumber+"\n"+"Date of Birth: "+c82.dateOfBirth+"\n"+"Student ID: "+c82.studentId+"\n"+"Corses enrolled : "+c82.courses8,"G:/Coaching Management System/files/History/Student.txt");
                           
                          }
                          if(input111 == 803){
                           c83.addmissionClass8();
                           c83.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c83.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c83);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 803"+"\n"+"First name: "+c83.firstname +"\n"+"Last name: "+ c83.lastname+"\n"+"Adress: "+c83.address+"\n"+"Mobile number: "+c83.mobilenumber+"\n"+"Date of Birth: "+c83.dateOfBirth+"\n"+"Student ID: "+c83.studentId+"\n"+"Corses enrolled : "+c83.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 804){
                           c84.addmissionClass8();
                           c84.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c84.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c84);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 804"+"\n"+"First name: "+c84.firstname +"\n"+"Last name: "+ c84.lastname+"\n"+"Adress: "+c84.address+"\n"+"Mobile number: "+c84.mobilenumber+"\n"+"Date of Birth: "+c84.dateOfBirth+"\n"+"Student ID: "+c84.studentId+"\n"+"Corses enrolled : "+c84.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 805){
                           c85.addmissionClass8();
                           c85.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c85.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c85);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 805"+"\n"+"First name: "+c85.firstname +"\n"+"Last name: "+ c85.lastname+"\n"+"Adress: "+c85.address+"\n"+"Mobile number: "+c85.mobilenumber+"\n"+"Date of Birth: "+c85.dateOfBirth+"\n"+"Student ID: "+c85.studentId+"\n"+"Corses enrolled : "+c85.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 806){
                           c86.addmissionClass8();
                           c86.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c86.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c86);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 806"+"\n"+"First name: "+c86.firstname +"\n"+"Last name: "+ c86.lastname+"\n"+"Adress: "+c86.address+"\n"+"Mobile number: "+c86.mobilenumber+"\n"+"Date of Birth: "+c86.dateOfBirth+"\n"+"Student ID: "+c86.studentId+"\n"+"Corses enrolled : "+c86.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 807){
                           c87.addmissionClass8();
                           c87.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c87.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c87);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 807"+"\n"+"First name: "+c87.firstname +"\n"+"Last name: "+ c87.lastname+"\n"+"Adress: "+c87.address+"\n"+"Mobile number: "+c87.mobilenumber+"\n"+"Date of Birth: "+c87.dateOfBirth+"\n"+"Student ID: "+c87.studentId+"\n"+"Corses enrolled : "+c87.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                           if(input111 == 808){
                           c88.addmissionClass8();
                           c88.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c88.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c88);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 808"+"\n"+"First name: "+c88.firstname +"\n"+"Last name: "+ c88.lastname+"\n"+"Adress: "+c88.address+"\n"+"Mobile number: "+c88.mobilenumber+"\n"+"Date of Birth: "+c88.dateOfBirth+"\n"+"Student ID: "+c88.studentId+"\n"+"Corses enrolled : "+c88.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 809){
                           c89.addmissionClass8();
                           c89.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c89.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c89);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 809"+"\n"+"First name: "+c89.firstname +"\n"+"Last name: "+ c89.lastname+"\n"+"Adress: "+c89.address+"\n"+"Mobile number: "+c89.mobilenumber+"\n"+"Date of Birth: "+c89.dateOfBirth+"\n"+"Student ID: "+c89.studentId+"\n"+"Corses enrolled : "+c89.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 810){
                           c810.addmissionClass8();
                           c810.enrollCourse8();
                           System.out.println("*************Tuition pay section*******************");
                           c810.TutionPay8();
                           System.out.println("");
                           c1.InsertStudent8(c810);
                           c1.showClassInfo8();
                           file.writeInFile("Class: 8\nId: 810"+"\n"+"First name: "+c810.firstname +"\n"+"Last name: "+ c810.lastname+"\n"+"Adress: "+c810.address+"\n"+"Mobile number: "+c810.mobilenumber+"\n"+"Date of Birth: "+c810.dateOfBirth+"\n"+"Student ID: "+c810.studentId+"\n"+"Corses enrolled : "+c810.courses8,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          
                          
                      }
                   else{
                       break;
                      }
                  }while(1 != 0);    
              }
             
              
              if(option11 == 9){
                  do{
                      System.out.println("*** For Id 901 press 901: ***");
                      System.out.println(" ***For Id 902 press 902: ***");
                      System.out.println(" ***For Id 903 press 903: ***");
                      System.out.println("==============================");
                      System.out.println("");
                      System.out.print("Enter your choice(0 to quit):  ");
                      Scanner obb = new Scanner(System.in);
                      int input111 = obb.nextInt();
                      if(input111 != 0){
                          if(input111 == 901){
                           c91.addmissionClass9();
                           c91.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c91.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c91);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 901"+"\n"+"First name: "+c91.firstname +"\n"+"Last name: "+ c91.lastname+"\n"+"Adress: "+c91.address+"\n"+"Mobile number: "+c91.mobilenumber+"\n"+"Date of Birth: "+c91.dateOfBirth+"\n"+"Student ID: "+c91.studentId+"\n"+"Corses enrolled : "+c91.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          if(input111 == 902){
                           c92.addmissionClass9();
                           c92.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c92.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c92);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 902"+"\n"+"First name: "+c92.firstname +"\n"+"Last name: "+ c92.lastname+"\n"+"Adress: "+c92.address+"\n"+"Mobile number: "+c92.mobilenumber+"\n"+"Date of Birth: "+c92.dateOfBirth+"\n"+"Student ID: "+c92.studentId+"\n"+"Corses enrolled : "+c92.courses9,"G:/Coaching Management System/files/History/Student.txt");
                           
                          }
                          if(input111 == 903){
                           c93.addmissionClass9();
                           c93.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c93.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c93);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 903"+"\n"+"First name: "+c93.firstname +"\n"+"Last name: "+ c93.lastname+"\n"+"Adress: "+c93.address+"\n"+"Mobile number: "+c93.mobilenumber+"\n"+"Date of Birth: "+c93.dateOfBirth+"\n"+"Student ID: "+c93.studentId+"\n"+"Corses enrolled : "+c93.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 904){
                           c94.addmissionClass9();
                           c94.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c94.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c94);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 904"+"\n"+"First name: "+c94.firstname +"\n"+"Last name: "+ c94.lastname+"\n"+"Adress: "+c94.address+"\n"+"Mobile number: "+c94.mobilenumber+"\n"+"Date of Birth: "+c94.dateOfBirth+"\n"+"Student ID: "+c94.studentId+"\n"+"Corses enrolled : "+c94.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 905){
                           c95.addmissionClass9();
                           c95.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c95.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c95);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 905"+"\n"+"First name: "+c95.firstname +"\n"+"Last name: "+ c95.lastname+"\n"+"Adress: "+c95.address+"\n"+"Mobile number: "+c95.mobilenumber+"\n"+"Date of Birth: "+c95.dateOfBirth+"\n"+"Student ID: "+c95.studentId+"\n"+"Corses enrolled : "+c95.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 906){
                           c96.addmissionClass9();
                           c96.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c96.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c96);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 906"+"\n"+"First name: "+c96.firstname +"\n"+"Last name: "+ c96.lastname+"\n"+"Adress: "+c96.address+"\n"+"Mobile number: "+c96.mobilenumber+"\n"+"Date of Birth: "+c96.dateOfBirth+"\n"+"Student ID: "+c96.studentId+"\n"+"Corses enrolled : "+c96.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 907){
                           c97.addmissionClass9();
                           c97.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c97.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c97);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 907"+"\n"+"First name: "+c97.firstname +"\n"+"Last name: "+ c97.lastname+"\n"+"Adress: "+c97.address+"\n"+"Mobile number: "+c97.mobilenumber+"\n"+"Date of Birth: "+c97.dateOfBirth+"\n"+"Student ID: "+c97.studentId+"\n"+"Corses enrolled : "+c97.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                           if(input111 == 908){
                           c98.addmissionClass6();
                           c98.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c98.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c98);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 908"+"\n"+"First name: "+c98.firstname +"\n"+"Last name: "+ c98.lastname+"\n"+"Adress: "+c98.address+"\n"+"Mobile number: "+c98.mobilenumber+"\n"+"Date of Birth: "+c98.dateOfBirth+"\n"+"Student ID: "+c98.studentId+"\n"+"Corses enrolled : "+c98.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 909){
                           c99.addmissionClass9();
                           c99.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c99.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c99);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 909"+"\n"+"First name: "+c99.firstname +"\n"+"Last name: "+ c99.lastname+"\n"+"Adress: "+c99.address+"\n"+"Mobile number: "+c99.mobilenumber+"\n"+"Date of Birth: "+c99.dateOfBirth+"\n"+"Student ID: "+c99.studentId+"\n"+"Corses enrolled : "+c99.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 910){
                           c910.addmissionClass9();
                           c910.enrollCourse9();
                           System.out.println("*************Tuition pay section*******************");
                           c910.TutionPay9();
                           System.out.println("");
                           c1.InsertStudent9(c910);
                           c1.showClassInfo9();
                           file.writeInFile("Class: 9\nId: 910"+"\n"+"First name: "+c910.firstname +"\n"+"Last name: "+ c910.lastname+"\n"+"Adress: "+c910.address+"\n"+"Mobile number: "+c910.mobilenumber+"\n"+"Date of Birth: "+c910.dateOfBirth+"\n"+"Student ID: "+c910.studentId+"\n"+"Corses enrolled : "+c910.courses9,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          
                          
                          
                          
                      }
                   else{
                       break;
                      }
                  }while(1 != 0);    
              }
              
              
              
              if(option11 == 10){
                  do{
                      System.out.println(" ***For Id 1001 press 1001: ***");
                      System.out.println(" ***For Id 1002 press 1002: ***");
                      System.out.println(" ***For Id 1003 press 1003: ***");
                      System.out.println("================================");
                      System.out.println("");
                      System.out.print("Enter your choice(0 to quit):  ");
                      Scanner obb = new Scanner(System.in);
                      int input111 = obb.nextInt();
                      if(input111 != 0){
                          if(input111 == 1001){
                           c101.addmissionClass10();
                           c101.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c101.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c101);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1001"+"\n"+"First name: "+c101.firstname +"\n"+"Last name: "+ c101.lastname+"\n"+"Adress: "+c101.address+"\n"+"Mobile number: "+c101.mobilenumber+"\n"+"Date of Birth: "+c101.dateOfBirth+"\n"+"Student ID: "+c101.studentId+"\n"+"Corses enrolled : "+c101.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          if(input111 == 1002){
                           c102.addmissionClass10();
                           c102.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c102.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c102);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1002"+"\n"+"First name: "+c102.firstname +"\n"+"Last name: "+ c102.lastname+"\n"+"Adress: "+c102.address+"\n"+"Mobile number: "+c102.mobilenumber+"\n"+"Date of Birth: "+c102.dateOfBirth+"\n"+"Student ID: "+c102.studentId+"\n"+"Corses enrolled : "+c102.courses10,"G:/Coaching Management System/files/History/Student.txt");
                           
                          }
                          if(input111 == 1003){
                           c103.addmissionClass10();
                           c103.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c103.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c103);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1003"+"\n"+"First name: "+c103.firstname +"\n"+"Last name: "+ c103.lastname+"\n"+"Adress: "+c103.address+"\n"+"Mobile number: "+c103.mobilenumber+"\n"+"Date of Birth: "+c103.dateOfBirth+"\n"+"Student ID: "+c103.studentId+"\n"+"Corses enrolled : "+c103.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 1004){
                           c104.addmissionClass10();
                           c104.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c104.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c104);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1004"+"\n"+"First name: "+c104.firstname +"\n"+"Last name: "+ c104.lastname+"\n"+"Adress: "+c104.address+"\n"+"Mobile number: "+c104.mobilenumber+"\n"+"Date of Birth: "+c104.dateOfBirth+"\n"+"Student ID: "+c104.studentId+"\n"+"Corses enrolled : "+c104.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 1005){
                           c105.addmissionClass10();
                           c105.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c105.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c105);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1005"+"\n"+"First name: "+c105.firstname +"\n"+"Last name: "+ c105.lastname+"\n"+"Adress: "+c105.address+"\n"+"Mobile number: "+c105.mobilenumber+"\n"+"Date of Birth: "+c105.dateOfBirth+"\n"+"Student ID: "+c105.studentId+"\n"+"Corses enrolled : "+c105.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 1006){
                           c106.addmissionClass10();
                           c106.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c106.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c106);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1006"+"\n"+"First name: "+c106.firstname +"\n"+"Last name: "+ c106.lastname+"\n"+"Adress: "+c106.address+"\n"+"Mobile number: "+c106.mobilenumber+"\n"+"Date of Birth: "+c106.dateOfBirth+"\n"+"Student ID: "+c106.studentId+"\n"+"Corses enrolled : "+c106.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 1007){
                           c107.addmissionClass10();
                           c107.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c67.TutionPay6();
                           System.out.println("");
                           c1.InsertStudent10(c107);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1007"+"\n"+"First name: "+c107.firstname +"\n"+"Last name: "+ c107.lastname+"\n"+"Adress: "+c107.address+"\n"+"Mobile number: "+c107.mobilenumber+"\n"+"Date of Birth: "+c107.dateOfBirth+"\n"+"Student ID: "+c107.studentId+"\n"+"Corses enrolled : "+c107.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                           if(input111 == 1008){
                           c108.addmissionClass10();
                           c108.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c108.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c108);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1008"+"\n"+"First name: "+c108.firstname +"\n"+"Last name: "+ c108.lastname+"\n"+"Adress: "+c108.address+"\n"+"Mobile number: "+c108.mobilenumber+"\n"+"Date of Birth: "+c108.dateOfBirth+"\n"+"Student ID: "+c108.studentId+"\n"+"Corses enrolled : "+c108.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 1009){
                           c109.addmissionClass10();
                           c109.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c109.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c109);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1009"+"\n"+"First name: "+c109.firstname +"\n"+"Last name: "+ c109.lastname+"\n"+"Adress: "+c109.address+"\n"+"Mobile number: "+c109.mobilenumber+"\n"+"Date of Birth: "+c109.dateOfBirth+"\n"+"Student ID: "+c109.studentId+"\n"+"Corses enrolled : "+c109.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                          
                          if(input111 == 1010){
                           c1010.addmissionClass10();
                           c1010.enrollCourse10();
                           System.out.println("*************Tuition pay section*******************");
                           c1010.TutionPay10();
                           System.out.println("");
                           c1.InsertStudent10(c1010);
                           c1.showClassInfo10();
                           file.writeInFile("Class: 10\nId: 1010"+"\n"+"First name: "+c1010.firstname +"\n"+"Last name: "+ c1010.lastname+"\n"+"Adress: "+c1010.address+"\n"+"Mobile number: "+c1010.mobilenumber+"\n"+"Date of Birth: "+c1010.dateOfBirth+"\n"+"Student ID: "+c1010.studentId+"\n"+"Corses enrolled : "+c1010.courses10,"G:/Coaching Management System/files/History/Student.txt");
                          }
                      
                      }
                   else{
                       break;
                      }
                  }while(1 != 0);    
              }
              
              
              }
              else{
                  break;
              }
             }while(1 != 0);
             }
                              
             
                                   //Student show section
             if(input1 == 2){
                 System.out.println("");
                 do{
                     Scanner ob = new Scanner(System.in);
                     System.out.print("Which class student want to do search(0 to quit): ");
                     int in = ob.nextInt();
                     if(in != 0){
                     if(in == 6){
                         System.out.println("========CLASS 6===========");
                         c1.showClassInfo6();
                        
                     }
                     if(in == 7){
                         System.out.println("========CLASS 7===========");
                         c1.showClassInfo7();
                     }
                     if(in == 8){
                         System.out.println("========CLASS 8===========");
                         c1.showClassInfo8();
                     }
                     if(in == 9){
                         System.out.println("========CLASS 9===========");
                         c1.showClassInfo9();
                     }
                     if(in == 10){
                         System.out.println("========CLASS 10===========");
                         c1.showClassInfo10();
                     }
                     }
                     else{
                         break;
                     }
                      
                 }while(1 != 0);
             
             }
             
             
             
                               //Student search section
             if(input1 ==3){
             System.out.println("");
             do{
             System.out.println("================Student Search section================");
             System.out.print("Enter the student Id(press 0 to quit): ");
             Scanner ob = new Scanner(System.in);
             int s = ob.nextInt();
             if(s != 0){
             if(c1.searchStudent6(s) != null){
             if(s == 601){
             System.out.println("**********Student found**********");
             c61.showClass6();
             }
             else if(s == 602){
             System.out.println("*******Student found*******");
             c62.showClass6();
             }
             else if(s == 603){
             System.out.println("********Student found*******");
             c63.showClass6();
             }
             else if(s == 604){
             System.out.println("********Student found********");
             c64.showClass6();
             }
             else if(s == 605){
             System.out.println("*********Student found*********");
             c65.showClass6();
             }
             else if(s == 606){
             System.out.println("**********Student found*********");
             c66.showClass6();
             }
             else if(s == 607){
             System.out.println("***********Student found*********");
             c67.showClass6();
             }
             else if(s == 608){
             System.out.println("**********Student found**********");
             c68.showClass6();
             }
             else if(s == 609){
             System.out.println("**********Student found***********");
             c69.showClass6();
             }
             else if(s == 610){
             System.out.println("************Student found***********");
             c610.showClass6();
             }
             else{
             System.out.println("************Not found*****************");
             }
             }
             

             if(c1.searchStudent7(s) != null){
             if(s == 701){
             System.out.println("Student found");
             c71.showClass7();
             }
             else if(s == 702){
             System.out.println("Student found");
             c72.showClass7();
             }
             else if(s == 703){
             System.out.println("Student found");
             c73.showClass7();
             }
             else if(s == 704){
             System.out.println("Student found");
             c74.showClass7();
             }
             else if(s == 705){
             System.out.println("Student found");
             c75.showClass7();
             }
             else if(s == 706){
             System.out.println("Student found");
             c76.showClass7();
             }
             else if(s == 707){
             System.out.println("Student found");
             c77.showClass7();
             }
             else if(s == 708){
             System.out.println("Student found");
             c78.showClass7();
             }
             else if(s == 709){
             System.out.println("Student found");
             c79.showClass7();
             }
             else if(s == 710){
             System.out.println("Student found");
             c710.showClass7();
             }
             else{
             System.out.println("Not found");
             }
             }
             
             
             
             if(c1.searchStudent8(s) != null){
             if(s == 801){
             System.out.println("Student found");
             c81.showClass8();
             }
             else if(s == 802){
             System.out.println("Student found");
             c82.showClass8();
             }
             else if(s == 803){
             System.out.println("Student found");
             c83.showClass8();       
             }
             else if(s == 804){
             System.out.println("Student found");
             c84.showClass8();       
             }
             else if(s == 805){
             System.out.println("Student found");
             c85.showClass8();       
             }
             else if(s == 806){
             System.out.println("Student found");
             c86.showClass8();       
             }
             else if(s == 807){
             System.out.println("Student found");
             c87.showClass8();       
             }
             else if(s == 808){
             System.out.println("Student found");
             c88.showClass8();       
             }
             else if(s == 809){
             System.out.println("Student found");
             c89.showClass8();       
             }
             else if(s == 810){
             System.out.println("Student found");
             c810.showClass8();       
             }
             else{
             System.out.println("Not found");
             }
             }
             
             
             
             if(c1.searchStudent9(s) != null){
             if(s == 901){
             System.out.println("Student found");
             c91.showClass9();
             }
             else if(s == 902){
             System.out.println("Student found");
             c92.showClass9();
             }
             else if(s == 903){
             System.out.println("Student found");
             c93.showClass9();
             }
             else if(s == 904){
             System.out.println("Student found");
             c94.showClass9();
             }
             else if(s == 905){
             System.out.println("Student found");
             c95.showClass9();
             }
             else if(s == 906){
             System.out.println("Student found");
             c96.showClass9();
             }
             else if(s == 907){
             System.out.println("Student found");
             c97.showClass9();
             }
             else if(s == 908){
             System.out.println("Student found");
             c98.showClass9();
             }
             else if(s == 909){
             System.out.println("Student found");
             c99.showClass9();
             }
             else if(s == 910){
             System.out.println("Student found");
             c910.showClass9();
             }
             else{
             System.out.println("Not found");
             }
             }
             
             if(c1.searchStudent10(s) != null){
             if(s == 1001){
             System.out.println("Student found");
             c101.showClass10();
             }
             else if(s == 1002){
             System.out.println("Student found");
             c102.showClass10();
             }
             else if(s == 1003){
             System.out.println("Student found");
             c103.showClass10();
             }
             else if(s == 1004){
             System.out.println("Student found");
             c104.showClass10();
             }
             else if(s == 1005){
             System.out.println("Student found");
             c105.showClass10();
             }
             else if(s == 1006){
             System.out.println("Student found");
             c106.showClass10();
             }
             else if(s == 1007){
             System.out.println("Student found");
             c107.showClass10();
             }
             else if(s == 1008){
             System.out.println("Student found");
             c108.showClass10();
             }
             else if(s == 1009){
             System.out.println("Student found");
             c109.showClass10();
             }
             else if(s == 1010){
             System.out.println("Student found");
             c1010.showClass10();
             }
             
             else{
             System.out.println("Not found");
             }
             }
            
             
             }
             else{
             break;
             }
             }while(1 != 0);
             }
             
             
                           //Remove Section
            if(input1 == 4){
                System.out.println("");
                do{
                System.out.println("============Remove section=============");
                System.out.print("Enter the student ID(press 0 to quit): ");
                Scanner ob = new Scanner(System.in);
                int r = ob.nextInt();
                if(r != 0){
          c1.removeStudent6(r);
                c1.removeStudent7(r);
                c1.removeStudent8(r);
                c1.removeStudent9(r);
                c1.removeStudent10(r);
            if(r == 601){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
            if(r == 602){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        if(r == 603){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        if(r == 604){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        if(r == 605){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        if(r == 606){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        if(r == 607){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        if(r == 608){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        if(r == 609){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        if(r == 610){
              System.out.println("Student removed");
              c1.showClassInfo6();

            }
                        
                        if(r == 701){
              System.out.println("Student removed");
              c1.showClassInfo7();

            }
            if(r == 702){
              System.out.println("Student removed");
              c1.showClassInfo7();

            }
                        
                        if(r == 703){
              System.out.println("Student removed");
              c1.showClassInfo7();

            }
                        if(r == 704){
              System.out.println("Student removed");
              c1.showClassInfo7();

            }
                        if(r == 705){
              System.out.println("Student removed");
              c1.showClassInfo7();
            }
                        if(r == 706){
              System.out.println("Student removed");
              c1.showClassInfo7();

            }
                        if(r == 707){
              System.out.println("Student removed");
              c1.showClassInfo7();

            }
                        if(r == 708){
              System.out.println("Student removed");
                    c1.showClassInfo7();

            }
                        if(r == 709){
              System.out.println("Student removed");
              c1.showClassInfo7();

            }
                        if(r == 710){
              System.out.println("Student removed");
              c1.showClassInfo7();

            }
                        
                        
                        
                        if(r == 801){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
            if(r == 802){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        if(r == 803){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        if(r == 804){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        if(r == 805){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        if(r == 806){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        if(r == 807){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        if(r == 808){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        if(r == 809){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        if(r == 810){
              System.out.println("Student removed");
              c1.showClassInfo8();

            }
                        
                        
                        
                        
                        if(r == 901){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
            if(r == 902){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 903){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 904){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 905){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 906){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 907){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 908){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 909){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 909){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        if(r == 910){
              System.out.println("Student removed");
              c1.showClassInfo9();

            }
                        
                        if(r == 1001){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
            if(r == 1002){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        if(r == 1003){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        if(r == 1004){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        if(r == 1005){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        if(r == 1006){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        if(r == 1007){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        if(r == 1008){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        if(r == 1009){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        if(r == 1010){
              System.out.println("Student removed");
              c1.showClassInfo10();

            }
                        
          }
                else{
          break;
                }

                }while(1 != 0);
            }
                 }
                 else{
                     break;
                 }
                 }while(1 != 0);
             }
             
        
             
             
             
             if(input == 2){
                 
                 
                 do{
                 System.out.println("=====You are selected Teacher Management=====");
                 System.out.println("  1.Add teacher");
                 System.out.println("  2.Show all Teacher");
                 System.out.println("  3.Teacher Search");
                 System.out.println("  4.Teacher Remove");
                 System.out.println("=====================================");
                 System.out.println("");
                 
                 
                 System.out.print("Enter your choice[Teacher Management]: ");
                 Scanner ob1 = new Scanner(System.in);
                 int input2 = ob1.nextInt();
                 if(input2 != 0){
                 if(input2 == 1){
                     
                     do{
                         System.out.println("For Creating ID:10001 press 10001");
                         System.out.println("For Creating ID:10002 press 10001");
                         System.out.println("For Creating ID:10003 press 10001");
                         System.out.println("====================================");
                     
                         System.out.print("Enter your Choice(0 to quit): ");
                         Scanner ob2 = new Scanner(System.in);
                         int input21 = ob2.nextInt();
                         if(input21 !=0){
                             if(input21 == 10001){
                               t1.AddTeacher();
                               c1.InsertTeacher(t1);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t1.teacherName+"\n"+"Teaching Subject: "+t1.teachingSubject+"\n"+"Mobile Number: "+t1.mobileNumber+"\n"+"Address: "+t1.teacherAddress+"\n"+"ID: "+t1.teacherId+"\n"+"Salary: "+t1.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           if(input21 == 10002){
                               t2.AddTeacher();
                               c1.InsertTeacher(t2);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t2.teacherName+"\n"+"Teaching Subject: "+t2.teachingSubject+"\n"+"Mobile Number: "+t2.mobileNumber+"\n"+"Address: "+t2.teacherAddress+"\n"+"ID: "+t2.teacherId+"\n"+"Salary: "+t2.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           if(input21 == 10003){
                               t3.AddTeacher();
                               c1.InsertTeacher(t3);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t3.teacherName+"\n"+"Teaching Subject: "+t3.teachingSubject+"\n"+"Mobile Number: "+t3.mobileNumber+"\n"+"Address: "+t3.teacherAddress+"\n"+"ID: "+t3.teacherId+"\n"+"Salary: "+t3.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           
                           if(input21 == 10004){
                               t4.AddTeacher();
                               c1.InsertTeacher(t4);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t4.teacherName+"\n"+"Teaching Subject: "+t4.teachingSubject+"\n"+"Mobile Number: "+t4.mobileNumber+"\n"+"Address: "+t4.teacherAddress+"\n"+"ID: "+t4.teacherId+"\n"+"Salary: "+t4.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           if(input21 == 10005){
                               t5.AddTeacher();
                               c1.InsertTeacher(t5);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t5.teacherName+"\n"+"Teaching Subject: "+t5.teachingSubject+"\n"+"Mobile Number: "+t5.mobileNumber+"\n"+"Address: "+t5.teacherAddress+"\n"+"ID: "+t5.teacherId+"\n"+"Salary: "+t5.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           if(input21 == 10006){
                               t6.AddTeacher();
                               c1.InsertTeacher(t6);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t6.teacherName+"\n"+"Teaching Subject: "+t6.teachingSubject+"\n"+"Mobile Number: "+t6.mobileNumber+"\n"+"Address: "+t6.teacherAddress+"\n"+"ID: "+t6.teacherId+"\n"+"Salary: "+t6.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           if(input21 == 10007){
                               t7.AddTeacher();
                               c1.InsertTeacher(t7);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t7.teacherName+"\n"+"Teaching Subject: "+t7.teachingSubject+"\n"+"Mobile Number: "+t7.mobileNumber+"\n"+"Address: "+t7.teacherAddress+"\n"+"ID: "+t7.teacherId+"\n"+"Salary: "+t7.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           if(input21 == 10008){
                               t8.AddTeacher();
                               c1.InsertTeacher(t8);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t8.teacherName+"\n"+"Teaching Subject: "+t8.teachingSubject+"\n"+"Mobile Number: "+t8.mobileNumber+"\n"+"Address: "+t8.teacherAddress+"\n"+"ID: "+t8.teacherId+"\n"+"Salary: "+t1.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           if(input21 == 10009){
                               t9.AddTeacher();
                               c1.InsertTeacher(t9);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t9.teacherName+"\n"+"Teaching Subject: "+t9.teachingSubject+"\n"+"Mobile Number: "+t9.mobileNumber+"\n"+"Address: "+t9.teacherAddress+"\n"+"ID: "+t9.teacherId+"\n"+"Salary: "+t9.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                           if(input21 == 10010){
                               t10.AddTeacher();
                               c1.InsertTeacher(t10);
                               c1.showCoachingInfoWithTeacher();
                               file.writeInFile("===========Teacher Information=========="+"\n"+"Teacher name:"+t10.teacherName+"\n"+"Teaching Subject: "+t10.teachingSubject+"\n"+"Mobile Number: "+t10.mobileNumber+"\n"+"Address: "+t10.teacherAddress+"\n"+"ID: "+t10.teacherId+"\n"+"Salary: "+t10.salary,"G:/Coaching Management System/files/History/Teacher.txt");
                               
                           }
                         }
                         else{
                             break;
                         }
                         
                     }while(1 !=0);
                 }
                 
                 
                if(input2 == 2){
                System.out.println("=======Teacher List===========");
                System.out.println("\t"+"==Ashar Alo Pathshala==");
                c1.showCoachingInfoWithTeacher();
                
                 }
                
                
                                //Teacher Search Section
                if(input2 == 3){
                    do{
                        System.out.println("===========Teacher Search===============");
                        System.out.print("Enter the teacher ID(0 to quit): ");
                        Scanner ob = new Scanner(System.in);
                        int input23 = ob.nextInt();
                        if(input23 != 0){
                            if(c1.SearchTeacher(input23) != null){
                                if(input23 == 10001){
                                   System.out.println("Teacher Found");
                                   t1.showTeacherInfo();
                                   }
                                if(input23 == 10002){
                                  System.out.println("Teacher Found");
                                  t2.showTeacherInfo();
                                   }
                                if(input23 == 10003){
                                System.out.println("Teacher Found");
                                t3.showTeacherInfo();
                                 }
                                 if(input23 == 10004){
                                System.out.println("Teacher Found");
                                t4.showTeacherInfo();
                                 }
                                  if(input23 == 10005){
                                System.out.println("Teacher Found");
                                t5.showTeacherInfo();
                                 }
                                  if(input23 == 10006){
                                System.out.println("Teacher Found");
                                t6.showTeacherInfo();
                                 }
                                  if(input23 == 10007){
                                System.out.println("Teacher Found");
                                t7.showTeacherInfo();
                                 }
                                  if(input23 == 10008){
                                System.out.println("Teacher Found");
                                t8.showTeacherInfo();
                                 }
                                   if(input23 == 10009){
                                System.out.println("Teacher Found");
                                t9.showTeacherInfo();
                                 }
                                    if(input23 == 100010){
                                System.out.println("Teacher Found");
                                t10.showTeacherInfo();
                                 }
                     
                    }
                    }
                    else{
                          break;
                        }
                    }while(1 != 0);
                 
             
             }
                
             if(input2 == 4){
                 do{
                 System.out.println("=================Remove teacher=============");
                 System.out.print("Enter the teacher ID: ");
                 Scanner ob = new Scanner(System.in);
                 int input24 = ob.nextInt();
                 
                     if(input24 != 0){
                         c1.removeTeacher(input24);
                         if(input24 == 10001){
                             System.out.println("Teacher ID: 10001 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 10002){
                             System.out.println("Teacher ID: 10002 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 10003){
                             System.out.println("Teacher ID: 10003 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 10004){
                             System.out.println("Teacher ID: 10004 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 10005){
                             System.out.println("Teacher ID: 10005 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 10006){
                             System.out.println("Teacher ID: 10006 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 10007){
                             System.out.println("Teacher ID: 10007 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 10008){
                             System.out.println("Teacher ID: 10008 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 10009){
                             System.out.println("Teacher ID: 10009 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                         else if(input24 == 100010){
                             System.out.println("Teacher ID: 100010 removed");
                 c1.showCoachingInfoWithTeacher();
                         }
                     }
                     else{
                         break;
                     }
                 }while(1 != 0);
             }
          
                 }
                 else{
                     break;
                 }
                 }while(1 != 0);
                 }
             
             
        if(input == 3){
           System.out.println("===========Info about Coaching Income===========");
           System.out.println("=======================================");
           int teacherSalary= t1.getSalary()+t2.getSalary()+t3.getSalary()+t4.getSalary()+t5.getSalary()+t6.getSalary()+t7.getSalary()+t8.getSalary()+t9.getSalary()+t10.getSalary();
           System.out.println("Total teacher salary: "+ teacherSalary);
           System.out.println("================================================");
           System.out.println("");
      
           int Class6tuitionpay = (c61.class6TotalFess()+c62.class6TotalFess()+c63.class6TotalFess()+c64.class6TotalFess()+c65.class6TotalFess()+c66.class6TotalFess()+c67.class6TotalFess()+c68.class6TotalFess()+c69.class6TotalFess()+c610.class6TotalFess());
           System.out.println("Total Class 6 Student Tuition pay: "+ Class6tuitionpay);
           System.out.println("");
           
           int Class7tuitionpay = (c71.class7TotalFess()+c72.class7TotalFess()+c73.class7TotalFess()+c74.class7TotalFess()+c75.class7TotalFess()+c76.class7TotalFess()+c77.class7TotalFess()+c78.class7TotalFess()+c79.class7TotalFess()+c710.class7TotalFess());
           System.out.println("Total Class 7 Student Tuition pay: "+ Class7tuitionpay);
           System.out.println("");
           
           int Class8tuitionpay = (c81.class8TotalFess()+c82.class8TotalFess()+c83.class8TotalFess()+c84.class8TotalFess()+c85.class8TotalFess()+c86.class8TotalFess()+c87.class8TotalFess()+c88.class8TotalFess()+c89.class8TotalFess()+c810.class8TotalFess());
           System.out.println("Total Class 8 Student Tuition pay: "+ Class8tuitionpay);
           System.out.println("");
           
           int Class9tuitionpay = (c91.class9TotalFess()+c92.class9TotalFess()+c93.class9TotalFess()+c94.class9TotalFess()+c95.class9TotalFess()+c96.class9TotalFess()+c97.class9TotalFess()+c98.class9TotalFess()+c99.class9TotalFess()+c910.class9TotalFess());
           System.out.println("Total Class 9 Student Tuition pay: "+ Class9tuitionpay);
           System.out.println("");
           
           int Class10tuitionpay = (c101.class10TotalFess()+c102.class10TotalFess()+c103.class10TotalFess()+c104.class10TotalFess()+c105.class10TotalFess()+c106.class10TotalFess()+c107.class10TotalFess()+c108.class10TotalFess()+c109.class10TotalFess()+c1010.class10TotalFess());
           System.out.println("Total Class 7 Student Tuition pay: "+ Class10tuitionpay);
           System.out.println("");
           
          
          int CoachingIncome = ((Class6tuitionpay+Class7tuitionpay+Class8tuitionpay+Class9tuitionpay+Class10tuitionpay)-teacherSalary);
          System.out.println("=========================================");
          System.out.println("");
          System.out.println("*****************************************");
          System.out.println("Total coaching Income: "+ CoachingIncome);
          System.out.println("");
          System.out.println("*****************************************");
            
          
            
        }
     
     
         
flag = true;
}

         }
catch(Exception e){
    System.out.println("======Your are entering wrong input=======");
    System.out.println("===============Try again!!!================");
}
         }while(!flag);         
}
}

