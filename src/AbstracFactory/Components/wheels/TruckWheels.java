package AbstracFactory.Components.wheels;

import AbstracFactory.Components.Wheels;

public class TruckWheels implements Wheels {
    @Override
    public String getWheelsType() {
        //System.out.println("6x4");
        return "6x4";
    }
}
