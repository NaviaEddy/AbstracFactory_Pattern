package AbstracFactory.Components.chassis;

import AbstracFactory.Components.Chassis;

public class TruckChassis implements Chassis {
    @Override
    public String getChassisType() {

        //System.out.println("Bastidor modular");
        return "Bastidor modular";
    }
}
