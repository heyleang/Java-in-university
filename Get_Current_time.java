import java.text.SimpleDateFormat;
import java.util.Date;

public class Get_Current_time {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeMillis);
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = timeFormat.format(currentDate);
        System.out.println("Now it's " + formattedTime);
    }
}
