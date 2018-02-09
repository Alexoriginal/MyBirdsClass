package Birds;

import InterOfBirds.Fly;
import InterOfBirds.SpeekAsHuman;

public class Parrot extends Bird implements SpeekAsHuman, Fly {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("U-u-u-u-u!!!");
    }

    @Override
    public void speekAsHum() {
        System.out.println("I am parrot,i speak as hauman,ho ho ho!!!");
    }

    @Override
    public void fly() {
        System.out.println("Fly highly and sit on the tree");
    }
}
