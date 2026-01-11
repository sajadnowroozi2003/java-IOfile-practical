import java.util.Scanner;
import java.io.*;
import java.time.Duration;
import java.time.Instant;


class Filetest{
    public static void main(String []args){
        System.out.println("Ali");

        if(args.length==0){
            System.out.println("No file yet");
            return;
        }

        Instant start = Instant.now();
        try(BufferedReader reader= new BufferedReader(new FileReader(args[0]))){
            String line;
            while((line=reader.readLine())!=null){
               
                System.out.println(line);
            }

        }catch(Exception e){
           System.out.println(e);
        }
        Instant end = Instant.now();
        Duration duration= Duration.between(start,end);
        System.out.println(duration.toMillis());
       
    }
}