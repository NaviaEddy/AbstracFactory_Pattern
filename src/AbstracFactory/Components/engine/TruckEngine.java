package AbstracFactory.Components.engine;

import AbstracFactory.Components.Engine;

public class TruckEngine implements Engine {
    @Override
    public String getEngineType() {
        //System.out.println("Diesel Power Stroke");
        return "Diesel Power Stroke";
    }
}
