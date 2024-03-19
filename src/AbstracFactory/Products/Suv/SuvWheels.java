package AbstracFactory.Products.Suv;

import AbstracFactory.Products.Wheels;

public class SuvWheels implements Wheels {
    @Override
    public String getWheelsType() {
        //System.out.println("4x4");
        return "4x4";
    }
}
