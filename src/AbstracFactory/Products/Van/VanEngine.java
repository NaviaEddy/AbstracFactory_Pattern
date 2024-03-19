package AbstracFactory.Products.Van;

import AbstracFactory.Products.Engine;

public class VanEngine implements Engine {
    @Override
    public String getEngineType() {
        //System.out.println("Gasolina EcoBoost");
        return "Gasolina EcoBoost";
    }
}
