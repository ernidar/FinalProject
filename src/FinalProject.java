import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FinalProject {

    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);

        //Ask user for 10 fruits
        System.out.println("Enter 10 words one by one: ");

        String userInput;
        userInput = " ";
        userInput = scanner.nextLine();



        String stringArray[] = new String[9];
        for (int i=0; i<stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }

        //Sort by original order
        System.out.println("Original Order :" + Arrays.toString(stringArray));


        //Sort by alphabetical order
        Arrays.sort(stringArray);
        System.out.println("Aplhabetical Order :" + Arrays.toString(stringArray));


        //Sort byReversed Alphabetical Order
        Collections.reverse(Arrays.asList(stringArray));
        System.out.println("Reversed Aplhabetical Order :" + Arrays.toString(stringArray));


        //Set all letters to be Uppercase
        Arrays.sort(stringArray);
        System.out.println("Upper case array : " + Arrays.toString(stringArray).toUpperCase()) ;
    }


//    Upper case array:
//    APPLE BANANA CHERRY GRAPES KIWI MELON ORANGE PINEAPPLE STRAWBERRY WATERMELON

}
