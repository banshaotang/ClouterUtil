import com.clouter.clouterutil.receiver.ValueTimeReceiver;

public class Test {
	public static void main(String[] args) throws Exception{
		ValueTimeReceiver receiver = new ValueTimeReceiver(0, System.currentTimeMillis(), 10, 2000);
		while(true){
			System.out.println(receiver.getValue() + " " + receiver.getNextReceiveCd());
			Thread.sleep(200);
		}
	}
}