package AbstracFactory;

import AbstracFactory.Products.Suv.SuvBody;
import AbstracFactory.Products.Truck.TruckBody;
import AbstracFactory.Products.Van.VanBody;
import AbstracFactory.Products.Suv.SuvChassis;
import AbstracFactory.Products.Truck.TruckChassis;
import AbstracFactory.Products.Van.VanChassis;
import AbstracFactory.Products.Suv.SuvEngine;
import AbstracFactory.Products.Truck.TruckEngine;
import AbstracFactory.Products.Van.VanEngine;
import AbstracFactory.Products.Suv.SuvWheels;
import AbstracFactory.Products.Truck.TruckWheels;
import AbstracFactory.Products.Van.VanWheels;
import AbstracFactory.Factories.SuvVehiclesFactory;
import AbstracFactory.Factories.TruckVehiclesFactory;
import AbstracFactory.Factories.VanVehiclesFactory;

import java.util.Scanner;

public class Menu {

    //FABRICA DE AUTOS SUV
    AutomobileFactory SuvFactory = new SuvVehiclesFactory();
    SuvBody suvbody = (SuvBody) SuvFactory.createBody();
    SuvChassis suvchassis = (SuvChassis) SuvFactory.createChassis();
    SuvEngine suvengine = (SuvEngine) SuvFactory.createEngine();
    SuvWheels suvwheels = (SuvWheels) SuvFactory.createWheels();

    //FABRICA DE AUTOS TRUCK
    AutomobileFactory TruckFactory = new TruckVehiclesFactory();
    TruckBody truckbody = (TruckBody) TruckFactory.createBody();
    TruckChassis truckchassis = (TruckChassis) TruckFactory.createChassis();
    TruckEngine truckengine = (TruckEngine) TruckFactory.createEngine();
    TruckWheels truckwheels = (TruckWheels) TruckFactory.createWheels();

    //FABRICA DE AUTOS VAN
    AutomobileFactory VanFactory = new VanVehiclesFactory();
    VanBody vanbody = (VanBody) VanFactory.createBody();
    VanChassis vanchassis = (VanChassis) VanFactory.createChassis();
    VanEngine vanengine = (VanEngine) VanFactory.createEngine();
    VanWheels vanwheels = (VanWheels) VanFactory.createWheels();
    private Scanner sc;
    int opcion;

    public Menu() {
        this.sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        do {
            System.out.println("BIENVENIDO A LA FABRICA ABSTRACTA");
            System.out.println("Seleccion un tipo de coche:");
            System.out.println("1. Camion");
            System.out.println("2. Furgoneta");
            System.out.println("3. Suv");
            System.out.println("4. Salir");

            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    BuildTruck();
                    break;
                case 2:
                    BuildVan();
                    break;
                case 3:
                    BuildSuv();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while(opcion != 4);

    }

    private void BuildSuv() {
        System.out.println("SUV");
        System.out.println("Carroceria: " + suvbody.getBodyType());
        System.out.println("Chasis: " + suvchassis.getChassisType());
        System.out.println("Motor: " + suvengine.getEngineType());
        System.out.println("Ruedas: " + suvwheels.getWheelsType());
    }

    private void BuildVan() {
        System.out.println("FURGONETA");
        System.out.println("Carroceria: " + vanbody.getBodyType());
        System.out.println("Chasis: " + vanchassis.getChassisType());
        System.out.println("Motor: " + vanengine.getEngineType());
        System.out.println("Ruedas: " + vanwheels.getWheelsType());
    }

    private void BuildTruck() {
        System.out.println("CAMION");
        System.out.println("Carroceria: " + truckbody.getBodyType());
        System.out.println("Chasis: " + truckchassis.getChassisType());
        System.out.println("Motor: " + truckengine.getEngineType());
        System.out.println("Ruedas: " + truckwheels.getWheelsType());
    }


}
