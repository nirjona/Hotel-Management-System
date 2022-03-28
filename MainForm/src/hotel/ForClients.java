/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



 
/**
 *
 * @author User
 */
public class ForClients {

    /*static int removeclient(String filepath, String id) throws FileNotFoundException,IOException {
        //throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
     String tempfile="temp.csv";
       //FileReader filereader = new FileReader("Clients.csv");
            //CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build(); 
             //FileReader filereader2 = new FileReader("temp.csv");
            //CSVReader reader2 = new CSVReaderBuilder(filereader2).withSkipLines(1).build();
            File oldfile=new File(filepath);
            File newfile=new File(tempfile);
            int flag1=1;
            
            String ID="";
            String fname="",lname="",phone="",email="",gender="",country="",room="";
            try{
                 //CSVWriter writer = new CSVWriter(new FileWriter("temp.csv",true));
                 FileWriter fw=new FileWriter(tempfile,true);
                 BufferedWriter bw=new BufferedWriter(fw);
                 PrintWriter pw=new PrintWriter(bw);
                 x=new Scanner(new FileReader(filepath));
                 x.delimiter();
                 
                 while(x.hasNext())
                 {
                    ID=x.next();
                     fname=x.next();
                      lname=x.next();
                       phone=x.next();
                        email=x.next();
                         gender=x.next();
                          country=x.next();
                           room=x.next();
                       if(!ID.equals(id))
                       {
                           pw.println(ID+","+fname+","+lname+","+phone+","+email+","+gender+","+country+","+room);
                           
                       }  
                   else if(flag1==1)
                 {
                  x.close();
                 pw.flush();
                 pw.close();
                 oldfile.delete();
                 }
              }
                
                 
            }
            catch(Exception e)
            {
           e.printStackTrace();
        
            }
        return flag1;

    }  */
    
    public int addClient(String client_id , String First_name, String Last_name, String Mobile,String Gender, String Email, String Country,String Room_no) {
        int flag=2;
        try{
            CSVWriter writer = new CSVWriter(new FileWriter("Clients.csv",true));
            List<String[]> client_records = new ArrayList<>();
 
            
            String []record = new String[]{client_id ,First_name,Last_name,Mobile,Gender,Email,Country,Room_no};
            client_records.add(record);      
       
            FileReader filereader = new FileReader("Clients.csv");
            CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();  
            
            List<String[]> Client_info = reader.readAll();
            for(String[] user:Client_info){
                if(user[0].toLowerCase().equals(client_id.toLowerCase().trim())){
                     flag=0;
                     break;
                }
                if(user[4].toLowerCase().equals(Email)){
                     flag=1;
                     break;
                }                     
            }
            
            if(flag==2){   
                writer.writeAll(client_records);
                writer.flush();
                writer.close();
            }
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(CsvException e){
            e.printStackTrace();
        }
        return flag;
    }
    
    
   // public static Scanner x;

    /**
     *
     * @param // 
     * @param// 
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
   
        
    
}

