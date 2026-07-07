public class Logger {
    
    private static Logger instance;

    private Logger()
    {
        
    }

    public  static Logger getInstance() {

        if(instance == null){
            instance = new Logger();
            System.out.println("The Single Object is Created Successfully");
        }

        return instance;

    }

}

