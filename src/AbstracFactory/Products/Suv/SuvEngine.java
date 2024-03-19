package AbstracFactory.Products.Suv;

import AbstracFactory.Products.Engine;

public class SuvEngine implements Engine {
    @Override
    public String getEngineType() {
        //System.out.println("Gasolina con turbo");
        return "Gasolina con turbo";
    }
}
