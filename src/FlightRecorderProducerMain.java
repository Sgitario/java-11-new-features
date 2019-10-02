import jdk.jfr.Description;
import jdk.jfr.Event;
import jdk.jfr.Label;

@Label("Number of messages")
@Description("Track the number of messages sent")
public class FlightRecorderProducerMain extends Event {
	@Label("message")
	String message;

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			final FlightRecorderProducerMain j = new FlightRecorderProducerMain();
			j.message = String.valueOf(i);
			j.commit();
		}
	}
}
