package Shiritori;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class ShiritoriTest {

    @Test
    public void testShiritoriSuccess(){
        Shiritori shiritori = new Shiritori();
        String[] testArr = {"dog","goose","elephant","tiger","rhino","orc","cat"};
        String[] extpected = testArr;
        String[] actual = shiritori.shiritoriArray(testArr);
        assertArrayEquals(extpected,actual);
    }

    @Test
    public void testShiritoriFail1(){
        Shiritori shiritori = new Shiritori();
        String[] testArr = {"dog","goose","tiger","cat", "elephant","rhino","orc"};
        String[] extpected = {"dog","goose"};
        String[] actual = shiritori.shiritoriArray(testArr);
        assertArrayEquals(extpected,actual);
    }

    @Test
    public void testShiritoriFail2(){
        Shiritori shiritori = new Shiritori();
        String[] testArr = {"ab","bc","","cd"};
        String[] extpected = {"ab","bc"};
        String[] actual = shiritori.shiritoriArray(testArr);
        assertArrayEquals(extpected,actual);
    }

    @Test
    public void testShiritoriFail3(){
        Shiritori shiritori = new Shiritori();
        String[] testArr = {"","bc","","cd"};
        String[] extpected = {};
        String[] actual = shiritori.shiritoriArray(testArr);
        assertArrayEquals(extpected,actual);
    }

}
