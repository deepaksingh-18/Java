class Car {
    private final Engine engine;
    private final Tyre tyre;
    // 👇 Constructor Injection
    public Car(Engine engine, Tyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public void drive() {
        engine.start();
        tyre.tyres();
        System.out.println("Car is running.");
    }
}