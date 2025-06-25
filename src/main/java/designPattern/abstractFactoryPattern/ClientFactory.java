package designPattern.abstractFactoryPattern;

public class ClientFactory {


    public static void main(String[] args) {

        VehicleFactory vehicleFactory=FactoryProducer.getFactory("Toyota");

        Car toyotaCar=vehicleFactory.createCar();
        MotorCycle toyotaMotorCycle= vehicleFactory.createMotorCycle();

        toyotaCar.drive();

        toyotaMotorCycle.ride();


        VehicleFactory vehicleHonda=FactoryProducer.getFactory("Honda");

        Car hondaCar=vehicleHonda.createCar();

        MotorCycle hondaMotorCycle=vehicleHonda.createMotorCycle();

        hondaCar.drive();

        hondaMotorCycle.ride();


    }
}
