package unitTest.GB.lesson;

import java.util.List;

import static org.mockito.Mockito.mock;

public class LESSON2 {
    public static void main(String[] args) {
    List mockedList = mock(List.class);
    mockedList.add("one");

        System.out.println(mockedList.get(0));
        mockedList.clear();


    }
}
