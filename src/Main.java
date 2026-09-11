//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Car car = new Car(60, 60, 5.7f);
    Scanner scanner = new Scanner(System.in);
    startMoving(scanner, car);
    scanner.close();
}

private static void startMoving(Scanner scanner, Car car) {
    System.out.println("Хочешь ехать?\nДа/Нет");
    String answer = scanner.nextLine();
    if ("да".equalsIgnoreCase(answer)) {
        System.out.println("Сколько нужно проехать");
        int distance = scanner.nextInt();
        if (car.getFuelInMoment() - ((float) distance / 100) * car.getAverageConsumption() > 0) {
            car.move(distance);
            fueling(scanner, car);
        } else {
            System.out.println("Машина не может столько проехать");
            fueling(scanner, car);
        }
    } else if ("нет".equalsIgnoreCase(answer)) {
    } else {
        System.out.println("Unsupportable operation");
        startMoving(scanner, car);
    }
}

private static void fueling(Scanner scanner, Car car) {
    System.out.println("Хотите заправить автомобиль?");
    String answer = scanner.nextLine();
    if ("да".equalsIgnoreCase(answer)) {
        System.out.println("Сколько литров топлива заправить?");
        car.addFuel(scanner.nextInt());
    } else if ("нет".equalsIgnoreCase(answer)) {
    } else {
        System.out.println("Unsupportable operation");
    }
    startMoving(scanner, car);
}
