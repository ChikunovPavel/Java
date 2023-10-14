package fourth.card;

import org.junit.jupiter.api.Test;
import unitTest.GB.seminars.fourth.card.CreditCard;
import unitTest.GB.seminars.fourth.card.PaymentForm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */
    @Test
    public void TestCard(){
        CreditCard creditCard = mock(CreditCard.class);
        PaymentForm paymentForm = new PaymentForm(creditCard);
        double amount = 100;

        paymentForm.pay(amount);
        when(creditCard.getCardHolder()).thenReturn("Holder");


        verify(creditCard,times(1)).charge(amount);
        assertEquals("Holder",creditCard.getCardHolder());

    }





}