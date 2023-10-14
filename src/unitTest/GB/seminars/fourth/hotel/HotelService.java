package unitTest.GB.seminars.fourth.hotel;


public class HotelService {
    public boolean isRoomAvailable(int roomId) {

        return roomId % 2 == 0;
    }
}
