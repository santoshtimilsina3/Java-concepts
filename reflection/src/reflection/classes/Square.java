package reflection.classes;

public class Square implements Drawable {
    private String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public int noOfConners() {
        return 4;
    }
}
