package AbstracFactory.Components.wheels;

import AbstracFactory.Components.Wheels;

public class VanWheels implements Wheels {
    @Override
    public String getWheelsType() {
        //System.out.println("4x4");
        return "4x4";
    }
}
