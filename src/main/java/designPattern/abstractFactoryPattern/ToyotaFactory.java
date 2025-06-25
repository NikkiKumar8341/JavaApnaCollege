package designPattern.abstractFactoryPattern;

public class ToyotaFactory implements VehicleFactory{

    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public MotorCycle createMotorCycle() {
        return new ToyotoMotorCycle();
    }
}
