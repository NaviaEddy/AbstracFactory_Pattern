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

    //FABRICAS
    IAutomobileFactory SuvFactory = new SuvVehiclesFactory();
    IAutomobileFactory VanFactory = new VanVehiclesFactory();
    IAutomobileFactory TruckFactory = new TruckVehiclesFactory();
    private Scanner sc;
    int opcion;

    public Menu() {
        this.sc = new Scanner(System.in);
    }

    public void choise() {
        do {
            ShowMenu();
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

    private static void ShowMenu() {
        System.out.println("Seleccione el tipo de vehículo que desea fabricar: ");
        System.out.println("1. Camión");
        System.out.println("2. Furgoneta");
        System.out.println("3. Suv");
        System.out.println("4. Salir");
    }

    private void BuildSuv() {
        System.out.println("Fabricando SUV...");
        //FABRICA DE AUTOS SUV
        SuvBody suvbody = (SuvBody) SuvFactory.createBody();
        SuvChassis suvchassis = (SuvChassis) SuvFactory.createChassis();
        SuvEngine suvengine = (SuvEngine) SuvFactory.createEngine();
        SuvWheels suvwheels = (SuvWheels) SuvFactory.createWheels();

        //SUV FINAL
        Fabricado("Carroceria: " + suvbody.getBodyType(),
                "Chasis: " + suvchassis.getChassisType(),
                "Motor: " + suvengine.getEngineType(),
                "Ruedas: " + suvwheels.getWheelsType());
    }

    private static void Fabricado(String suvbody, String suvchassis, String suvengine, String suvwheels) {
        System.out.println(suvbody);
        System.out.println(suvchassis);
        System.out.println(suvengine);
        System.out.println(suvwheels);
    }

    private void BuildVan() {
        System.out.println("Fabricando FURGONETA...");

        //FABRICA DE AUTOS VAN
        VanBody vanbody = (VanBody) VanFactory.createBody();
        VanChassis vanchassis = (VanChassis) VanFactory.createChassis();
        VanEngine vanengine = (VanEngine) VanFactory.createEngine();
        VanWheels vanwheels = (VanWheels) VanFactory.createWheels();

        //VAN FINAL
        Fabricado("Carroceria: "
                + vanbody.getBodyType(),
                "Chasis: " + vanchassis.getChassisType(),
                "Motor: " + vanengine.getEngineType(),
                "Ruedas: " + vanwheels.getWheelsType());
    }

    private void BuildTruck() {
        System.out.println("Fabricando CAMION...");

        //FABRICA DE AUTOS TRUCK
        TruckBody truckbody = (TruckBody) TruckFactory.createBody();
        TruckChassis truckchassis = (TruckChassis) TruckFactory.createChassis();
        TruckEngine truckengine = (TruckEngine) TruckFactory.createEngine();
        TruckWheels truckwheels = (TruckWheels) TruckFactory.createWheels();

        //TRUNK FINAL
        Fabricado("Carroceria: " + truckbody.getBodyType(),
                "Chasis: " + truckchassis.getChassisType(),
                "Motor: " + truckengine.getEngineType(),
                "Ruedas: " + truckwheels.getWheelsType());
    }
    private void mitsubic(){
        System.out.println("mitsubishi");


    }

}
