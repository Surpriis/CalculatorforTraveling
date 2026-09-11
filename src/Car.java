public class Car {
    private final int tankCapacity;
    private float fuelInMoment;
    private final float averageConsumption;

    public Car(int tankCapacity, float fuelInMoment, float averageConsumption) {
        this.tankCapacity = tankCapacity;
        this.fuelInMoment = fuelInMoment;
        this.averageConsumption = averageConsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public float getFuelInMoment() {
        return fuelInMoment;
    }

    public void setFuelInMoment(float fuelInMoment) {
        this.fuelInMoment = fuelInMoment;
    }

    public float getAverageConsumption() {
        return averageConsumption;
    }

    public void move(int distance){
        System.out.println("Машина едет . . . .");
        fuelInMoment = getFuelInMoment() - ((float) distance / 100) * getAverageConsumption();
        System.out.println("Машина проехала дистанцию");
    }
    public void addFuel(int amount){
        if (fuelInMoment + amount >= tankCapacity){
            System.out.println("Был заправлен полный бак, сумма за излишки топлива будет снята со счёта");
            fuelInMoment = tankCapacity;
        } else if (fuelInMoment + amount < 0){
            System.out.println("Топливо на 0");
            fuelInMoment = 0;
        } else {
            fuelInMoment = fuelInMoment+amount;
        }
    }

}
