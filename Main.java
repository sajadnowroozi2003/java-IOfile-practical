import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
//    This part is for Read files
  /*
        if (args.length==0) {
            System.out.println("No file exist.");
            return;
        }
        Instant start = Instant.now();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){

            String line;
            while ((line=reader.readLine())!=null) {
                System.out.println(line);
    
}

        }catch(IOException e){
            System.out.println(e);
        }
 Instant end = Instant.now();

    Duration duration = Duration.between(start, end);

    System.out.println(duration.toMillis()+" ms");

    */
Instant start =Instant.now();
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"))){
       for(int i = 0;i<200;i++){
         writer.write("Hello From AFghanistan  I am Sajad");
        writer.newLine();
        writer.write("Welcom to My Country.");
          writer.newLine();

       }

    } catch (IOException e) {
      System.out.println(e);
    }
    Instant end = Instant.now();
    Duration duration = Duration.between(start, end);
    System.out.println(duration.toMillis()+" ms");


    }
   
}