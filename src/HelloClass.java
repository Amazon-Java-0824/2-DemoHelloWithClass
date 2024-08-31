public class HelloClass {


    public static void main(String[] args) {


        Car car1 = new Car("Kia Stonic", 2022);


        System.out.println("I've rented a " + car1.getModel() + " that was produced in year "  + car1.getYearOfProduction());

        Car car2 = new Car();
        car2.setModel("Fiat Panda");
        car2.setYearOfProduction(2020);
        System.out.println("I've rented a " + car2.getModel() + " that was produced in year "  + car2.getYearOfProduction());

//
        car1.turnOnRadio();


        Rocket rocket = new Rocket("Mars");
        rocket.travelToSpace();
        rocket.travelToSpace("Jupiter");
        rocket.travelToSpace("Pluto", "to look for some ice for my Matcha");


        System.out.println(car1.toString());


//        inheritance
//        polymorphism

    }
}
