package singletonPattern;

public class Application {
    private static Application instance;
    private String user;
    private boolean isUserLoggedIn;

    private Application() {
    }

    public static Application getInstance() { 
        if (instance == null)
            instance = new Application();
        return instance;
    }
    
    public boolean isUserLoggedIn() {
        return isUserLoggedIn;
    }

    public void loginUser(String user) {
        if (!isUserLoggedIn) {
            isUserLoggedIn = true;
            this.user = user;
            System.out.println(user + " is logged in!");
        } else
            System.out.println("Another user already logged in!");
    }

    public void logoutUser() {
        isUserLoggedIn = false;
        System.out.println(user + " is logged out!");
    }

    public int getNextQueueNumber() {
        return Queues.getInstance().getSucceedingQueueNumber();
    }

    public void resetQueueNumber(int newQueueNumber) {
        Queues.getInstance().resetQueueNumber(newQueueNumber);
    }
}
