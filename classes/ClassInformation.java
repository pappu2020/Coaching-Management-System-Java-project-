package classes;
import interfaces.*;
import java.util.Scanner;

public class ClassInformation extends Student implements IclassInformation{
    public String courses6="",courses7="",courses8="",courses9="",courses10="";
    public int tutionfees6,tutionfees7,tutionfees8,tutionfees9,tutionfees10;
    public static int costOfCourse6=300,costOfCourse7=400,costOfCourse8=500,costOfCourse9=600,costOfCourse10=700;
    public int uddatetuitionFess6=0,uddatetuitionFess7=0,uddatetuitionFess8=0,uddatetuitionFess9=0,uddatetuitionFess10=0;
    boolean flag = false;
    
    public void addmissionClass6(){
        System.out.println(        "[Class: "+"6"+ "]");
        super.studentAdmission();
    }
    public void enrollCourse6(){
        do{
            System.out.println("============Courses List------ ");
            System.out.println("1.Bangla 1st paper\n 2.Bangla 2nd paper\n 3.English 1st paper\n 4.English 2nd paper\n 5.General math\n 6.Social science\n 7.Science");
            System.out.println("Enter the course to enroll(Press Q to quit): ");
            Scanner ob = new Scanner(System.in);
            String course = ob.nextLine();
            if(!course.equals("Q")){
                courses6 =courses6 +"\n"+course;
                System.out.println("Course enrolled!!");
                tutionfees6 = tutionfees6 + costOfCourse6;
            }
            else{
                break;
            }  
        } while(1 != 0);
    }
    
    public void viewAmount6(){
        System.out.println("Tution fess have to pay: " + tutionfees6 + " "+ " Taka");
        
    }
    
    public void TutionPay6(){
        do{
        try{
        viewAmount6();
        
        System.out.println("**************************************************");
        System.out.print("Enter the amount you doing pay: ");
        Scanner obb = new Scanner(System.in);
        int input = obb.nextInt();
         uddatetuitionFess6=input;
        tutionfees6= tutionfees6-input;
        System.out.println("===============Thank you for your payment!!!==================");
        System.out.println("Balance: "+ tutionfees6 + " "+" Taka");
        flag = true;
        }
        catch(Exception e){
            System.out.println("======Your are entering wrong input=======");
            System.out.println("===============Try again!!!================");
            
        }
        }while(!flag);
    }
    
    
    
    public int class6TotalFess(){
        return uddatetuitionFess6; 
    }
    
    public void showClass6(){
        System.out.println("*******Basic Information**********");
        super.ShowInfo();
        System.out.println("******Enrolled Courses*******");
        System.out.println("");
        System.out.println(courses6);
        System.out.println("");
        System.out.println("*****************************");
        
    }
    
    
                             //For class 7
    public void addmissionClass7(){
        System.out.println(        "[Class: "+"7"+ "]");
        super.studentAdmission();
    }
    public void enrollCourse7(){
        do{
            System.out.println("============Courses List------ ");
            System.out.println("1.Bangla 1st paper\n 2.Bangla 2nd paper\n 3.English 1st paper\n 4.English 2nd paper\n 5.General math\n 6..Social science\n 7.Science");
            System.out.println("Enter the course to enroll(Press Q to quit): ");
            Scanner ob = new Scanner(System.in);
            String course = ob.nextLine();
            if(!course.equals("Q")){
                courses7 =courses7 +"\n"+course;
                System.out.println("Course enrolled!!");
                tutionfees7 = tutionfees7 + costOfCourse7;
            }
            else{
                break;
            }  
        } while(1 != 0);
    }
    
    public void viewAmount7(){
        System.out.println("Tution fess have to pay: " + tutionfees7 + " "+ " Taka");
        
    }
    
    public void TutionPay7(){
        do{
        try{
        viewAmount7();
      
        System.out.println("*****************************************************");
        System.out.print("Enter the amount you doing pay: ");
        Scanner obb = new Scanner(System.in);
        int input = obb.nextInt();
         uddatetuitionFess7=input;
        tutionfees7= tutionfees7-input;
        System.out.println("===============Thank you for your payment!!!==================");
        System.out.println("Balance: "+ tutionfees7 + " "+" Taka");
        flag = true;
        }
        catch(Exception e){
            System.out.println("======Your are entering wrong input=======");
            System.out.println("===============Try again!!!================");
            
        }
        }while(!flag);
           
    }
    
    
    
    public int class7TotalFess(){
        return uddatetuitionFess7; 
    }
    
    public void showClass7(){
        System.out.println("*******Basic Information**********");
        super.ShowInfo();
        System.out.println("******Enrolled Courses*******");
        System.out.println("");
        System.out.println(courses7);
        System.out.println("");
        System.out.println("*****************************");
        
    }
    
                        //For class 8
    
    public void addmissionClass8(){
        System.out.println(        "[Class: "+"8"+ "]");
        super.studentAdmission();
    }
    public void enrollCourse8(){
        do{
            System.out.println("============Courses List------ ");
            System.out.println("1.Bangla 1st paper\n 2.Bangla 2nd paper\n 3.English 1st paper\n 4.English 2nd paper\n 5.General math\n 6.Social science\n 7.Science\n 8.ICT");
            System.out.println("Enter the course to enroll(Press Q to quit): ");
            Scanner ob = new Scanner(System.in);
            String course = ob.nextLine();
            if(!course.equals("Q")){
                courses8 =courses8 +"\n"+course;
                System.out.println("Course enrolled!!");
                tutionfees8 = tutionfees8 + costOfCourse8;
            }
            else{
                break;
            }  
        } while(1 != 0);
    }
    
