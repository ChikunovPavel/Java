package lessonPO.homeWork.hw4;


/**
 * Interface для геометрических фигур
 *
 * имеет методы
 * @double getArea()
 * @double getPerimeter()
 */
 interface Shape {
    // Общие поля и методы для всех геометрических фигур
    double getPerimeter();
    double getArea();
}


/**
 * Класс для круга
 *
 * для коректной работы нужно переопределить методы
 * @double getArea()
 * @double getPerimeter()
 */

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


/**
 * Класс для прямоугольника
 *
 * для коректной работы нужно переопределить методы
 * @double getArea()
 * @double getPerimeter()
 */
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}


/**
 * Класс для треугольника
 *
 * для коректной работы нужно переопределить методы
 * @double getArea()
 * @double getPerimeter()
 */

class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}


/**
 * Главный класс приложения
 * имеет
 *Пример использования конкретных классов геометрических фигур
 */
public class GeometryApp {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
    }
}