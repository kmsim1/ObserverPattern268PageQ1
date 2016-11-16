import java.util.ArrayList;
import java.util.List;
/*
 * 관찰대상은  Battery Level
 */
public class Battery extends Subject {
	private int level = 100;

	public void consume(int amount) {
		level -= amount;
		notifyObserver();
	}
	
	public int getLevel() {
		return level;
	}

}
