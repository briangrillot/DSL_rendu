/*
 * generated by Xtext 2.14.0
 */
package fsm.formatting2

import com.google.inject.Inject
import fsm.FSM
import fsm.services.TextEditorGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class TextEditorFormatter extends AbstractFormatter2 {
	
	@Inject extension TextEditorGrammarAccess

	def dispatch void format(FSM fSM, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (state : fSM.state) {
			state.format
		}
		for (transition : fSM.transition) {
			transition.format
		}
	}
	
	// TODO: implement for 
}
