class Bird extends Animal implements Flyable {
    Bird(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " chirps");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}