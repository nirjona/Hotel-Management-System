/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author User
 */

        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ForError {

    public int File_csv(String username ,String password){
        int flag=0;
        try{
           FileReader filereader = new FileReader("users.csv");
           CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();       
           List<String[]> Users = reader.readAll();
           for(String[] user:Users){
                if(user[0].toLowerCase().equals(username.toLowerCase().trim()) && user[5].equals(password.trim())){
                    flag=1;                  
                    break;
                }
            }
        }
        catch(IOException e){
            e.printStackTrace(); 
        }
        catch(CsvException e){
            e.printStackTrace();
        }
        if(flag==1) 
            return 1;
        else
            return 0;
        
      
    }
    
}

    

