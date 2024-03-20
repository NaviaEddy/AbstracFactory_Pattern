package AbstracFactory;

import AbstracFactory.Products.Body;
import AbstracFactory.Products.Chassis;
import AbstracFactory.Products.Engine;
import AbstracFactory.Products.Wheels;

public interface IAutomobileFactory {
    Body createBody();
    Chassis createChassis();
    Engine createEngine();
    Wheels createWheels();
}
