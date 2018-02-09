package Birds;

import InterOfBirds.CreateEggs;
import InterOfBirds.Fly;

/**
 * Created by java on 06.02.2018.
 */
public class Duck extends Bird implements Fly, CreateEggs {


    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("  I am duckI can fly in the sky");

    }

    @Override
    public void sound() {
        System.out.println("krya");
    }

    @Override
    public void createEggs() {
        System.out.println("I am duck,i like do eggs");
    }

}
