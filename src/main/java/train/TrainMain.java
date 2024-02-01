package train;

public class TrainMain {
    public static void main(String[] args) {

        Engine blueEngine = new Engine();
        Engine redEngine = new Engine();
        Engine yellowEngine = new Engine();

        blueEngine.addToFront( new RailwayCar("a1") ); //a1
        blueEngine.addToFront( new RailwayCar("b1") ); //b1,a1
        blueEngine.addToFront( new RailwayCar("c1") ); //c1,b1,a1

        redEngine.addToEnd( new RailwayCar("a2") ); //a2
        redEngine.addToEnd( new RailwayCar("b2") ); //a2,b2
        redEngine.addToEnd( new RailwayCar("c2") ); //a2,b2,c2

        blueEngine.detach("b1");  //c1,b1,a1 ==> c1
        blueEngine.detach("zz");  //c1 ==> c1
        redEngine.detach("a2");   //a2,b2,c2 ==> no cars
        yellowEngine.detach("a1");  //no cars

    }
}
