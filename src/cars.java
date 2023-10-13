public class cars {

    String cars;

    cars(String car){
        cars = car;
        System.out.println("Brand " + cars);
    }


    public static void main(String[] args) {
        cars bmw = new cars("BMW");
        cars benz = new cars("BENZ");
        cars audi = new cars("AUDI");
        cars mazda = new cars("MAZDA");

    }
}
