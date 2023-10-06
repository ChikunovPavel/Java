package seminars.second.hw;

import org.junit.jupiter.api.Test;
import unitTest.GB.seminars2.second.hw.Car;
import unitTest.GB.seminars2.second.hw.Motorcycle;
import unitTest.GB.seminars2.second.hw.Vehicle;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
//    - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void testCarIsInstanceOfVehicle() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        Car car = new Car("Dodge", "Ram", 2010);
        // Assert (Проверка утверждения)
        assertTrue(car instanceof Vehicle);
    }


//    Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarIsNumWheels() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        Car car = new Car("Dodge", "Ram", 2010);
        // Assert (Проверка утверждения)
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
//    Проверить, что объект Motorcycle создается с 2-мя колесами.

    @Test
    public void testMotorcycleIsNumWheels() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        Motorcycle motorcycle = new Motorcycle("Dodge", "Урал", 2012);

        // Assert (Проверка утверждения)
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

//    Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarIsTestDrive() {
        // Arrange (Подготовка)
        Car car = new Car("Dodge", "Ram", 2010);
        // Act (Выполнение)
        car.testDrive();
        // Assert (Проверка утверждения)
        assertThat(car.getSpeed()).isEqualTo(60);
    }
//    Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleIsTestDrive() {
        // Arrange (Подготовка)
        Motorcycle motorcycle = new Motorcycle("Dodge", "Урал", 2012);
        // Act (Выполнение)
        motorcycle.testDrive();

        // Assert (Проверка утверждения)
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
//    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarIsPark() {
        // Arrange (Подготовка)
        Car car = new Car("Dodge", "Ram", 2010);
        // Act (Выполнение)
        car.testDrive();
        car.park();
        // Assert (Проверка утверждения)
        assertThat(car.getSpeed()).isEqualTo(0);
    }
//    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcycleIsPark() {
        // Arrange (Подготовка)
        Motorcycle motorcycle = new Motorcycle("Dodge", "Урал", 2012);
        // Act (Выполнение)
        motorcycle.testDrive();
        motorcycle.park();

        // Assert (Проверка утверждения)
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }



}


