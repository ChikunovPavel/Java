import org.junit.jupiter.api.Test;
import unitTest.GB.seminar1.seminars.first.model.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
        @Test
        void evaluatesExpression(){
            Calculator calculator = new Calculator();
            assertThat(Calculator.calculation(4, 4, '+')).isEqualTo(8);
        }
        @Test
        void subsctractionExpression(){
            Calculator calculator = new Calculator();
            assertThat(Calculator.calculation(2, 1, '-')).isEqualTo(1);
        }

        @Test
        void multiplicationExpression(){
            Calculator calculator = new Calculator();
            assertThat(Calculator.calculation(2, 4, '*')).isEqualTo(8);
        }

        @Test
        void divisionExpression(){
            Calculator calculator = new Calculator();
            assertThat(Calculator.calculation(8, 2, '/')).isEqualTo(4);
        }

        @Test
        void expectedIllegalStateExceptionOnInvalidOperetorSymbol(){
            Calculator calculator = new Calculator();
            assertThatThrownBy(() -> calculator.calculation(8, 4, '_')
            ).isInstanceOf(IllegalStateException.class);
    }


}
//    public static void main(String[] args) {
//        // Проверка базового функционала с целыми числами:
//        if (8 != Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (0 != Calculator.calculation(2, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (14 != Calculator.calculation(2, 7, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (2 != Calculator.calculation(100, 50, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        // Случаи с неправильными аргументами
//        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
//        try {
//            Calculator.calculation(8, 4, '_');
//        } catch (IllegalStateException e) {
//            if (!e.getMessage().equals("Unexpected value operator: _")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений:
//        assert 8 == Calculator.calculation(2, 6, '+');
//        assert 0 == Calculator.calculation(2, 2, '-');
//        assert 14 == Calculator.calculation(2, 7, '*');
//        assert 2 == Calculator.calculation(100, 50, '/');
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
//
//        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() ->
//                Calculator.calculation(8, 4, '_')
//        ).isInstanceOf(IllegalStateException.class);
////                                                HW
////////////////////////////////////////////////////////////////////////////////
//        //Проверка в расчете итоговой суммы покупки
//
//        assertThat(Calculator.calculatingDiscount(13000,2000)).isEqualTo(11000);
//        assertThat(Calculator.calculatingDiscount(5000.5,2000)).isEqualTo(3000.5);
//
////        System.out.println(Calculator.calculatingDiscount(5000.5,2000));
////        System.out.println(Calculator.calculatingDiscount(5000.5,-2000));
//        System.out.println(Calculator.calculatingDiscount(0,-2000));
///////////////////////////////////////////////////////////////////////////////
////        System.out.println(Calculator.calculatingDiscount(15000.20,3000));
////        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
////        System.out.println(Calculator.squareRootExtraction(169));
//    }










