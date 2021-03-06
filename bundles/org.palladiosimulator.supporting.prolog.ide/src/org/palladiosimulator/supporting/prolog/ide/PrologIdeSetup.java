/*
 * generated by Xtext 2.19.0
 */
package org.palladiosimulator.supporting.prolog.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.palladiosimulator.supporting.prolog.PrologRuntimeModule;
import org.palladiosimulator.supporting.prolog.PrologStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class PrologIdeSetup extends PrologStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PrologRuntimeModule(), new PrologIdeModule()));
	}
	
}
