package examp;

import static org.junit.Assert.*;

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
        String[] test1 = {"qwert", "trewq"};
        String[] test2 = {"qwert", "asdfc"};

        result = myTools.strArePermutation( test1 );
        assertTrue( result );

        result = myTools.strArePermutation( test2 );
        assertFalse( result );

    }

    @Test
    public  void test_clockArrowsAngle(){
        MyTools myTools = new MyTools();
        double result, ShouldBe;
        String str_1 = "0 30";
        ShouldBe = 165;
        result = myTools.clockArrowsAngle(str_1);
        assertEquals(result, ShouldBe,0.1);
        System.out.println( "Angle between arrows at 0:30 is " + result + " (deg)" );
        String str_2 = "6 45";
        ShouldBe = 67.5;
        result = myTools.clockArrowsAngle(str_2);
        System.out.println( "Angle between arrows at 6:45 is " + result + " (deg)" );
        assertEquals(result, ShouldBe,0.1);
    }
}