package AbstracFactory.Factories;

import AbstracFactory.IAutomobileFactory;
import AbstracFactory.Products.Body;
import AbstracFactory.Products.Chassis;
import AbstracFactory.Products.Engine;
import AbstracFactory.Products.Wheels;
import AbstracFactory.Products.Van.VanBody;
import AbstracFactory.Products.Van.VanChassis;
import AbstracFactory.Products.Van.VanEngine;
import AbstracFactory.Products.Van.VanWheels;

public class VanVehiclesFactory implements IAutomobileFactory {
    @Override
    public Body createBody() {
        return new VanBody();
    }

    @Override
    public Chassis createChassis() {
        return new VanChassis();
    }

    @Override
    public Engine createEngine() {
        return new VanEngine();
    }

    @Override
    public Wheels createWheels() {
        return new VanWheels();
    }
}
