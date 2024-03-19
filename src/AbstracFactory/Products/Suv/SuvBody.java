package AbstracFactory.Products.Suv;

import AbstracFactory.Products.Body;

public class SuvBody implements Body {
    @Override
    public String getBodyType() {
        //System.out.println("Monocasco");
        return "Monocasco";
    }
}
