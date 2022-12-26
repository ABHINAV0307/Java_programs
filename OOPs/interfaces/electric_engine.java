public class electric_engine implements engine {


    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");

    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelarate");

    }
}
