package designPattern.abstractFactoryPattern;

public class HondaFactory implements VehicleFactory{

    @Override
    public Car createCar() {
        return new HondaCar();

    }

    @Override
    public MotorCycle createMotorCycle() {
        return new HondaMotorCycle();
    }
}
