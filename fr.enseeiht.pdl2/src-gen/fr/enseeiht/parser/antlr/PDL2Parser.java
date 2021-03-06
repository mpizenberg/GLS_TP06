/*
* generated by Xtext
*/
package fr.enseeiht.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.enseeiht.services.PDL2GrammarAccess;

public class PDL2Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private PDL2GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.enseeiht.parser.antlr.internal.InternalPDL2Parser createParser(XtextTokenStream stream) {
		return new fr.enseeiht.parser.antlr.internal.InternalPDL2Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Process";
	}
	
	public PDL2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PDL2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
