package day11;

class car{
	private int speed,brake,gear;
	private boolean clutch,accelater;
	public void start() {
		speed = 100;
	}
	public void stop() {
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getBrake() {
		return brake;
	}
	public void setBrake(int brake) {
		this.brake = brake;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public boolean isClutch() {
		return clutch;
	}
	public void setClutch(boolean clutch) {
		this.clutch = clutch;
	}
	public boolean isAccelater() {
		return accelater;
	}
	public void setAccelater(boolean accelater) {
		this.accelater = accelater;
	}
	
}
class maruti extends car{
	public void color() {
		
	}
}
public class AccessModifiersDemo {

	public static void main(String[] args) {
	int i;
	car c= new car();	

	
	}

}
