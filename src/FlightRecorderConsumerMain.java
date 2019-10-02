import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

public class FlightRecorderConsumerMain {

	public static void main(String[] args) throws Exception {
		Path p = Paths.get("recording.jfr");
		for (RecordedEvent e : RecordingFile.readAllEvents(p)) {
			final List<ValueDescriptor> lvd = e.getFields();
			for (ValueDescriptor vd : lvd) {
				System.out.println(vd.getLabel() + "=" + e.getValue(vd.getName()));
			}
		}

	}
}
