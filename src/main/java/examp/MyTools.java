package examp;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class MyTools {

    public Boolean isCharactersUnique(String str) {
        int n, maxl = 256;
        boolean result;
        boolean[] char_set;

        n = str.length();
        result = true;
        char_set = new boolean[maxl];

        for (int i = 0; i < n; i++) {
            int val = str.charAt( i );
            if (!char_set[val]) {
                char_set[val] = true;
//                System.out.println("Last char is : " + (char)val + val);
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public String reverseOrderInWords(String str) {
        StringBuilder strb = new StringBuilder();
        StringBuilder wdb = new StringBuilder();
        String s = str.trim();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt( i );
            if (ch != (char) 32) {
                strb.append( ch );
            } else {
                wdb.append( strb.reverse() );
                wdb.append( ch );
//                System.out.println( strb );
                strb.setLength( 0 );
            }
        }
        wdb.append( strb.reverse() );
//        System.out.println( strb );
        return wdb.toString();
    }

    public Boolean strArePermutation(String[] args) {

        if (args[0].length() != args[1].length()) {
            return false;
        }

        char[] s1 = _sort_chars( args[0] );
        char[] s2 = _sort_chars( args[1] );

//        System.out.print( "1st.1 = ");
//        _print_char_array(s1);
//        System.out.println();
//        System.out.print( "2nd.1 = ");
//        _print_char_array(s2);
//        System.out.println();
        return (Arrays.equals( s1, s2 ));

    }

    public String basicStrCompression(String str) {

        StringBuilder stb = new StringBuilder();
        char current, prev;
        int i, count;
        prev = str.charAt( 0 );
        current = str.charAt( 0 );
        count = 1;

        for (i = 1; i < str.length(); i++) {
            prev = str.charAt( i - 1 );
            current = str.charAt( i );

            if (current != prev && count == 1) {
                stb.append( prev );
            } else if (current != prev && count > 1) {
                stb.append( prev );
                stb.append( count );
                count = 1;
            } else count++;

        }

        if (current == prev && count > 1) {
            stb.append( current );
            stb.append( count );
        } else {
            stb.append( current );
        }

        return stb.toString();
    }

    public Double clockArrowsAngle(String str){
        Scanner data = new Scanner( str );
//        Pattern pat = Pattern.compile("[0-9]+");
        short h, m, maxH = 12;
        int circle = 360;
        h = data.nextShort();
        m = data.nextShort();
        double angle, c = circle/maxH;
        double a = c*(h + m/60.0); //Hour's arrow angle
        int b = 6*m; //Minutes's arrow angle
        double d = Math.abs(a-b);

        if (d > 180){
            angle = (360-d);
        }
        else {angle = d;}


        return Math.abs( angle );

    }

//    private void _print_char_array(char[] arr) {
//        for (char ch : arr) {
//            System.out.print( ch );
//        }
//    }

    private char[] _sort_chars(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort( ch );
        return ch;
    }

}

