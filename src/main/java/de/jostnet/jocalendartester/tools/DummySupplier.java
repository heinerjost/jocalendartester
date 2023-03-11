package de.jostnet.jocalendartester.tools;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.addons.jostnet.jocalendar.data.CalendarEntry;
import org.vaadin.addons.jostnet.jocalendar.data.CalendarSupplier;

import com.vaadin.flow.spring.annotation.SpringComponent;

import de.jostnet.jocalendartester.data.Session;
import de.jostnet.jocalendartester.views.Jump2Test;

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

		CalendarEntry entry1 = new CalendarEntry(from, "Testtermin (Dummy)",
				"darkblue", "lightblue");
		entries.add(entry1);
		counter++;
		String key = "DummySupplier" + counter;
		session.put(key, "asdfjklö");
		entry1.addClickListener(e ->
		{
			entry1.getUI().ifPresent(ui -> ui.navigate(Jump2Test.class, key));
		});

		CalendarEntry entry2 = new CalendarEntry(from, "Testtermin (Dummy)",
				"white", "red");
		entries.add(entry2);

		int month = to.getMonthValue();
		if (to.getDayOfMonth() < 7)
		{
			month--;
		}

		CalendarEntry entry3 = new CalendarEntry(
				from.withDayOfMonth(15).withMonth(month), "Testtermin (Dummy)", "white",
				"darkgreen");
		entries.add(entry3);
		return entries;
	}

}
