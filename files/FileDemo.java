package files;

import java.lang.*;
import java.io.*;

public class FileDemo {
  public FileWriter writer;
  
  public void writeInFile(String s,String fname){
      try{
        File file = new File(fname);
        file.createNewFile();
        writer = new FileWriter(file,true);
        writer.write(s+"\r"+"\n");
        writer.flush();
        writer.close();
      }
      catch(Exception ioe){
          System.out.println("File is Missing");
      }
  } 
  
}
