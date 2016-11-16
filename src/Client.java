
public class Client {
	public static void main(String[] args) {
		Battery battery = new Battery();
		
		Observer BatteryLevelDisplay = new BatteryLevelDisplay(battery);
		Observer LowBatteryWarning = new LowBatteryWarning(battery);
		Observer BatteryChargedMonitor = new BatteryChargedMonitor(battery);

		battery.addObserver(BatteryLevelDisplay);
		battery.addObserver(LowBatteryWarning);
		battery.addObserver(BatteryChargedMonitor);
		
		battery.consume(20);
		battery.consume(50);
		battery.consume(10);
		
		battery.charge(20);
		battery.charge(30);
		battery.charge(20);
		battery.charge(10);
	}

}
