import java.io.*;

public class PipedStream {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writerThread = new Thread(new Writer(pos));
            Thread readerThread = new Thread(new Reader(pis));

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

            pos.close();
            pis.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Writer implements Runnable {
    private PipedOutputStream pos;

    public Writer(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from Writer Thread";
            pos.write(message.getBytes());
            pos.flush();
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

class Reader implements Runnable {
    private PipedInputStream pis;

    public Reader(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = pis.read(buffer);
            String message = new String(buffer, 0, bytesRead);
            System.out.println("Reader received: " + message);
        } catch (IOException e) {
        	System.out.println("Reader Error: " + e.getMessage());
        }
    }
}
        
