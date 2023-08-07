package lessonPO.lesson412.lesson.lesson41;

// Класс, представляющий калькулятор
 class Calculator {
    private Addition adder;
    private Subtraction subtractor;
    private Multiplication multiplier;
    private Division divider;

    public Calculator() {
        adder = new Addition();
        subtractor = new Subtraction();
        multiplier = new Multiplication();
        divider = new Division();
    }

    public double add(double a, double b) {
        return adder.add(a, b);
    }

    public double subtract(double a, double b) {
        return subtractor.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return multiplier.multiply(a, b);
    }

    public double divide(double a, double b) {
        return divider.divide(a, b);
    }
}

// Класс, представляющий сложение
 class Addition {
    public double add(double a, double b) {
        return a + b;
    }
}

// Класс, представляющий вычитание
 class Subtraction {
    public double subtract(double a, double b) {
        return a - b;
    }
}

// Класс, представляющий умножение
class Multiplication {
    public double multiply(double a, double b) {
        return a * b;
    }
}

// Класс, представляющий деление
 class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}
