package App;

import Animals.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static Logger logJava = Logger.getLogger(App.class);

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Bird());
        animals.add(new Cat());
        animals.add(new Cow());
        animals.add(new Dog());
        animals.add(new Fish());
        animals.add(new Monkey());

        for (Animal a: animals) {
            System.out.println("["+a.getClass()+"]");
        }

        logJava.info("LOG INFO");

    }
}
