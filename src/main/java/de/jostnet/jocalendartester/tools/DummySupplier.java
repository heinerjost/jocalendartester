package de.jostnet.jocalendartester.tools;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.vaadin.addons.jostnet.jocalendar.data.CalendarEntry;
import org.vaadin.addons.jostnet.jocalendar.data.CalendarSupplier;

public class DummySupplier implements CalendarSupplier
{

	@Override
	public List<CalendarEntry> get(LocalDate from, LocalDate to)
	{
		List<CalendarEntry> entries = new ArrayList<>();

		CalendarEntry entry1 = new CalendarEntry();
		entry1.setDate(from);
		entry1.setDescription("Testtermin (Dummy)");
		entry1.setForegroundColor("darkblue");
		entry1.setBackgroundColor("lightblue");
		entries.add(entry1);

		CalendarEntry entry2 = new CalendarEntry();
		entry2.setDate(from);
		entry2.setDescription("Testtermin (Dummy)");
		entry2.setForegroundColor("yellow");
		entry2.setBackgroundColor("red");
		entries.add(entry2);

		CalendarEntry entry3 = new CalendarEntry();
		entry3.setDate(from.withDayOfMonth(15).withMonth(3));
		entry3.setDescription("Testtermin (Dummy)");
		entry3.setForegroundColor("lightgreen");
		entry3.setBackgroundColor("darkgreen");
		entries.add(entry3);
		return entries;
	}

}
