package Birds;

/**
 * Created by java on 06.02.2018.
 */
public abstract class Bird {

    private String name;


//    public abstract void fly();

    public abstract void sound();

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




