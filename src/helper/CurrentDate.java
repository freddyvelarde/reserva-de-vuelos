package helper;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDate {
  private String getCurrentYear() {
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
    String formattedDate = currentDate.format(formatter);
    return formattedDate;
  }
  private String getCurrentMonth() {
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
    String formattedDate = currentDate.format(formatter);
    return formattedDate;
  }
  private String getCurrentDay() {
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
    String formattedDate = currentDate.format(formatter);
    return formattedDate;
  }
  public boolean verifyDate(String date) {
    int currentDay = Integer.parseInt(getCurrentDay());
    int currentMonth = Integer.parseInt(getCurrentMonth());
    int currentYear = Integer.parseInt(getCurrentYear());

    String[] dateSplited = date.split("-");
    int day = Integer.parseInt(dateSplited[0]);
    int month = Integer.parseInt(dateSplited[1]);
    int year = Integer.parseInt(dateSplited[2]);

    if (currentYear > year)
      return false;

    if (month == 12 && currentDay > day)
      return true;

    if (currentMonth > month)
      return false;

    if (currentDay > day)
      return false;

    return true;
  }
}
