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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ForRooms {
     public int addRoom(String room_no , String room_type, String room_price,String reserved_status) {
        int flag=2;
        try{
            CSVWriter writer = new CSVWriter(new FileWriter("Rooms.csv",true));
            List<String[]> room_records = new ArrayList<>();
 
            
            String[] record = new String[]{room_no ,room_type, room_price,reserved_status};
            room_records.add(record);
       
            FileReader filereader = new FileReader("Rooms.csv");
            CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();  
            
            List<String[]> room_info = reader.readAll();
            for(String[] user:room_info){
                if(user[0].toLowerCase().equals(room_no.toLowerCase())){
                     flag=0;
                     break;
                }
                                    
            }
            
            if(flag==2){   
                writer.writeAll(room_records);
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
