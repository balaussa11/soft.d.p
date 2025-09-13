public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .withSeats(2)
                .withEngine("V8")
                .withGPS(true)
                .withTripComputer(true)
                .build();

        System.out.println(sportsCar);
    }
}
