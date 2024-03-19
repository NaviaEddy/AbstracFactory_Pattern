package AbstracFactory.Factories;

import AbstracFactory.AutomobileFactory;
import AbstracFactory.Components.Body;
import AbstracFactory.Components.Chassis;
import AbstracFactory.Components.Engine;
import AbstracFactory.Components.Wheels;
import AbstracFactory.Components.body.SuvBody;
import AbstracFactory.Components.chassis.SuvChassis;
import AbstracFactory.Components.engine.SuvEngine;
import AbstracFactory.Components.wheels.SuvWheels;

public class SuvVehiclesFactory implements AutomobileFactory {
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
