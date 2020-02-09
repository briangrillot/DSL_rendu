/*
 * generated by Xtext 2.14.0
 */
package fsm.parser.antlr;

import com.google.inject.Inject;
import fsm.parser.antlr.internal.InternalTextEditorParser;
import fsm.services.TextEditorGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TextEditorParser extends AbstractAntlrParser {

	@Inject
	private TextEditorGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTextEditorParser createParser(XtextTokenStream stream) {
		return new InternalTextEditorParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "FSM";
	}

	public TextEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TextEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}