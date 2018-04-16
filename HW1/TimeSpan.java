public class TimeSpan {
  private int totalMinutes, hours, minutes;

  public TimeSpan(int hours, int minutes) {
   this.hours = hours;
   this.minutes = minutes;
   totalMinutes = 0;
   add(hours, minutes);
  }

  public void add(int hours, int minutes) {
    totalMinutes += 60 * hours + minutes;
  }

  public void add(TimeSpan time) {
    add(time.hours, time.minutes);
  }

  public String toString() {
    return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m";
  }

  public boolean equals(TimeSpan o) {
    return o.hours == hours && o.minutes == minutes;
  }
}
