/*
 * Battery level이 30%이하면 경고를 콘솔에 출력한다.
 */
public class LowBatteryWarning implements Observer {
	private static final int LOW_BATTERY = 30;
	private Battery battery;
	
	public LowBatteryWarning(Battery battery) {
		this.battery = battery;
	}
	
	public void update() {
		int level = battery.getLevel();
		if(level < LOW_BATTERY)
			System.out.println(
				"<Warning> Low Battery : " + level + " Compared with " + LOW_BATTERY);
	}
}
