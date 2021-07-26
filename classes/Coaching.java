package classes;
import interfaces.*;
public class Coaching implements Icoaching{
    public String coachingName;
    public String coachingAddress;
    ClassInformation students6[],students7[],students8[],students9[],students10[];
    Teacher teachers[];
    public Coaching(String coachingName,int sizeOfArray,String coachingAddress ){
        this.coachingName= coachingName;
        students6 = new ClassInformation[sizeOfArray];
        students7 = new ClassInformation[sizeOfArray];
        students8 = new ClassInformation[sizeOfArray];
        students9 = new ClassInformation[sizeOfArray];
        students10 = new ClassInformation[sizeOfArray];
        teachers = new Teacher[sizeOfArray];
        this.coachingAddress=coachingAddress;
    }
    
    public void setCoachingName(String coachingName){
        this.coachingName=coachingName;
    }
    public void setCoachingAddress(String coachingAddress ){
        this.coachingAddress=coachingAddress;
    }
    
    public String getCoachingName(){
        return coachingName;    
    }
    public String getCoachingAddress(){
        return coachingAddress;    
    }
    
    public void InsertStudent6(ClassInformation s){
        int flag=0;
        for(int i=0;i<students6.length;i++){
            if(students6[i] == null){
                students6[i]=s;
                System.out.println("------Student admission information-------");
                System.out.println("Student id: "+students6[i].getId());
                System.out.println("-----------");
                flag = 1;
                break;
            }
        }
        if(flag ==1){
            System.out.print("Student admitted");
        }
        else{
           System.out.println("Student not admitted"); 
        }
    }
    
    public void InsertStudent7(ClassInformation s){
        int flag=0;
        for(int i=0;i<students7.length;i++){
            if(students7[i] == null){
                students7[i]=s;
                System.out.println("------Student admission information-------");
                System.out.println("Student id: "+students7[i].getId());
                System.out.println("-----------");
                flag = 1;
                break;
            }
        }
        if(flag ==1){
            System.out.println("Student admitted");
        }
        else{
           System.out.println("Student not admitted"); 
        }
    }
    
    public void InsertStudent8(ClassInformation s){
        int flag=0;
        for(int i=0;i<students8.length;i++){
            if(students8[i] == null){
                students8[i]=s;
                System.out.println("------Student admission information-------");
                System.out.println("Student id: "+students8[i].getId());
                System.out.println("-----------");
                flag = 1;
                break;
            }
        }
        if(flag ==1){
            System.out.println("Student admitted");
        }
        else{
           System.out.println("Student not admitted"); 
        }
    }
    
    public void InsertStudent9(ClassInformation s){
        int flag=0;
        for(int i=0;i<students9.length;i++){
            if(students9[i] == null){
                students9[i]=s;
                System.out.println("------Student admission information-------");
                System.out.println("Student id: "+students9[i].getId());
                System.out.println("-----------");
                flag = 1;
                break;
            }
        }
        if(flag ==1){
            System.out.println("Student admitted");
        }
        else{
           System.out.println("Student not admitted"); 
        }
    }
    
    public void InsertStudent10(ClassInformation s){
        int flag=0;
        for(int i=0;i<students10.length;i++){
            if(students10[i] == null){
                students10[i]=s;
                System.out.println("------Student admission information-------");
                System.out.println("Student id: "+students10[i].getId());
                System.out.println("-----------");
                flag = 1;
                break;
            }
        }
        if(flag ==1){
            System.out.println("Student admitted");
        }
        else{
           System.out.println("Student not admitted"); 
        }
    }
    
    
    public ClassInformation searchStudent6(int search){
        ClassInformation s = null;
        for(int i=0;i<students6.length;i++){
            if(students6[i] != null){
                if(students6[i].getId() == search){
                  s = students6[i];
                  break;
                }
                
            }
        }
        return s;
        
    }
    
    public ClassInformation searchStudent7(int search){
        ClassInformation s = null;
        for(int i=0;i<students7.length;i++){
            if(students7[i] != null){
                if(students7[i].getId() == search){
                  s = students7[i];
                  break;
                }
                
            }
        }
        return s;
        
    }
    
    public ClassInformation searchStudent8(int search){
        ClassInformation s = null;
        for(int i=0;i<students8.length;i++){
            if(students8[i] != null){
                if(students8[i].getId() == search){
                  s = students8[i];
                  break;
                }
                
            }
        }
        return s;
        
    }
    
    public ClassInformation searchStudent9(int search){
        ClassInformation s = null;
        for(int i=0;i<students9.length;i++){
            if(students9[i] != null){
                if(students9[i].getId() == search){
                  s = students9[i];
                  break;
                }
                
            }
        }
        return s;
        
    }
    
    public ClassInformation searchStudent10(int search){
        ClassInformation s = null;
        for(int i=0;i<students10.length;i++){
            if(students10[i] != null){
                if(students10[i].getId() == search){
                  s = students10[i];
                  break;
                }
                
            }
        }
        return s;
        
    }
    
    
    public void removeStudent6(int search){
        for(int i=0;i<students6.length;i++){
            if(students6[i] != null){
                System.out.println(students6[i].getId());
                if(students6[i].getId() == search){
                    students6[i] = null;
                break;
            }
            
        }
        }
        
    }
    
