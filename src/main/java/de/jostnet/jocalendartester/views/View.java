package de.jostnet.jocalendartester.views;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.addons.jostnet.jocalendar.JoCalendar;
import org.vaadin.addons.jostnet.jocalendar.ViewType;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import de.jostnet.jocalendartester.tools.DummySupplier;

@PageTitle("")
@Route(value = "")
public class View extends Div
{

	private static final long serialVersionUID = 1L;

	public View(@Autowired DummySupplier ds)
	{
		JoCalendar joCalendar = new JoCalendar(LocalDate.now(), ViewType.MONTH, ds);
		add(joCalendar);
	}

}
