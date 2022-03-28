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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ForReservation {
    
    public int addReservation(String id , String client_id, String room_no, String date_in, String date_out, String Deposit) {
        int flag=2;
        
          
            try {
                CSVWriter writer = new CSVWriter(new FileWriter("Reservation.csv",true));
            
                List<String[]>reservation_records = new ArrayList<>();
 
            
                String[] record = new String[]{id ,client_id , room_no, date_in, date_out, Deposit};
                reservation_records.add(record);
       
                FileReader filereader = new FileReader("Reservation.csv");
                CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();  
            
                List<String[]>reservation_info = reader.readAll(); 
                
                for(String[] user:reservation_info){
                    
                  if(user[1].toLowerCase().equals(client_id.toLowerCase().trim()))
                  {
                     flag=0;
                     break;
                  }
                 
                  if(user[2].toLowerCase().equals(room_no.toLowerCase().trim()))
                  {
                     flag=1;
                     break;
                  }   
               
                
                  
                }
            
                 if(flag==2){   
                   writer.writeAll(reservation_records);
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
    
    
    
}
