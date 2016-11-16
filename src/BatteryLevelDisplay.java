/*
 * Battery level을 콘솔에 보여준다.
 */
public class BatteryLevelDisplay implements Observer {
	private Battery battery;
	
	public BatteryLevelDisplay(Battery battery) {
		this.battery = battery;
	}
	
	public void update() {
		int level = battery.getLevel();
		System.out.println("Level : " + level);
	}

}
