/*
 * generated by Xtext 2.14.0
 */
package fsm


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TextEditorStandaloneSetup extends TextEditorStandaloneSetupGenerated {

	def static void doSetup() {
		new TextEditorStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
