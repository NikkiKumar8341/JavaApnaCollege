package designPattern.factoryPattern;

public class ClientShape {

    public static void main(String[] args) {
        ShapeInstanceFactory factoryObj=new ShapeInstanceFactory();

       Shape shapeCircle=factoryObj.getShapeInstance("Circle");

        shapeCircle.computeArea();

        Shape shapeSquare=factoryObj.getShapeInstance("Square");

        shapeSquare.computeArea();
    }
}
