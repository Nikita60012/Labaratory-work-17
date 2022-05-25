import java.util.Scanner;

interface Transport{
    public String toString();
}
interface TransportChoice{
    public abstract Transport chooseTransport();
}
class TrackChoice implements TransportChoice{
    public Transport chooseTransport(){
        return new Track();
    }
}
class AirplaneChoice implements TransportChoice{
    public Transport chooseTransport(){
        return new Airplane();
    }
}
class ShipChoice implements TransportChoice{
    public Transport chooseTransport(){
        return new Ship();
    }
}
class Track implements Transport{
    public String toString(){
        return "Выбран наземный вид доставки";
    }
}
class Airplane implements Transport{
    public String toString(){
        return "Выбран воздушный вид доставки";
    }
}
class Ship implements Transport{
    public String toString(){
        return "Выбран надводный вид доставки";
    }
}
public class MyProgram {
    public static void main(String[] args){
        TransportChoice trackDelivery = new TrackChoice();
        TransportChoice AirDelivery = new AirplaneChoice();
        TransportChoice seaDelivery = new ShipChoice();

        Transport track = trackDelivery.chooseTransport();
        Transport airplane = AirDelivery.chooseTransport();
        Transport ship = seaDelivery.chooseTransport();

        System.out.println("Выберите вид доставки: наземный, воздушный, морской (1, 2, 3)");
        Scanner in = new Scanner(System.in);

        switch (in.nextInt()){
            case 1:
                System.out.println(track);
                break;
            case 2:
                System.out.println(airplane);
                break;
            case 3:
                System.out.println(ship);
                break;
        }
    }
}
