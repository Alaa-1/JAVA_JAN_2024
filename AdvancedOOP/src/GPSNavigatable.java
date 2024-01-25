
public interface GPSNavigatable {

	abstract boolean isLocalisationOn();
	abstract void navigate();
	abstract String currentLocation();
}
