package hw6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static unitTest.GB.hw6.ArraysHW.compare;
import static unitTest.GB.hw6.ArraysHW.value;

public class CompareTest {
    //тест работы метода по расчету среднего значения
   @Test
    public void testAverage(){
       int[] array = new int[]{12,231,34,823,7,33,45,32,426,6};

       int average = value(array);

       assertEquals(average,164);
    }

    //тест работы метода по сравнению среднего значения
    @Test
    public void TectCompare(){

        int average = 120;
        int average2 = 130;

        String result = compare(average, average2);

        assertThat(result).isEqualTo("Второй список имеет большее среднее значение");
    }
    //тест работы метода по сравнению среднего значения
    @Test
    public void TectCompare1() {
        int average = 120;
        int average2 = 110;

        String result = compare(average, average2);

        assertThat(result).isEqualTo("Первый список имеет большее среднее значение");
    }
    //тест работы метода по сравнению среднего значения
    @Test
    public void TectCompare2(){
        int average = 120;
        int average2 = 120;

        String result = compare(average, average2);


        assertThat(result).isEqualTo("Средние значения равны");
    }
}









