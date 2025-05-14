public class Driver {

    public static void main(String[] args) {

       /* Bike bike1 = new NormalBike();
        bike1.speed();

        NormalBike normalBike = new NormalBike();
        normalBike.speed();

        Bike bike2 = new SportsBike();
        System.out.println(bike2.hashCode());
        bike2.speed();

        System.out.println(bike1.hashCode());
        System.out.println(bike1.getClass()); */

       /* Bird bird = new Bird("Parrot");
        bird.fly();
        bird.sound();
        bird.sleep(); */

//        Engine dieselEngine = new DieselEngine();  // Dependency
//        Car car = new Car(dieselEngine);           // Injected via constructor

        Engine petrolEngine = new PetrolEngine();
        Tyre compayTyre = new CompanyTyres();
        Car car1 = new Car(petrolEngine,compayTyre);
        car1.drive();


//        car1.drive();
//        car.drive();




    }

}
