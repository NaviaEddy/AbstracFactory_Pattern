package AbstracFactory.Components.body;

import AbstracFactory.Components.Body;

public class VanBody implements Body {
    @Override
    public String getBodyType() {
        //System.out.println("Sedan");
        return "Sedan";
    }
}
