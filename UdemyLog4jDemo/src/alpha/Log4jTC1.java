
package alpha;

import org.apache.logging.log4j.*;


public class Log4jTC1 {

	private static Logger log = LogManager.getLogger(Log4jTC1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debuggibng");
		log.info("Object is present");
		log.error("Object is not present");
		log.fatal("This is fatal");
		
	}

}