package main.java;
import java.util.Random;
import java.util.ArrayList;

public class passwordGenerator {

    

    public class randomNumber{
        

        // Constructor
        public randomNumber(){
            

        }






    }

    public static void main(String[] args) {
        // generate 3 arrays
       String[] alphabetLowerCase = {"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       String[] alphabetUpperCase = {"A", "B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       String[] digits = {"1","2","3","4","5","6","7","8","9"};
       ArrayList<String> passwordSectionOne = new ArrayList<>();
       ArrayList<String> passwordSectionTwo = new ArrayList<>();
       ArrayList<String> passwordSectionThree = new ArrayList<>();


       // Create an instance of the Random class
       Random random = new Random();
       // Generate a random number between 1 and 26 (inclusive)
       int randomNumber1 = random.nextInt(26) + 1;
       // Generature a random number between 1 and 9 (inclusive)
       int randomNumber2 = random.nextInt(9) +1;
       // Generate random number between 1 and 3 (inclusive)
       int randomNumber3 = random.nextInt(3) +1;

       for (int i = 0; i<19 ; i++){




       }

























        
        
    }
    
}
