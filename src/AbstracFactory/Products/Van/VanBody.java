package AbstracFactory.Products.Van;

import AbstracFactory.Products.Body;

public class VanBody implements Body {
    @Override
    public String getBodyType() {
        //System.out.println("Sedan");
        return "Sedan";
    }
}
