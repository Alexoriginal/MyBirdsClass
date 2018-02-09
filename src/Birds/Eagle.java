package Birds;

import InterOfBirds.Fly;

/**
 * Created by java on 06.02.2018.
 */
public class Eagle extends Bird implements Fly {//имплементирует поведение интерфейса летать


    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I fly in the sky");
    }

    @Override
    public void sound() {
        System.out.println("EEEEEEE");
    }
}
