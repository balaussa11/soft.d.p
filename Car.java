public class Car {
    private final int seats;
    private final String engine;
    private final boolean gpsEnabled;
    private final boolean tripComputerEnabled;

    // Private constructor
    private Car(int seats, String engine, boolean gpsEnabled, boolean tripComputerEnabled) {
        this.seats = seats;
        this.engine = engine;
        this.gpsEnabled = gpsEnabled;
        this.tripComputerEnabled = tripComputerEnabled;
    }

    // Static Builder class
    public static class Builder {
        private int seats;
        private String engine;
        private boolean gpsEnabled;
        private boolean tripComputerEnabled;

        public Builder withSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder withGPS(boolean gpsEnabled) {
            this.gpsEnabled = gpsEnabled;
            return this;
        }

        public Builder withTripComputer(boolean tripComputerEnabled) {
            this.tripComputerEnabled = tripComputerEnabled;
            return this;
        }

        public Car build() {
            return new Car(seats, engine, gpsEnabled, tripComputerEnabled);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", gpsEnabled=" + gpsEnabled +
                ", tripComputerEnabled=" + tripComputerEnabled +
                '}';
    }
}
