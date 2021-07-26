package interfaces;
import classes.*;
public interface Icoaching {
   void InsertStudent6(ClassInformation s);
   void InsertStudent7(ClassInformation s);
   void InsertStudent8(ClassInformation s);
   void InsertStudent9(ClassInformation s);
   void InsertStudent10(ClassInformation s);
   
   ClassInformation searchStudent6(int search);
   ClassInformation searchStudent7(int search);
   ClassInformation searchStudent8(int search);
   ClassInformation searchStudent9(int search);
   ClassInformation searchStudent10(int search);
   
   void removeStudent6(int search);
   void removeStudent7(int search);
   void removeStudent8(int search);
   void removeStudent9(int search);
   void removeStudent10(int search);
   
   void showClassInfo6();
   void showClassInfo7();
   void showClassInfo8();
   void showClassInfo9();
   void showClassInfo10();
   
   
   void InsertTeacher(Teacher t);
   Teacher SearchTeacher(int search);
   void removeTeacher(int search);
   void showCoachingInfoWithTeacher();
   
   
   
   
   
   
   
   
   
}
