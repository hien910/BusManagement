public class BusAssignment {
    private Buses buses;
    private int turn;

    public BusAssignment() {
    }

    public BusAssignment(Buses buses1, int turn) {
        this.buses= buses1;
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
        return "BusAssignment{" +
                "buses=" + buses +
                ", turn=" + turn +
                '}';
    }
}
