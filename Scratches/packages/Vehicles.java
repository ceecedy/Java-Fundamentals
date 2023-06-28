package packages;

public class Vehicles {

    public static class motor {
        public void capacity() {
            System.out.println("I can ride with maximum of 3 passengers with a top speed of 360 kph.");
        }
    }



    public static class car extends motor {
        public void capability() {
            System.out.println("I can move up to 400 kph and travel up to 20 people inside.");
        }
    } 
}
