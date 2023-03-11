package de.jostnet.jocalendartester.views;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import de.jostnet.jocalendartester.data.Session;

@PageTitle("jump2test")
@Route(value = "jump2")
public class Jump2Test extends Div implements HasUrlParameter<String>
{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private Session session;

	public Jump2Test()
	{
		setText("Jumped");
	}

	@Override
	public void setParameter(BeforeEvent event, String parameter)
	{
		String id = session.getId(parameter);
		setText(id);
	}

}
