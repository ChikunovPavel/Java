package fourth.weather;


import org.junit.jupiter.api.Test;
import unitTest.GB.seminars.fourth.weather.WeatherReporter;
import unitTest.GB.seminars.fourth.weather.WeatherService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

//        Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
//        обращающийся к внешнему API для получения информации о текущей температуре.
//        Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
//        Создайте мок-объект для WeatherService с использованием Mockito.
class WeatherReporterTest {

    @Test
    public void testWeather(){
        WeatherService weatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);

        String report = weatherReporter.generateReport();

        when(weatherService.getCurrentTemperature()).thenReturn(15);
//        act
        assertEquals(15,weatherService.getCurrentTemperature());
        verify(weatherService,times(1)).getCurrentTemperature();

    }



}