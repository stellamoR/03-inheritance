package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static final Logger logger = LogManager.getLogger();
    private static int t;
    private int duration; //final?


    static State tick(Cat cat){
        t++;
        return null;
    }
    abstract State successor(Cat cat);

}
