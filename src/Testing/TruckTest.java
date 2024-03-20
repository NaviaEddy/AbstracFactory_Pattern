package Testing;
import AbstracFactory.Factories.TruckVehiclesFactory;
import AbstracFactory.Factories.VanVehiclesFactory;
import AbstracFactory.IAutomobileFactory;
import AbstracFactory.Products.Body;
import AbstracFactory.Products.Chassis;
import AbstracFactory.Products.Engine;
import AbstracFactory.Products.Wheels;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {
    @Test
   public void TestVan() {
       IAutomobileFactory vanFactory = new VanVehiclesFactory();
         Wheels wheels = vanFactory.createWheels();
            Engine engine = vanFactory.createEngine();
            Body body = vanFactory.createBody();
            Chassis chassis = vanFactory.createChassis();
            assertEquals("4x4", wheels.getWheelsType());
            assertEquals("Gasolina EcoBoost", engine.getEngineType());
            assertEquals("Sedan", body.getBodyType());
            assertEquals("Monocasco", chassis.getChassisType());
   }
@Test
   public void testTruck() {
         IAutomobileFactory truckFactory = new TruckVehiclesFactory();
         Wheels wheels = truckFactory.createWheels();
         Engine engine = truckFactory.createEngine();
         Body body = truckFactory.createBody();
         Chassis chassis = truckFactory.createChassis();
        assertEquals("6x4", wheels.getWheelsType());
          assertEquals("Diesel Power Stroke", engine.getEngineType());
          assertEquals("Cabina doble", body.getBodyType());
          assertEquals("Bastidor modular", chassis.getChassisType());
   }

}
