package entity;

public class BusAssignment {
    private Buses buses;
    private int turn;

    public BusAssignment() {
    }

    public BusAssignment(Buses buses, int turn) {
        this.buses= buses;
        this.turn =turn;
    }

    public Buses getBuses() {
        return buses;
    }

    public void setBuses(Buses buses) {
        this.buses = buses;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return "entity.BusAssignment{" +
                "buses=" + buses +
                ", turn=" + turn +
                '}';
    }
}
