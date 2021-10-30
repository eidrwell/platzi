   class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("VZLA123", new Account("Andres Herrera", "28202456"));
        car.passengenger = 4;
        car.printDataCar();
        
        Car car2 = new Car("Col911", new Account("El markitos", "13525601"));
        car2.passengenger = 4;
        car2.printDataCar();
    }

  

}