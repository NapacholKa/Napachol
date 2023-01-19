
public class TestTime {

	public static void main(String[] args) {
		Time t1 = new Time(1,2,3);
		System.out.println(t1);
		
		Time t2 = new Time();
		System.out.println(t2);
		
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		
		System.out.println(t1);
		System.out.println("\nHour is "+t1.getHour()+"hr.");
		System.out.println("\nMinute is "+t1.getMinute()+"min.");
		System.out.println("\nSecond is "+t1.getSecond()+"sec.");
		
		t1.setTime(58,59,23);
		System.out.println("\n"+t1);
		System.out.println(t1.nextSecond());
		//23:59:59
		System.out.println(t1.nextSecond().nextSecond().nextSecond());
		
		
		
		
		

	}

}
