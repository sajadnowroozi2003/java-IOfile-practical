import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import javax.annotation.processing.Filer;

class Main{
    public static void main(String[] args) {
        if (args.length==0) {
            System.out.println("No File Exist.");
            return;
        }
      Instant start =  Instant.now(); 
try(Scanner scan = new Scanner(new FileReader(args[0]))){

    while (scan.hasNextLine()) {
          
String line =scan.nextLine();
System.out.println(line);
    }



}catch(IOException e){
    System.out.println(e);
}
  Instant end = Instant.now(); 
  
  Duration duration =  Duration.between(start, end);
  System.out.println(duration.toMillis()+" ms");

    }
}