package AbstracFactory.Factories;

import AbstracFactory.IAutomobileFactory;
import AbstracFactory.Products.Body;
import AbstracFactory.Products.Chassis;
import AbstracFactory.Products.Engine;
import AbstracFactory.Products.Wheels;
import AbstracFactory.Products.Truck.TruckBody;
import AbstracFactory.Products.Truck.TruckChassis;
import AbstracFactory.Products.Truck.TruckEngine;
import AbstracFactory.Products.Truck.TruckWheels;

public class TruckVehiclesFactory implements IAutomobileFactory {
    @Override
    public Body createBody() {
        return new TruckBody();
    }

    @Override
    public Chassis createChassis() { return new TruckChassis(); }

    @Override
    public Engine createEngine() {
        return new TruckEngine();
    }

    @Override
    public Wheels createWheels() {
        return new TruckWheels();
    }
}
