package solid.lsp;

public class Rectangle implements Calculete {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public int getArea() {
        return width * height;
    }

}
