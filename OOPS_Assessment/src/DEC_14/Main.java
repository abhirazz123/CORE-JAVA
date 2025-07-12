package DEC_14;

class MessageSender {
    public void send(String message) {
        System.out.println("Sending " + message);
        try {
            Thread.sleep(1000); // Simulating delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(message + " Sent");
    }
}

class MessageThread extends Thread {
    private String message;
    private MessageSender sender;

    public MessageThread(String message, MessageSender sender) {
        this.message = message;
        this.sender = sender;
    }

    @Override
	public void run() {
        synchronized (sender) {
            sender.send(message);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender();

        Thread t1 = new MessageThread("Hi", sender);
        Thread t2 = new MessageThread("Bye", sender);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
