package de.jostnet.jocalendartester.views;

import java.time.LocalDate;

import org.vaadin.addons.jostnet.jocalendar.JoCalendar;
import org.vaadin.addons.jostnet.jocalendar.ViewType;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("")
@Route(value = "")
public class View extends Div
{

	private static final long serialVersionUID = 1L;

	public View()
	{
		JoCalendar joCalendar = new JoCalendar(LocalDate.now(), ViewType.MONTH);
		add(joCalendar);

	}

}
