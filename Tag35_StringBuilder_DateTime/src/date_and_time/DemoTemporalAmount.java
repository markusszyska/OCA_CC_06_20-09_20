package date_and_time;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

/**
 * java.time.temporal.TemporalAmount
 * 
 * @TemporalAmount This interface is implemented by the Period class. When you
 *                 use Period objects to manipulate (see the following section),
 *                 calendar objects, you'll often use methods that take objects
 *                 that implement TemporalAmount. In general, as you use the
 *                 Java API more and more, it's a good idea to learn which
 *                 classes implement which interfaces; this is a key way to
 *                 learn how the classes in complex packages interact with each
 *                 other.
 * 
 * @Deutsch Dieses Interface bildet die Basis für viele Zeit- und
 *         Datumsrepräsentationen und definiert Lesezugriffe auf den jeweils
 *         modelliertenWert. Ein solcher besitzt eine Einheit, die durch das
 *         Interface TemporalUnit bestimmt wird. Diverse Aufzählungen
 *         implementieren das Interface TemporalAccessor, etwa DayOfWeek und
 *         Month zur Modellierung von Wochentagen bzw. Monaten.
 */
public class DemoTemporalAmount implements TemporalAmount {

	@Override
	public long get(TemporalUnit unit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TemporalUnit> getUnits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Temporal addTo(Temporal temporal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Temporal subtractFrom(Temporal temporal) {
		// TODO Auto-generated method stub
		return null;
	}

}
