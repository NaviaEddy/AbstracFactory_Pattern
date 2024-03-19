package AbstracFactory.Products.Suv;

import AbstracFactory.Products.Chassis;

public class SuvChassis implements Chassis {
    @Override
    public String getChassisType() {

        //System.out.println("Bastidor autoportante");
        return "Bastidor autoportante";
    }
}
