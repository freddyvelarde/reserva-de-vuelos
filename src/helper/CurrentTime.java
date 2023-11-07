package helper;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
  private String getCurrentHour() {
    LocalTime currentTime = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
    String formattedTime = currentTime.format(formatter);
    return formattedTime;
  }
  private String getCurrentMinute() {
    LocalTime currentTime = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm");
    String formattedTime = currentTime.format(formatter);
    return formattedTime;
  }

  public boolean verifyHour(String time) {
    String[] timeSplited = time.split(":");

    int minute = Integer.parseInt(getCurrentMinute());
    int hour = Integer.parseInt(getCurrentHour());

    int newMinute = Integer.parseInt(timeSplited[1]);
    int newHour = Integer.parseInt(timeSplited[0]);

    if (newHour < hour)
      return false;

    if (newHour == hour) {
      if (newMinute < minute)
        return false;
    }
    return true;
  }
}
