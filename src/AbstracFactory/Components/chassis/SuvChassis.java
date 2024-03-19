package AbstracFactory.Components.chassis;

import AbstracFactory.Components.Chassis;

public class SuvChassis implements Chassis {
    @Override
    public String getChassisType() {

        //System.out.println("Bastidor autoportante");
        return "Bastidor autoportante";
    }
}
