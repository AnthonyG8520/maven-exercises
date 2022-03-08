import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ExampleClass {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        System.out.println(StringUtils.isNumeric(input));

        System.out.println(StringUtils.swapCase(input));

        System.out.println(StringUtils.reverse(input));


    }
}
