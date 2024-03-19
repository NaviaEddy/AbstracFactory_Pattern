package AbstracFactory.Products.Truck;

import AbstracFactory.Products.Body;

public class TruckBody implements Body {
    @Override
    public String getBodyType() {
        //System.out.println("Cabina doble");
        return "Cabina doble";
    }
}
