import java.util.Arrays;

class MyTools {

    Boolean isCharactersUnique(String str) {
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

    String reverseOrderInWords(String str) {
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

    Boolean strArePermutation(String[] args) {

        if (args[0].length() != args[1].length()) {
            return false;
        }
//        System.out.println( "1st.0 = "+ args[0] );
//        System.out.println( "2nd.0 = "+ args[1] );

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

    String basicStrCompression(String str) {

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

//    Double clockArrowsAngle(String str){
////        short h, m;
////        h = arg[0];
////        m = arg[1];
//        double result = str.split( str )
//
//        return 360.0/h;
//
//    }

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