    public void viewAmount8(){
        System.out.println("Tution fess have to pay: " + tutionfees8 + " "+ " Taka");
        
    }
    
    public void TutionPay8(){
        do{
       try{
	    viewAmount8();
        
        System.out.println("************************************************************");
        System.out.print("Enter the amount you doing pay: ");
        Scanner obb = new Scanner(System.in);
        int input = obb.nextInt();
         uddatetuitionFess8=input;
        tutionfees8= tutionfees8-input;
        System.out.println("===============Thank you for your payment!!!==================");
        System.out.println("Balance: "+ tutionfees8 + " "+" Taka");
        flag = true;
        }
        catch(Exception e){
            System.out.println("======Your are entering wrong input=======");
            System.out.println("===============Try again!!!================");
            
          }
          }while(!flag);
          }
    
    
    
    public int class8TotalFess(){
        return uddatetuitionFess8; 
    }
    
    public void showClass8(){
        System.out.println("*******Basic Information**********");
        super.ShowInfo();
        System.out.println("******Enrolled Courses*******");
        System.out.println("");
        System.out.println(courses8);
        System.out.println("");
        System.out.println("*****************************");
        
    }
    
    
                        //For class 9
    public void addmissionClass9(){
        System.out.println(        "[Class: "+"9"+ "]");
        super.studentAdmission();
    }
    public void enrollCourse9(){
        do{
            System.out.println("============Courses List------ ");
            System.out.println("1.Bangla 1st paper\n 2.Bangla 2nd paper\n 3.English 1st paper\n 4.English 2nd paper\n 5.General math\n 6.Social science\n 7.Science\n 8.Highermath\n 9.Physics\n 10.Chemistry\n 11.Biology");
            System.out.println("Enter the course to enroll(Press Q to quit): ");
            Scanner ob = new Scanner(System.in);
            String course = ob.nextLine();
            if(!course.equals("Q")){
                courses9 =courses9 +"\n"+course;
                System.out.println("Course enrolled!!");
                tutionfees9 = tutionfees9 + costOfCourse9;
            }
            else{
                break;
            }  
        } while(1 != 0);
    }
    
    public void viewAmount9(){
        System.out.println("Tution fess have to pay: " + tutionfees9 + " "+ " Taka");
        
    }
    
    public void TutionPay9(){
        do{
       try{
	    viewAmount9();
        
        System.out.println("*******************************************************");
        System.out.print("Enter the amount you doing pay: ");
        Scanner obb = new Scanner(System.in);
        int input = obb.nextInt();
         uddatetuitionFess9=input;
        tutionfees9= tutionfees9-input;
        System.out.println("===============Thank you for your payment!!!==================");
        System.out.println("Balance: "+ tutionfees9 + " "+" Taka");
        flag = true;
          }
          catch(Exception e){
            System.out.println("======Your are entering wrong input=======");
            System.out.println("===============Try again!!!================");
            
            }
         }while(!flag);
           
    }
    
    
    
    public int class9TotalFess(){
        return uddatetuitionFess9; 
    }
    
    public void showClass9(){
        System.out.println("*******Basic Information**********");
        super.ShowInfo();
        System.out.println("******Enrolled Courses*******");
        System.out.println("");
        System.out.println(courses9);
        System.out.println("");
        System.out.println("*****************************");
        
    }
    
    
                           //For class 10
    
    public void addmissionClass10(){
        System.out.println(        "[Class: "+"10"+ "]");
        super.studentAdmission();
    }
    public void enrollCourse10(){
        do{
            System.out.println("============Courses List------ ");
            System.out.println("1.Bangla 1st paper\n 2.Bangla 2nd paper\n 3.English 1st paper\n 4.English 2nd paper\n 5.General math\n 6.Social science\n 7.Science\n 7.Science\n 8.Highermath\n 9.Physics\n 10.Chemistry\n 11.Biology");
            System.out.println("Enter the course to enroll(Press Q to quit): ");
            Scanner ob = new Scanner(System.in);
            String course = ob.nextLine();
            if(!course.equals("Q")){
                courses10 =courses10 +"\n"+course;
                System.out.println("Course enrolled!!");
                tutionfees10 = tutionfees10 + costOfCourse10;
            }
            else{
                break;
            }  
        } while(1 != 0);
    }
    
    public void viewAmount10(){
        System.out.println("Tution fess have to pay: " + tutionfees10 + " "+ " Taka");
        
    }
    
    public void TutionPay10(){
    do{
   try{
	    viewAmount10();
        
        System.out.println("*******************************************************");
        System.out.print("Enter the amount you doing pay: ");
        Scanner obb = new Scanner(System.in);
        int input = obb.nextInt();
         uddatetuitionFess10=input;
        tutionfees10= tutionfees10-input;
        System.out.println("===============Thank you for your payment!!!==================");
        System.out.println("Balance: "+ tutionfees10 + " "+" Taka");
        flag = true;
      }
   catch(Exception e){
            System.out.println("======Your are entering wrong input=======");
            System.out.println("===============Try again!!!================");
            
   }
   }while(!flag);
           
    }
    
    
    
    public int class10TotalFess(){
        return uddatetuitionFess10; 
    }
    
    public void showClass10(){
        System.out.println("*******Basic Information**********");
        super.ShowInfo();
        System.out.println("******Enrolled Courses*******");
        System.out.println("");
        System.out.println(courses10);
        System.out.println("");
        System.out.println("*****************************");
        
    }
    
  
}






