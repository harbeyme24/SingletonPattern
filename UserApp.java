package singletonPattern;

public class UserApp {
    public static void main(String[] args) {
       
        Application app = Application.getInstance();
        Queues queues = Queues.getInstance();

        app.loginUser("Harbey");
        int queueNumberHarbey = app.getNextQueueNumber();
        System.out.println("Harbey's Queue Number: " + queueNumberHarbey);

        app.loginUser("manuel");
        int queueNumberManuel = app.getNextQueueNumber();
        System.out.println("\nManuel's Queue Number: " + queueNumberManuel);

        app.resetQueueNumber(25);

        app.logoutUser();
        System.out.println();

        app.loginUser("Edroso");
        int newQueueNumberEdroso = app.getNextQueueNumber();
        System.out.println("Edroso's New Queue Number: " + newQueueNumberEdroso);
    }
}
