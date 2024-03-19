package AbstracFactory.Components.body;

import AbstracFactory.Components.Body;

public class SuvBody implements Body {
    @Override
    public String getBodyType() {
        //System.out.println("Monocasco");
        return "Monocasco";
    }
}
