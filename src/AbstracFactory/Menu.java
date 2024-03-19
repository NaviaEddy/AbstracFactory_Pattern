package AbstracFactory;

import AbstracFactory.Components.body.SuvBody;
import AbstracFactory.Components.body.TruckBody;
import AbstracFactory.Components.body.VanBody;
import AbstracFactory.Components.chassis.SuvChassis;
import AbstracFactory.Components.chassis.TruckChassis;
import AbstracFactory.Components.chassis.VanChassis;
import AbstracFactory.Components.engine.SuvEngine;
import AbstracFactory.Components.engine.TruckEngine;
import AbstracFactory.Components.engine.VanEngine;
import AbstracFactory.Components.wheels.SuvWheels;
import AbstracFactory.Components.wheels.TruckWheels;
import AbstracFactory.Components.wheels.VanWheels;
import AbstracFactory.Factories.SuvVehiclesFactory;
import AbstracFactory.Factories.TruckVehiclesFactory;
import AbstracFactory.Factories.VanVehiclesFactory;

import java.util.Scanner;

public class Menu {

    AutomobileFactory SuvFactory = new SuvVehiclesFactory();
    AutomobileFactory TruckFactory = new TruckVehiclesFactory();
    AutomobileFactory VanFactory = new VanVehiclesFactory();
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
        SuvBody suvbody = (SuvBody) SuvFactory.createBody();
        SuvChassis suvchassis = (SuvChassis) SuvFactory.createChassis();
        SuvEngine suvengine = (SuvEngine) SuvFactory.createEngine();
        SuvWheels suvwheels = (SuvWheels) SuvFactory.createWheels();
        System.out.println("Carroceria: " + suvbody.getBodyType());
        System.out.println("Chasis: " + suvchassis.getChassisType());
        System.out.println("Motor: " + suvengine.getEngineType());
        System.out.println("Ruedas: " + suvwheels.getWheelsType());
    }

    private void BuildVan() {
        System.out.println("FURGONETA");
        VanBody vanbody = (VanBody) VanFactory.createBody();
        VanChassis vanchassis = (VanChassis) VanFactory.createChassis();
        VanEngine vanengine = (VanEngine) VanFactory.createEngine();
        VanWheels vanwheels = (VanWheels) VanFactory.createWheels();
        System.out.println("Carroceria: " + vanbody.getBodyType());
        System.out.println("Chasis: " + vanchassis.getChassisType());
        System.out.println("Motor: " + vanengine.getEngineType());
        System.out.println("Ruedas: " + vanwheels.getWheelsType());
    }

    private void BuildTruck() {
        System.out.println("CAMION");
        TruckBody truckbody = (TruckBody) TruckFactory.createBody();
        TruckChassis truckchassis = (TruckChassis) TruckFactory.createChassis();
        TruckEngine truckengine = (TruckEngine) TruckFactory.createEngine();
        TruckWheels truckwheels = (TruckWheels) TruckFactory.createWheels();
        System.out.println("Carroceria: " + truckbody.getBodyType());
        System.out.println("Chasis: " + truckchassis.getChassisType());
        System.out.println("Motor: " + truckengine.getEngineType());
        System.out.println("Ruedas: " + truckwheels.getWheelsType());
    }


}
