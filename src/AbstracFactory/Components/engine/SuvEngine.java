package AbstracFactory.Components.engine;

import AbstracFactory.Components.Engine;

public class SuvEngine implements Engine {
    @Override
    public String getEngineType() {
        //System.out.println("Gasolina con turbo");
        return "Gasolina con turbo";
    }
}
