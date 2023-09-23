import java.util.Arrays;

public class Assignment {
    private Driver driver;
    private BusAssignment[] busAssignment;
    private int totalTurn;

    public Assignment() {
    }

    public int getTotalTurn() {
        return totalTurn;
    }

    public Assignment(Driver driver, BusAssignment[] busAssignment, int totalTurn) {
        this.driver=driver;
        this.busAssignment= busAssignment;
        this.totalTurn= totalTurn;
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
