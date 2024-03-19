package AbstracFactory.Products.Truck;

import AbstracFactory.Products.Chassis;

public class TruckChassis implements Chassis {
    @Override
    public String getChassisType() {

        //System.out.println("Bastidor modular");
        return "Bastidor modular";
    }
}
