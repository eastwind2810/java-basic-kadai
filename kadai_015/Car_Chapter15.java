package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15(int gear,int speed) {
		this.gear =gear;
		this.speed = speed;
		
	}
	
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear +"から"+ afterGear +"に切り替えました");
		gear = afterGear;
	}
	public void run(){
		int[] speed = { 10 , 20 , 30 , 40 , 50 };
			
		if(gear >= 1 && gear <= 5) {
			System.out.println("速度は時速"+ speed[gear-1] +"kmです");
		}
		else {
			System.out.println("速度は時速10kmです");
		}
	}
}
