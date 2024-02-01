package train;

public class Engine {

    private RailwayCar head;

    public void addToFront(RailwayCar car) {
        car.setNext(head);
        head = car;
    }

    public void addToEnd(RailwayCar car) {
        if (head == null) {
            head = car;
        }
        else {
            //start at the head car
            RailwayCar lastCar = head;
            //follow next reference to get to the last car
            while (lastCar.getNext() != null) {
                lastCar = lastCar.getNext();
            }
            //add car after the last car
            lastCar.setNext(car);
        }
    }

    public void detach(String id) {
        if (head != null) {
            if (head.getId().equals(id)) {
                //special case when deleting head car
                head = null;
            }
            else {
                RailwayCar currentCar = head;
                RailwayCar previousCar = null;

                //Loop to find car matching id, keeping track of previous car
                while (currentCar != null && !currentCar.getId().equals(id)) {
                    previousCar = currentCar;
                    currentCar = currentCar.getNext();
                }
                if (currentCar != null) {
                    //found car matching id, detach it from previous car
                    previousCar.setNext(null);
                }
            }
        }
    }

}
