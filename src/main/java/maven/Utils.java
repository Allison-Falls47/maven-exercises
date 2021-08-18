package maven;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = input.nextLine();
        System.out.printf("You entered a %s\nA", userInput);
        String isWordANumber;
        if (StringUtils.isNumeric(userInput)) {
            isWordANumber = " is a number";
        }else{
            isWordANumber = " is not a number";
        }
        System.out.printf("\"%s\"%s\n",userInput, isWordANumber);
        System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(userInput));
    }
}
