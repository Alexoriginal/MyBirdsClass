package testPackage;

/**
 * Created by java on 09.02.2018.
 */
public class Bird {

    private String name="birsd";





    public static int birdNum=5;//staticheskaya peremennaya prenadlechit k klassy


    public Bird(String name) {
        this.name = this.name+name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
