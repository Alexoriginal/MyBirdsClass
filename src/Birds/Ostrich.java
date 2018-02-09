package Birds;

import InterOfBirds.CreateEggs;
import InterOfBirds.Fly;
import InterOfBirds.RunAsatilope;

public class Ostrich extends Bird implements RunAsatilope, Fly, CreateEggs {

    public Ostrich(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("UUUURRR UUUUrrrr!!!");
    }

    @Override
    public void runAsAntil() {
        System.out.println("Ostrich run as antilope!");
    }

    @Override
    public void fly() {
        System.out.println("Fly badly");
    }

    @Override
    public void createEggs() {
        System.out.println("Ostrich has a very big eggs");
    }


}
