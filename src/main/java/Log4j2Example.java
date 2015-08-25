import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Александр on 17.08.2015.
 */

public class Log4j2Example {

    public static void main(String[] args) {
        Logger log = LogManager.getLogger(Log4j2Example.class.getName());
        log.error("Entering log4j example");
           // log.error("Exit");
    }
}
