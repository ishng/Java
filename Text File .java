package file_writer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_write {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      String first_name;
      String last_name;
      String MI;

      System.out.print("Enter your First Name: ");
      first_name = input.nextLine();
      System.out.print("Enter your Last Name: ");
      last_name = input.nextLine();
      System.out.print("Enter your Middle Initial: ");
      MI = input.nextLine();

      try 
        {
          FileWriter writer = new FileWriter ("text.txt");
          writer.write("Last Name: " + last_name + "\n");
          writer.write("First Name: " + first_name + "\n");
          writer.write("Middle Initial: " + MI + "\n");
          writer.close();
        }
      catch(IOException e)
        }
            System.out.println("Unable to write");
}
}
      
