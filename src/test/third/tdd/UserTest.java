package third.tdd;

import org.junit.jupiter.api.Test;
import unitTest.GB.seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void numberTest(){
        MainHW mainHW = new MainHW();
        assertEquals(mainHW.evenOddNumber(6),true);
    }
    @Test
    void numberTest1(){
        MainHW mainHW = new MainHW();
        assertEquals(mainHW.evenOddNumber(7),false);
    }
    @Test
    void numberInIntervalTest(){
        MainHW mainHW = new MainHW();
        assertEquals(mainHW.evenOddNumber(100),true);
    }
    @Test
    void numberInIntervalTest1(){
        MainHW mainHW = new MainHW();
        assertEquals(mainHW.evenOddNumber(7),false);
    }




}