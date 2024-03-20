package AbstracFactory.Factories;

import AbstracFactory.IAutomobileFactory;
import AbstracFactory.Products.Body;
import AbstracFactory.Products.Chassis;
import AbstracFactory.Products.Engine;
import AbstracFactory.Products.Wheels;
import AbstracFactory.Products.Suv.SuvBody;
import AbstracFactory.Products.Suv.SuvChassis;
import AbstracFactory.Products.Suv.SuvEngine;
import AbstracFactory.Products.Suv.SuvWheels;

public class SuvVehiclesFactory implements IAutomobileFactory {
    @Override
    public Body createBody() {
        return new SuvBody();
    }

    @Override
    public Chassis createChassis() {
        return new SuvChassis();
    }

    @Override
    public Engine createEngine() {
        return new SuvEngine();
    }

    @Override
    public Wheels createWheels() {
        return new SuvWheels();
    }
}
