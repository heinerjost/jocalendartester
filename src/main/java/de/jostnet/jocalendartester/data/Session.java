package de.jostnet.jocalendartester.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.context.annotation.SessionScope;

import com.vaadin.flow.spring.annotation.SpringComponent;

@SpringComponent
@SessionScope
public class Session
{
	private Map<String, String> map = new HashMap<>();

	public void put(String id1, String id2)
	{
		map.put(id1, id2);
	}

	public String getId(String key)
	{
		return map.get(key);
	}

}
