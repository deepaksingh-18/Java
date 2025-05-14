public class SportsBike implements Bike {

    @Override
    public void speed() {
        System.out.println("Sports Bike: 200 kmph");
    }

    @Override
    public void gear() {
        System.out.println("Sports Bike: 6 Gears");
    }
}
