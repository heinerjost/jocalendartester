package de.jostnet.jocalendartester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.AppShellConfigurator;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@NpmPackage(value = "line-awesome", version = "1.3.0")
public class Application implements AppShellConfigurator
{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

}
