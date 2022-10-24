public class Hangar {
    public static void main(String[] args) {

        Car clio = new Car("Clio", 150);
        System.out.println(clio.doStuff());

        Boat QE = new Boat("Queen Elizabeth 2", 200000);
        System.out.print(QE.doStuff());
    }

}