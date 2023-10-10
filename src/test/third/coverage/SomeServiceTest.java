package third.coverage;

import org.junit.jupiter.api.Test;
import unitTest.GB.seminars.third.coverage.SomeService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeServiceTest {
    // 3.1.
    @Test
    void multipleThreeNotFiveReturnsFizz() {
        // assertEquals...
        SomeService service = new SomeService();
        assertEquals(service.fizzBuzz(12), "Fizz");
    }

    @Test
    void multipleThreeNotReturnsFizz() {
        SomeService service = new SomeService();
        assertEquals(service.fizzBuzz(10), "Buzz");
    }

    @Test
    void multipleThreeFiveReturnsFizz() {
        SomeService service = new SomeService();
        assertEquals(service.fizzBuzz(15), "FizzBuzz");
    }
    @Test
    void multipleThreeFiveReturns() {
        SomeService service = new SomeService();
        assertEquals(service.fizzBuzz(2), "2");
    }


}
