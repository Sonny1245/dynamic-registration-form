package sonny.com;

import org.apache.logging.log4j.*;

public class LoggingDemo {
    
    private static Logger log = LogManager.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {
        
        //As default: only log.error works for now
        /*DEBUG Level. This log4j level helps developer to debug application. ...
        INFO Level. This log4j level gives the progress and chosen state information. ...
        WARN Level. This log4j level gives a warning about an unexpected event to the user. ...
        ERROR Level. ...
        FATAL Level. ...
        ALL Level. ...
        OFF Level. ...
        TRACE Level.*/
        System.out.println("Just print and gone from syso");
        log.info("Info messge from log.info");
        log.error("Something has gone wrong from log.error");
        log.debug("Debug message from log.debug");

    }

}
