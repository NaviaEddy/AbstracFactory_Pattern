package AbstracFactory.Components.body;

import AbstracFactory.Components.Body;

public class TruckBody implements Body {
    @Override
    public String getBodyType() {
        //System.out.println("Cabina doble");
        return "Cabina doble";
    }
}
