package fourth.book;


// У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
// Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.


import org.junit.jupiter.api.Test;
import unitTest.GB.seminars.fourth.book.Book;
import unitTest.GB.seminars.fourth.book.BookRepository;
import unitTest.GB.seminars.fourth.book.BookService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Test
    public void BookTest(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        Book book = new Book("1","Title","Pushkin");

        when(bookRepository.findById("1")).thenReturn(book);
        Book result = bookService.findBookById("1");

        assertEquals(book,result);

        verify(bookRepository,times(1)).findById("1");






    }

}