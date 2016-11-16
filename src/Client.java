
public class Client {
	public static void main(String[] args) {
		Battery battery = new Battery();
		
		Observer BatteryLevelDisplay = new BatteryLevelDisplay(battery);
		Observer LowBatteryWarning = new LowBatteryWarning(battery);

		battery.addObserver(BatteryLevelDisplay);
		battery.addObserver(LowBatteryWarning);
		
		battery.consume(20);
		battery.consume(50);
		battery.consume(10);
	}

}
