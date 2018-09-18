import java.time.LocalDateTime;

public class CommandLineClock {

    public static void main(String[] args) throws InterruptedException {


        boolean run = true;
        while (run){
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            System.out.println("The current time is: " + hour + " : " + minute + " : " + second);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception){
                Thread.currentThread().interrupt();
            }
        }
    }
}
