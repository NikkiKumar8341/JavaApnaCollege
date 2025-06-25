package designPattern.factoryPattern;

public class ShapeInstanceFactory {

    public Shape getShapeInstance(String shape){
        if (shape.equals("Circle")){
            return new Circle();
        } else if (shape.equals("Square")) {
            return new Square();
        }

        return null;
    }
}
