package Logger;

public class App{
	Logger logger;
    public static void main(String[] args){
        Logger logger = new AsterisksLogger();
        logger.log("Hello");
        logger.error("Trevor");
        
        Logger logger2 = new SpacedLogger();
        logger2.log("Hello");
        logger2.error("Trevor");
        }
}
