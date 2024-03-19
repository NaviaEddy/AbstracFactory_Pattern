package AbstracFactory.Products.Van;

import AbstracFactory.Products.Chassis;

public class VanChassis implements Chassis {
    @Override
    public String getChassisType() {
        //System.out.println("Monocasco");
        return "Monocasco";
    }
}
