
public class BatteryChargedMonitor implements Observer {
	private static final int HIGH_BATTERY = 80;
	private static final int FULL_BATTERY = 100;
	private Battery battery;
	
	public BatteryChargedMonitor(Battery battery) {
		this.battery = battery;
	}
	@Override
	public void update() {
		int level = battery.getLevel();
		if(level > 80 && level <= 100) System.out.println("Battery charging~");
		if(level == 100)
			System.out.println("Battery Full Charged!!");
		if(level > 100)
			System.out.println("Battery Over Charged");
	}

}
