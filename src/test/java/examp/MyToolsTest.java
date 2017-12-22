package examp;

import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.Iterator;

import org.junit.Test;


public class MyToolsTest {

    @Test
    public void test_reverceOrderInWords() {
        MyTools myTools = new MyTools();

        String testString = "Hello foo bar";
        String expectedReturn = "olleH oof rab";

        String result =  myTools.reverseOrderInWords(testString);

        assertEquals(expectedReturn, result);
    }

    @Test
    public void test_isCharactersUnique() {
        MyTools myTools = new MyTools();

        String test = "qwert asdfg";
        boolean result1 = myTools.isCharactersUnique( test );
        assertTrue(result1);

        test = "qwert asdfw ";//        boolean expected = false;
        boolean result2 = myTools.isCharactersUnique(test);
        assertFalse(result2);
    }

    @Test
    public void test_basicStrCompression(){
        MyTools myTools = new MyTools();
        String result;
        String test1 = "qwert", return1 = "qwert";
        String test2 = "qqqqq", return2 = "q5";
        String test3 = "abbcccdddd#", return3 = "ab2c3d4#";

        result =  myTools.basicStrCompression(test1);
        assertEquals(return1, result);

        result =  myTools.basicStrCompression(test2);
        assertEquals(return2, result);

        result =  myTools.basicStrCompression(test3);
        assertEquals(return3, result);
    }

    @Test
    public void test_strArePermutation() {
        MyTools myTools = new MyTools();
        boolean result;
        String[] test0 = {"qwert", "trewqy"};
        String[] test1 = {"qwert", "trewq"};
        String[] test2 = {"qwert", "asdfc"};

        result = myTools.strArePermutation( test0 );
        assertFalse( result );

        result = myTools.strArePermutation( test1 );
        assertTrue( result );

        result = myTools.strArePermutation( test2 );
        assertFalse( result );

    }

    @Test
    public  void test_clockArrowsAngle(){
        MyTools myTools = new MyTools();
        double result;
        // Available methods:
        Map<String, String> d = new HashMap<String, String>();

        // Put values in hash map
        d.put("0 30", "165" );
        d.put( "6 45", "67.5");
        d.put( "1 59", "65.5");
        //Store entry (Key/Value)of HashMap in set
        Set ms = d.entrySet();
        //Create iterator on Set

        Iterator mi = ms.iterator();
        if (mi.hasNext()) {
            do {
                Map.Entry mapEntry = (Map.Entry) mi.next();
                // getKey Method of HashMap access a key of map
                String keyValue = (String) mapEntry.getKey();
                //getValue method returns corresponding key's value
                String value = (String) mapEntry.getValue();
                result = myTools.clockArrowsAngle( keyValue );
                System.out.println( "Angle between arrows at " + keyValue + " is " + result + " (deg)" );
                assertEquals( result, Double.parseDouble( value ), 0.1 );
            } while (mi.hasNext());
        }

    }
}