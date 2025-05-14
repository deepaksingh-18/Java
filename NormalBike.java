public class NormalBike implements Bike{

    @Override
    public void speed() {
        System.out.println("Normal Bike: 100 kmph");
    }

    @Override
    public void gear() {
        System.out.println("Normal Bike: 5 Gear");
    }
}
