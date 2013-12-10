/*
* generated by Xtext
*/
package fr.enseeiht.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.enseeiht.services.PETRI1GrammarAccess;

public class PETRI1Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private PETRI1GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.enseeiht.parser.antlr.internal.InternalPETRI1Parser createParser(XtextTokenStream stream) {
		return new fr.enseeiht.parser.antlr.internal.InternalPETRI1Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "PetriNet";
	}
	
	public PETRI1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PETRI1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}