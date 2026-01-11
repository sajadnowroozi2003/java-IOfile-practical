import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

class Main{
    public static void main(String[] args) {
   
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
    }
   
}