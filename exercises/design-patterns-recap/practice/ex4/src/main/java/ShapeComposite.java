import java.util.ArrayList;
import java.util.List;

public class ShapeComposite extends Shape {

    private List<Shape> shapes;

    public ShapeComposite(){
        shapes = new ArrayList<>();
    }

    public void add(Shape s){
        shapes.add(s);
    }

    @Override
    public void color(String color) {
        for(Shape s: this.shapes) {
            s.color(color);
        }
    }
}
