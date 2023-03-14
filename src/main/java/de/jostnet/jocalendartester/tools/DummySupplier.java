package de.jostnet.jocalendartester.tools;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.addons.jostnet.jocalendar.data.CalendarEntry;
import org.vaadin.addons.jostnet.jocalendar.data.CalendarSupplier;

import com.vaadin.flow.spring.annotation.SpringComponent;

import de.jostnet.jocalendartester.data.Session;

@SpringComponent
public class DummySupplier implements CalendarSupplier
{
	private Session session;

	public DummySupplier(@Autowired Session session)
	{
		this.session = session;
	}

	@Override
	public List<CalendarEntry> get(LocalDate from, LocalDate to)
	{
		int counter = 0;
		List<CalendarEntry> entries = new ArrayList<>();

		CalendarEntry entry1 = new CalendarEntry();
		entry1.setDate(from);
		entry1.setDescription("Testtermin (Dummy)");
		entry1.setColor("darkblue");
		entry1.setBackgroundColor("lightblue");
		entries.add(entry1);
		counter++;
		String key = "DummySupplier" + counter;
		session.put(key, "asdfjklö");
//		entry1.addClickListener(e ->
//		{
//			entry1.getUI().ifPresent(ui -> ui.navigate(Jump2Test.class, key));
//		});

		CalendarEntry entry2 = new CalendarEntry();
		entry2.setDate(from);
		entry2.setDescription("Testtermin (Dummy)");
		entry2.setColor("white");
		entry2.setBackgroundColor("red");
		entries.add(entry2);

		int month = to.getMonthValue();
		if (to.getDayOfMonth() < 7)
		{
			month--;
		}

		if (ChronoUnit.DAYS.between(from, to) > 7)
		{
			CalendarEntry entry3 = new CalendarEntry();
			entry3.setDate(from.withDayOfMonth(15).withMonth(month));
			entry3.setDescription("Testtermin (Dummy)");
			entry3.setColor("white");
			entry3.setBackgroundColor("darkgreen");
			entries.add(entry3);
		}
		return entries;
	}

}
