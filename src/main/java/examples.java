import java.util.Scanner;
//import java.io.File;
import java.io.FileNotFoundException;

public class examples {

    public static void main(String args[])
            throws FileNotFoundException{

        // Available methods:
        System.out.println( "1 => isCharactersUnique" );
        System.out.println( "2 => reverseOrderInWords" );
        System.out.println( "3 => stringsArePermutation" );
        System.out.println( "4 => basicStrCompression" );
        System.out.println( "5 => clockArrowsAngle" );




        Scanner keyboard = new Scanner( System.in );
        MyTools myTools = new MyTools();

        System.out.println( "Type index of the method under the test" );

        //  selects method to test
        int m = Integer.parseInt( keyboard.nextLine() );
        switch (m) {
            case 1: {
                System.out.println( "OK, type a string of characters" );
                String test = keyboard.nextLine();
                boolean result = myTools.isCharactersUnique( test );
                System.out.println( "isCharactersUnique : " + result );
                break;

            }

            case 2: {
                System.out.println( "OK, type some of words are split by SPACE " );
                String test = keyboard.nextLine();
                String result = myTools.reverseOrderInWords( test );
                System.out.println( "reversedOrderInWords : " + result );
                break;
            }

            case 3: {
                System.out.println( "OK, type a 1st string" );
                String str1 = keyboard.nextLine();
                System.out.println( "Type a 2nd string" );
                String str2 = keyboard.nextLine();
                String[] arr = {str1, str2};
                boolean result = myTools.strArePermutation( arr );
                System.out.println( "stringsArePermutation : " + result );
                break;
            }

            case 4: {
                System.out.println( "OK, type a string like <abbcccdddd#!>" );
                String str1 = keyboard.nextLine();
                String str2 = myTools.basicStrCompression( str1 );
                System.out.println( "New string: " + str2 );
                break;
            }

            case 5: {
                System.out.println( "OK, How much time is now?" );
                System.out.println( "Type <hh mm> with space between" );
                String set1 = keyboard.nextLine();
                Double value = myTools.clockArrowsAngle( set1 );
                System.out.println( "Angle between arrows (degrees): " + value );
                break;
            }

            default: {
                System.out.println( "Unavailable method" );
                break;
            }

        }


    }

}

