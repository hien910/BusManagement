import java.util.Arrays;

public class Assignment {
    private Driver driver;
    private BusAssignment[] busAssignment;

    public Assignment() {
    }

    public Assignment(Driver driver, BusAssignment[] busAssignment) {
        this.driver=driver;
        this.busAssignment= busAssignment;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "driver=" + driver +
                ", busAssignment=" + Arrays.toString(busAssignment) +
                '}';
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public BusAssignment[] getBusAssignment() {
        return busAssignment;
    }

    public void setBusAssignment(BusAssignment[] busAssignment) {
        this.busAssignment = busAssignment;
    }
}
