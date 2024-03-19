package AbstracFactory;

import AbstracFactory.Components.Body;
import AbstracFactory.Components.Chassis;
import AbstracFactory.Components.Engine;
import AbstracFactory.Components.Wheels;

public interface AutomobileFactory {
    Body createBody();
    Chassis createChassis();
    Engine createEngine();
    Wheels createWheels();
}
