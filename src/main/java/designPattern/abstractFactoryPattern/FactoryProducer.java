package designPattern.abstractFactoryPattern;

public class FactoryProducer {

    public static VehicleFactory getFactory(String brand){

        if (brand.equalsIgnoreCase("Toyota"))
        {
            return new ToyotaFactory();
        } else if (brand.equalsIgnoreCase("Honda")) {
            return new HondaFactory();
        }

        return null;
    }

    }