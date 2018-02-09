package Birds;

/**
 * Created by java on 06.02.2018.
 */
public class RubberDuck extends Bird {


    public RubberDuck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("quack");
    }
}
