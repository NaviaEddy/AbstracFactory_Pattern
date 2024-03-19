package AbstracFactory.Products.Van;

import AbstracFactory.Products.Wheels;

public class VanWheels implements Wheels {
    @Override
    public String getWheelsType() {
        //System.out.println("4x4");
        return "4x4";
    }
}