    public void removeStudent7(int search){
        for(int i=0;i<students7.length;i++){
            if(students7[i] != null){
                System.out.println(students7[i].getId());
                if(students7[i].getId() == search){
                    students7[i] = null;
                break;
            }
            
        }
        }
        
    }
    
    public void removeStudent8(int search){
        for(int i=0;i<students8.length;i++){
            if(students8[i] != null){
                System.out.println(students8[i].getId());
                if(students8[i].getId() == search){
                    students8[i] = null;
                break;
            }
            
        }
        }
        
    }
    
    public void removeStudent9(int search){
        for(int i=0;i<students9.length;i++){
            if(students9[i] != null){
                System.out.println(students9[i].getId());
                if(students9[i].getId() == search){
                    students9[i] = null;
                break;
            }
            
        }
        }
        
    }
    
    public void removeStudent10(int search){
        for(int i=0;i<students10.length;i++){
            if(students10[i] != null){
                System.out.println(students10[i].getId());
                if(students10[i].getId() == search){
                    students10[i] = null;
                break;
            }
            
        }
        }
        
    }
    
    public void showClassInfo6(){
        for(int i=0;i<students6.length;i++){
            if(students6[i] != null){
                System.out.println("----Full Information------");
                System.out.println("\t"+"["+(i+1)+"]"+"\t");
                System.out.println("Coaching name: "+ getCoachingName() );
                System.out.println("Address: "+  getCoachingAddress() );
                students6[i].showClass6();
                System.out.println("");
            }
        }
    }
    
    public void showClassInfo7(){
        for(int i=0;i<students7.length;i++){
            if(students7[i] != null){
                System.out.println("----Full Information------");
                System.out.println("\t"+"["+(i+1)+"]"+"\t");
                System.out.println("Coaching name: "+ getCoachingName() );
                System.out.println("Address: "+  getCoachingAddress() );
                students7[i].showClass7();
                System.out.println("");
            }
        }
    }
    
    public void showClassInfo8(){
        for(int i=0;i<students8.length;i++){
            if(students8[i] != null){
                System.out.println("----Full Information------");
                System.out.println("\t"+"["+(i+1)+"]"+"\t");
                System.out.println("Coaching name: "+ getCoachingName() );
                System.out.println("Address: "+  getCoachingAddress() );
                students8[i].showClass8();
                System.out.println("");
            }
        }
    }
    
    public void showClassInfo9(){
        for(int i=0;i<students9.length;i++){
            if(students9[i] != null){
                System.out.println("----Full Information------");
                System.out.println("\t"+"["+(i+1)+"]"+"\t");
                System.out.println("Coaching name: "+ getCoachingName() );
                System.out.println("Address: "+  getCoachingAddress() );
                students9[i].showClass9();
                System.out.println("");
            }
        }
    }
    
    public void showClassInfo10(){
        for(int i=0;i<students10.length;i++){
            if(students10[i] != null){
                System.out.println("----Full Information------");
                System.out.println("\t"+"["+(i+1)+"]"+"\t");
                System.out.println("Coaching name: "+ getCoachingName() );
                System.out.println("Address: "+  getCoachingAddress() );
                students10[i].showClass10();
                System.out.println("");
            }
        }
    }
    
    
    
                                  //Teacher section
    
    public void InsertTeacher(Teacher t){
        int flag = 0;
        for(int i=0;i<teachers.length;i++){
            if(teachers[i]== null){
                teachers[i] = t;
              System.out.println("Teacher ID: "+ teachers[i].getTeacherId());
              flag = 1;
              break; 
            }
        }
        if(flag ==1){
            System.out.println("Teacher admitted");
        }
        else{
           System.out.println("Teacher not admitted"); 
        }
    }
    
    public Teacher SearchTeacher(int search){
        Teacher t = null;
        for(int i=0;i<teachers.length;i++){
            if(teachers[i] != null){
                if(teachers[i].getTeacherId() == search){
                    t = teachers[i];
                    break;
                }
            }
        }
        return t;
    }
    
    /*public void removeTeacher(Teacher t){
        int flag = 0;
        for(int i=0;i<teachers.length;i++){
            if(teachers[i] == t){
               System.out.println("Teacher ID: "+ teachers[i].getTeacherId());
               teachers[i]=null;
               flag =1;
               break;
            }
        }
       if(flag ==1){
            System.out.println("Teacher Removed");
        }
        else{
           System.out.println("Teacher not Removed"); 
        } 
    }*/

    public void removeTeacher(int search){
        for(int i=0;i<teachers.length;i++){
            if(teachers[i] != null){
                System.out.println(teachers[i].getTeacherId());
                if(teachers[i].getTeacherId() == search){
                    teachers[i] = null;
                break;
            }
            
        }
        }
        
    }
    
    
    public void showCoachingInfoWithTeacher(){
        for(int i=0;i<teachers.length;i++){
            if(teachers[i] != null){
                System.out.println("===============Full Information================");
                System.out.println("\t"+"["+(i+1)+"]"+"\t");
                System.out.println("Coaching name: "+ getCoachingName() );
                System.out.println("Address: "+  getCoachingAddress() );
                teachers[i].showTeacherInfo();
                
                System.out.println("");
            }
        }
    }
    
    
    
}
