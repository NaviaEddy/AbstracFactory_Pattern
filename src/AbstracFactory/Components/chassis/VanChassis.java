package AbstracFactory.Components.chassis;

import AbstracFactory.Components.Chassis;

public class VanChassis implements Chassis {
    @Override
    public String getChassisType() {
        //System.out.println("Monocasco");
        return "Monocasco";
    }
}
