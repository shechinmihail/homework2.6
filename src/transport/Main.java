package transport;

public class Main {

    public static void main(String[] args) {

        Car lada = new Car("Lada", "Grande", 1.7, BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0, BodyType.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0, BodyType.COUP);
        Car hyundai = new Car("Hyundai", "i30 4x4", 2.0, BodyType.HATCHBACK);

        СarАreight zil = new СarАreight("Зил", "131", 6.0, LoadType.N2);
        СarАreight kamaz = new СarАreight("Камаз", "4326", 13.0, LoadType.N2);
        СarАreight tatra = new СarАreight("Tatra", "Phoenix", 12.5, LoadType.N3);
        СarАreight iveco = new СarАreight("IVECO", "Powerstar", 12.0, LoadType.N2);

        Bus liaz = new Bus("Лиаз", "Т-1000", 2.4, CapacityType.SMALL);
        Bus solaris = new Bus("Соларис", "Super 300", 2.7, CapacityType.MEDIUM);
        Bus maz = new Bus("Маз", "GP 3", 4.0, CapacityType.SMALL);
        Bus mercedes = new Bus("Mercedes-Benz", "Super 500", 3.5, CapacityType.BIG);

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(hyundai);
        printInfo(zil);
        printInfo(kamaz);
        printInfo(tatra);
        printInfo(iveco);
        printInfo(liaz);
        printInfo(solaris);
        printInfo(maz);
        printInfo(mercedes);

        Driver<Car> ivan = new Driver<>("Петров Иван Васильевич", "В", 15, bmw);
        ivan.drive(bmw);
        Driver<Bus> petr = new Driver<>("Иванов Петр Николаевич", "D", 20, maz);
        petr.drive(maz);
        Driver<СarАreight> nikolay = new Driver<>("Фоменко Николай Иванович", "С", 16, zil);
        nikolay.drive(zil);

        bmw.printType();
        maz.printType();
        zil.printType();

        diagnostics(
                lada, audi, bmw, hyundai,
                zil, kamaz, tatra, iveco,
                liaz, solaris, maz, mercedes);
    }

    public static void diagnostics(Transport... transports) {
        for (Transport transport : transports) {
            passDiagnostics(transport);
        }
    }

    public static void passDiagnostics(Transport transport){
        try {
            if (!transport.passDiagnostics())
            throw new RuntimeException("Транспортное средство " + transport.getBrand() + " " + transport.getModel()
                    + " не прошел диагностику! Выезжать ОПАСНО!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printInfo(Car car) {
        System.out.println(
                "Легковой автомобиль " +
                        "Марка " + car.getBrand() + '\'' +
                        ", Модель " + car.getModel() + '\'' +
                        ", Объем двигателя в литрах " + car.getEngineVolume());
    }

    private static void printInfo(СarАreight carAreight) {
        System.out.println(
                "Грузовой автомобиль, Марка " + carAreight.getBrand() + '\'' +
                        ", Модель " + carAreight.getModel() + '\'' +
                        ", Объем двигателя в литрах " + carAreight.getEngineVolume());
    }

    private static void printInfo(Bus bus) {
        System.out.println("Автобус Марка " + bus.getBrand() + '\'' + ", Модель " + bus.getModel() + '\'' +
                ", Объем двигателя в литрах " + bus.getEngineVolume());
    }


}