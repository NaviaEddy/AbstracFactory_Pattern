package AbstracFactory.Factories;

import AbstracFactory.AutomobileFactory;
import AbstracFactory.Components.Body;
import AbstracFactory.Components.Chassis;
import AbstracFactory.Components.Engine;
import AbstracFactory.Components.Wheels;
import AbstracFactory.Components.body.TruckBody;
import AbstracFactory.Components.chassis.TruckChassis;
import AbstracFactory.Components.engine.TruckEngine;
import AbstracFactory.Components.wheels.TruckWheels;

public class TruckVehiclesFactory implements AutomobileFactory {
    @Override
    public Body createBody() {
        return new TruckBody();
    }

    @Override
    public Chassis createChassis() {
        return new TruckChassis();
    }

    @Override
    public Engine createEngine() {
        return new TruckEngine();
    }

    @Override
    public Wheels createWheels() {
        return new TruckWheels();
    }
}
