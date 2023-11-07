public class Fax extends Device{
    public Fax(String name) {
        super(name);
    }

    @Override
    public void printDevice() {
        System.out.println(Fax.class.getName() + " printing");
    }
}
