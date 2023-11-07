public class Printer extends Device{
    public Printer(String name) {
        super(name);
    }

    @Override
    public void printDevice() {
        System.out.println( super.getName() + " printing");
    }
}
