package solid.lsp;

public class Square implements Calculete {
    protected int width;

    protected Square (int width){
        this.width = width;
    }

    @Override
    public int getArea() {
        return width * 4;
    }
}



