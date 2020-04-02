package polymorphism;

public class MainForShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {new Circle(), new Triangle()};

        for (int i =0; i<shapes.length; i++) {
            shapes[i].draw();
        }
    }
}
