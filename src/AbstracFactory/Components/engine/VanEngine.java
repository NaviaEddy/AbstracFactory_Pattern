package AbstracFactory.Components.engine;

import AbstracFactory.Components.Engine;

public class VanEngine implements Engine {
    @Override
    public String getEngineType() {
        //System.out.println("Gasolina EcoBoost");
        return "Gasolina EcoBoost";
    }
}
