package AbstracFactory.Factories;

import AbstracFactory.AutomobileFactory;
import AbstracFactory.Components.Body;
import AbstracFactory.Components.Chassis;
import AbstracFactory.Components.Engine;
import AbstracFactory.Components.Wheels;
import AbstracFactory.Components.body.VanBody;
import AbstracFactory.Components.chassis.VanChassis;
import AbstracFactory.Components.engine.VanEngine;
import AbstracFactory.Components.wheels.VanWheels;

public class VanVehiclesFactory implements AutomobileFactory {
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
