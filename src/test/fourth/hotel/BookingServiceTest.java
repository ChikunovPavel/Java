package fourth.hotel;

// Код, который проверяет, доступен ли номер.
// В реальной ситуации здесь мы бы сделали запрос к базе данных или другому сервису,
// чтобы проверить доступность комнаты.
// Но для простоты этого примера, давайте просто симулируем это поведение:
// предположим, что комнаты с четными номерами доступны, а с нечетными - нет.

import org.junit.jupiter.api.Test;
import unitTest.GB.seminars.fourth.hotel.BookingService;
import unitTest.GB.seminars.fourth.hotel.HotelService;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class BookingServiceTest {
    @Test
    public void hotelTest(){


    HotelService hotelService = mock(HotelService.class);
    BookingService bookingService = new BookingService(hotelService);

    int room = 10;

    when(hotelService.isRoomAvailable(2)).thenReturn(true);
//    assertEquals(true,hotelService.isRoomAvailable(2));
    assertTrue(hotelService.isRoomAvailable(2));

    verify(hotelService,times(1)).isRoomAvailable(2);


    }









}