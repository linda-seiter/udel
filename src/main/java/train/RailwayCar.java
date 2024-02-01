package train;

public class RailwayCar {
    private String id;
    private RailwayCar next;

    public RailwayCar(String id) { this.id = id; }
    public String getId() { return this.id; }
    public RailwayCar getNext() { return next; }
    public void setNext(RailwayCar next) { this.next = next; }
}
