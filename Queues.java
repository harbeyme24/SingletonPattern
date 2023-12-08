package singletonPattern;

public class Queues {
    
    private static Queues instance;
    private int numInteger;

    private Queues() {
        numInteger = 1; 
    }
  
    public static Queues getInstance() {
        if (instance == null)
            instance = new Queues();
        return instance;
    }

    public synchronized int getCurrentQueueNumber() {
            return numInteger;
        }


    public synchronized void resetQueueNumber(int newQueueNumber) {
            numInteger = newQueueNumber;
            System.out.println("Queue number reset to: " + newQueueNumber);
        }


    public int getSucceedingQueueNumber() {
            return numInteger++; 
        }
    }
