/*
 * generated by Xtext
 */
package fr.enseeiht.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PETRI1ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return fr.enseeiht.ui.internal.PETRI1Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return fr.enseeiht.ui.internal.PETRI1Activator.getInstance().getInjector("fr.enseeiht.PETRI1");
	}
	
}
