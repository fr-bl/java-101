public class Digitaluhr {
	int hour;
	int minute;
	int second;

	public static void main(String[] args) throws InterruptedException {
		Digitaluhr clock = new Digitaluhr(12, 36, 56);
		
		while (true) {
			System.out.print(clock.formatTime() + "\r");
			Thread.sleep(1000);
			clock.increaseSecond();
		}
	}
	
	public Digitaluhr(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Digitaluhr() {
		new Digitaluhr(0, 0, 0);
	}
	
	public void increaseSecond() {
		second++;
		if (second < 60) return;
		second -= 60;
		increaseMinute();
	}
	
	public void increaseMinute() {
		minute++;
		if (minute < 60) return;
		minute -= 60;
		increaseHour();
	}
	
	public void increaseHour() {
		hour++;
		if (hour < 24) return;
		hour -= 24;
	}
	
	public int[] getTime() {
		int[] time = {hour, minute, second};
		return time;
	}
	
	public String formatTime(String separator) {
		return String.format(
			"%02d" + separator+ "%02d" + separator + "%02d", hour, minute, second
		);
	}
	
	public String formatTime() {
		return formatTime(":");
	}
	
	public String toString() {
		return "Digitaluhr{" + formatTime() + "}";
	}
}
