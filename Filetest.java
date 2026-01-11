import java.util.Scanner;
import java.io.File;
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
        try(Scanner scan= new Scanner(new File(args[0]))){
            
            while(scan.hasNextLine()){
                String line= scan.nextLine();
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