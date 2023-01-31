// Generated with ANTLR

package de.monticore.gettingstarted.website._parser;
import de.monticore.antlr4.*;
import de.monticore.parser.*;
import de.monticore.gettingstarted.website.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WebsiteAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WEBSITE1224335515=1, START109757538=2, LANDIMAGE1392157232=3, PIC110986=4, 
		TEXTBLOCK3230384992=5, MINUS=6, POINT=7, CONTENT951530617=8, MINUSGT=9, 
		NAVIGATION1862666772=10, NULL3392903=11, ASIDE93111608=12, CODEBLOCK3140932256=13, 
		X120=14, LCURLY=15, SEMI=16, PAGE3433103=17, ROW113114=18, RCURLY=19, 
		CARD3046160=20, TABLE110115790=21, TRUE3569038=22, FALSE97196323=23, Digits=24, 
		String=25, Name=26, Char=27, ML_COMMENT=28, SL_COMMENT=29, WS=30;
	public static final int
		RULE_nullLiteral = 0, RULE_booleanLiteral = 1, RULE_charLiteral = 2, RULE_stringLiteral = 3, 
		RULE_natLiteral = 4, RULE_signedNatLiteral = 5, RULE_basicLongLiteral = 6, 
		RULE_signedBasicLongLiteral = 7, RULE_basicFloatLiteral = 8, RULE_signedBasicFloatLiteral = 9, 
		RULE_basicDoubleLiteral = 10, RULE_signedBasicDoubleLiteral = 11, RULE_website = 12, 
		RULE_navigation = 13, RULE_navigationItem = 14, RULE_page = 15, RULE_pageContent = 16, 
		RULE_link = 17, RULE_picture = 18, RULE_paragraph = 19, RULE_textBlock = 20, 
		RULE_codeBlock = 21, RULE_aside = 22, RULE_row = 23, RULE_landImage = 24, 
		RULE_card = 25, RULE_table = 26, RULE_literal = 27, RULE_signedLiteral = 28, 
		RULE_numericLiteral = 29, RULE_signedNumericLiteral = 30, RULE_websiteElement = 31, 
		RULE_pageContentElement = 32, RULE_nokeyword_f102 = 33, RULE_nokeyword_F70 = 34, 
		RULE_nokeyword_l108 = 35, RULE_nokeyword_L76 = 36;
	public static final String[] ruleNames = {
		"nullLiteral", "booleanLiteral", "charLiteral", "stringLiteral", "natLiteral", 
		"signedNatLiteral", "basicLongLiteral", "signedBasicLongLiteral", "basicFloatLiteral", 
		"signedBasicFloatLiteral", "basicDoubleLiteral", "signedBasicDoubleLiteral", 
		"website", "navigation", "navigationItem", "page", "pageContent", "link", 
		"picture", "paragraph", "textBlock", "codeBlock", "aside", "row", "landImage", 
		"card", "table", "literal", "signedLiteral", "numericLiteral", "signedNumericLiteral", 
		"websiteElement", "pageContentElement", "nokeyword_f102", "nokeyword_F70", 
		"nokeyword_l108", "nokeyword_L76"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'website'", "'start'", "'landImage'", "'pic'", "'textBlock'", "'-'", 
		"'.'", "'content'", "'->'", "'navigation'", "'null'", "'aside'", "'codeBlock'", 
		"'x'", "'{'", "';'", "'page'", "'row'", "'}'", "'card'", "'table'", "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WEBSITE1224335515", "START109757538", "LANDIMAGE1392157232", "PIC110986", 
		"TEXTBLOCK3230384992", "MINUS", "POINT", "CONTENT951530617", "MINUSGT", 
		"NAVIGATION1862666772", "NULL3392903", "ASIDE93111608", "CODEBLOCK3140932256", 
		"X120", "LCURLY", "SEMI", "PAGE3433103", "ROW113114", "RCURLY", "CARD3046160", 
		"TABLE110115790", "TRUE3569038", "FALSE97196323", "Digits", "String", 
		"Name", "Char", "ML_COMMENT", "SL_COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WebsiteAntlrParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	  // convert function for Name
	private String convertName(Token t)  {
	    return t.getText();
	}

	  // convert function for NEWLINE
	private String convertNEWLINE(Token t)  {
	    return t.getText();
	}

	  // convert function for WS
	private String convertWS(Token t)  {
	    return t.getText();
	}

	  // convert function for SL_COMMENT
	private String convertSL_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for ML_COMMENT
	private String convertML_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for Digits
	private String convertDigits(Token t)  {
	    return t.getText();
	}

	  // convert function for Digit
	private String convertDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for Char
	private String convertChar(Token t)  {
	    return t.getText();
	}

	  // convert function for SingleCharacter
	private String convertSingleCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for String
	private String convertString(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacters
	private String convertStringCharacters(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacter
	private String convertStringCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for EscapeSequence
	private String convertEscapeSequence(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalEscape
	private String convertOctalEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for UnicodeEscape
	private String convertUnicodeEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for ZeroToThree
	private String convertZeroToThree(Token t)  {
	    return t.getText();
	}

	  // convert function for HexDigit
	private String convertHexDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalDigit
	private String convertOctalDigit(Token t)  {
	    return t.getText();
	}


	public WebsiteAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NullLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public TerminalNode NULL3392903() { return getToken(WebsiteAntlrParser.NULL3392903, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTNullLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.nullLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NULL3392903);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null;
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_booleanLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.booleanLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE3569038:
				{
				setState(76);
				match(TRUE3569038);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case FALSE97196323:
				{
				setState(78);
				match(FALSE97196323);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.FALSE);

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null;
		public Token tmp0;
		public TerminalNode Char() { return getToken(WebsiteAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTCharLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.charLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
			((CharLiteralContext)_localctx).tmp0 = match(Char);
			_builder.setSource(convertChar(((CharLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ret = null;
		public Token tmp0;
		public TerminalNode String() { return getToken(WebsiteAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stringLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTStringLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.stringLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85);
			((StringLiteralContext)_localctx).tmp0 = match(String);
			_builder.setSource(convertString(((StringLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(WebsiteAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
	}

	public final NatLiteralContext natLiteral() throws RecognitionException {
		NatLiteralContext _localctx = new NatLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_natLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTNatLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.natLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			((NatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((NatLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedNatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode Digits() { return getToken(WebsiteAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(WebsiteAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
	}

	public final SignedNatLiteralContext signedNatLiteral() throws RecognitionException {
		SignedNatLiteralContext _localctx = new SignedNatLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signedNatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.signedNatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				if (!(noSpace(2))) throw new FailedPredicateException(this, "noSpace(2)");
				{
				{
				setState(92);
				match(MINUS);

				_builder.setNegative(true);

				}
				}
				{
				setState(95);
				((SignedNatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp0));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(97);
				((SignedNatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp1));
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(WebsiteAntlrParser.Digits, 0); }
		public Nokeyword_l108Context nokeyword_l108() {
			return getRuleContext(Nokeyword_l108Context.class,0);
		}
		public Nokeyword_L76Context nokeyword_L76() {
			return getRuleContext(Nokeyword_L76Context.class,0);
		}
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
	}

	public final BasicLongLiteralContext basicLongLiteral() throws RecognitionException {
		BasicLongLiteralContext _localctx = new BasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basicLongLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.basicLongLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
			{
			setState(102);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(105);
				nokeyword_l108();
				}
				break;
			case 2:
				{
				setState(106);
				nokeyword_L76();
				}
				break;
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedBasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode MINUS() { return getToken(WebsiteAntlrParser.MINUS, 0); }
		public TerminalNode Digits() { return getToken(WebsiteAntlrParser.Digits, 0); }
		public Nokeyword_l108Context nokeyword_l108() {
			return getRuleContext(Nokeyword_l108Context.class,0);
		}
		public Nokeyword_L76Context nokeyword_L76() {
			return getRuleContext(Nokeyword_L76Context.class,0);
		}
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
	}

	public final SignedBasicLongLiteralContext signedBasicLongLiteral() throws RecognitionException {
		SignedBasicLongLiteralContext _localctx = new SignedBasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signedBasicLongLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.signedBasicLongLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				if (!(cmpToken(3,"l","L") && noSpace(2,3))) throw new FailedPredicateException(this, "cmpToken(3,\"l\",\"L\") && noSpace(2,3)");
				{
				setState(110);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(113);
				((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
				}
				{
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(116);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(117);
					nokeyword_L76();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
				{
				setState(121);
				((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp1));
				}
				{
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(124);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(125);
					nokeyword_L76();
					}
					break;
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(WebsiteAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(WebsiteAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(WebsiteAntlrParser.Digits, i);
		}
		public Nokeyword_f102Context nokeyword_f102() {
			return getRuleContext(Nokeyword_f102Context.class,0);
		}
		public Nokeyword_F70Context nokeyword_F70() {
			return getRuleContext(Nokeyword_F70Context.class,0);
		}
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
	}

	public final BasicFloatLiteralContext basicFloatLiteral() throws RecognitionException {
		BasicFloatLiteralContext _localctx = new BasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_basicFloatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.basicFloatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
			{
			setState(131);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(134);
			match(POINT);
			{
			setState(135);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(138);
				nokeyword_f102();
				}
				break;
			case 2:
				{
				setState(139);
				nokeyword_F70();
				}
				break;
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedBasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode POINT() { return getToken(WebsiteAntlrParser.POINT, 0); }
		public TerminalNode MINUS() { return getToken(WebsiteAntlrParser.MINUS, 0); }
		public List<TerminalNode> Digits() { return getTokens(WebsiteAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(WebsiteAntlrParser.Digits, i);
		}
		public Nokeyword_f102Context nokeyword_f102() {
			return getRuleContext(Nokeyword_f102Context.class,0);
		}
		public Nokeyword_F70Context nokeyword_F70() {
			return getRuleContext(Nokeyword_F70Context.class,0);
		}
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
	}

	public final SignedBasicFloatLiteralContext signedBasicFloatLiteral() throws RecognitionException {
		SignedBasicFloatLiteralContext _localctx = new SignedBasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signedBasicFloatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.signedBasicFloatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				if (!(cmpToken(5,"f","F") && noSpace(2,3,4,5))) throw new FailedPredicateException(this, "cmpToken(5,\"f\",\"F\") && noSpace(2,3,4,5)");
				{
				setState(143);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(146);
				((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
				}
				setState(149);
				match(POINT);
				{
				setState(150);
				((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
				}
				{
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(153);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(154);
					nokeyword_F70();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
				{
				setState(158);
				((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp2));
				}
				setState(161);
				match(POINT);
				{
				setState(162);
				((SignedBasicFloatLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp3));
				}
				{
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(165);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(166);
					nokeyword_F70();
					}
					break;
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(WebsiteAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(WebsiteAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(WebsiteAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
	}

	public final BasicDoubleLiteralContext basicDoubleLiteral() throws RecognitionException {
		BasicDoubleLiteralContext _localctx = new BasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicDoubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.basicDoubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
			{
			setState(172);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(175);
			match(POINT);
			{
			setState(176);
			((BasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp1));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedBasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode POINT() { return getToken(WebsiteAntlrParser.POINT, 0); }
		public TerminalNode MINUS() { return getToken(WebsiteAntlrParser.MINUS, 0); }
		public List<TerminalNode> Digits() { return getTokens(WebsiteAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(WebsiteAntlrParser.Digits, i);
		}
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
	}

	public final SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() throws RecognitionException {
		SignedBasicDoubleLiteralContext _localctx = new SignedBasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signedBasicDoubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteralBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.signedBasicDoubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				if (!(noSpace(2,3,4))) throw new FailedPredicateException(this, "noSpace(2,3,4)");
				{
				setState(180);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(183);
				((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
				}
				setState(186);
				match(POINT);
				{
				setState(187);
				((SignedBasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp1));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
				{
				setState(190);
				((SignedBasicDoubleLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp2));
				}
				setState(193);
				match(POINT);
				{
				setState(194);
				((SignedBasicDoubleLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp3));
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WebsiteContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTWebsite ret = null;
		public Token tmp0;
		public NavigationContext tmp1;
		public PageContext tmp2;
		public TerminalNode WEBSITE1224335515() { return getToken(WebsiteAntlrParser.WEBSITE1224335515, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public NavigationContext navigation() {
			return getRuleContext(NavigationContext.class,0);
		}
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public WebsiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_website; }
	}

	public final WebsiteContext website() throws RecognitionException {
		WebsiteContext _localctx = new WebsiteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_website);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTWebsiteBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.websiteBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(WEBSITE1224335515);
			{
			setState(199);
			((WebsiteContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((WebsiteContext)_localctx).tmp0));
			}
			setState(202);
			match(LCURLY);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAVIGATION1862666772) {
				{
				setState(203);
				((WebsiteContext)_localctx).tmp1 = navigation();
				_builder.setNavigation(_localctx.tmp1.ret);
				}
			}

			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				((WebsiteContext)_localctx).tmp2 = page();
				addToIteratedAttributeIfNotNull(_builder.getPageList(), _localctx.tmp2.ret);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==START109757538 || _la==PAGE3433103 );
			setState(215);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigationContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTNavigation ret = null;
		public NavigationItemContext tmp0;
		public TerminalNode NAVIGATION1862666772() { return getToken(WebsiteAntlrParser.NAVIGATION1862666772, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public List<NavigationItemContext> navigationItem() {
			return getRuleContexts(NavigationItemContext.class);
		}
		public NavigationItemContext navigationItem(int i) {
			return getRuleContext(NavigationItemContext.class,i);
		}
		public NavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigation; }
	}

	public final NavigationContext navigation() throws RecognitionException {
		NavigationContext _localctx = new NavigationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_navigation);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTNavigationBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.navigationBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(NAVIGATION1862666772);
			setState(218);
			match(LCURLY);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				((NavigationContext)_localctx).tmp0 = navigationItem();
				addToIteratedAttributeIfNotNull(_builder.getNavigationItemList(), _localctx.tmp0.ret);
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			setState(226);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigationItemContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTNavigationItem ret = null;
		public Token tmp0;
		public NavigationItemContext tmp1;
		public TerminalNode SEMI() { return getToken(WebsiteAntlrParser.SEMI, 0); }
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public List<NavigationItemContext> navigationItem() {
			return getRuleContexts(NavigationItemContext.class);
		}
		public NavigationItemContext navigationItem(int i) {
			return getRuleContext(NavigationItemContext.class,i);
		}
		public NavigationItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationItem; }
	}

	public final NavigationItemContext navigationItem() throws RecognitionException {
		NavigationItemContext _localctx = new NavigationItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_navigationItem);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTNavigationItemBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.navigationItemBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228);
			((NavigationItemContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((NavigationItemContext)_localctx).tmp0));
			}
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(231);
				match(SEMI);
				}
				break;
			case LCURLY:
				{
				{
				setState(232);
				match(LCURLY);
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(233);
					((NavigationItemContext)_localctx).tmp1 = navigationItem();
					addToIteratedAttributeIfNotNull(_builder.getSubItemList(), _localctx.tmp1.ret);
					}
					}
					setState(238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Name );
				setState(240);
				match(RCURLY);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PageContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTPage ret = null;
		public Token tmp0;
		public Token tmp1;
		public PageContentContext tmp2;
		public TerminalNode PAGE3433103() { return getToken(WebsiteAntlrParser.PAGE3433103, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public PageContentContext pageContent() {
			return getRuleContext(PageContentContext.class,0);
		}
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public TerminalNode SEMI() { return getToken(WebsiteAntlrParser.SEMI, 0); }
		public TerminalNode START109757538() { return getToken(WebsiteAntlrParser.START109757538, 0); }
		public TerminalNode String() { return getToken(WebsiteAntlrParser.String, 0); }
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_page);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTPageBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.pageBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START109757538) {
				{
				{
				setState(244);
				match(START109757538);

				_builder.setStart(true);

				}
				}
			}

			setState(248);
			match(PAGE3433103);
			{
			setState(249);
			((PageContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((PageContext)_localctx).tmp0));
			}
			setState(252);
			match(LCURLY);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				{
				setState(253);
				((PageContext)_localctx).tmp1 = match(String);
				_builder.setTitle(convertString(((PageContext)_localctx).tmp1));
				}
				setState(256);
				match(SEMI);
				}
			}

			setState(259);
			((PageContext)_localctx).tmp2 = pageContent();
			_builder.setPageContent(_localctx.tmp2.ret);
			setState(261);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PageContentContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTPageContent ret = null;
		public PageContentElementContext tmp0;
		public TerminalNode CONTENT951530617() { return getToken(WebsiteAntlrParser.CONTENT951530617, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public List<PageContentElementContext> pageContentElement() {
			return getRuleContexts(PageContentElementContext.class);
		}
		public PageContentElementContext pageContentElement(int i) {
			return getRuleContext(PageContentElementContext.class,i);
		}
		public PageContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageContent; }
	}

	public final PageContentContext pageContent() throws RecognitionException {
		PageContentContext _localctx = new PageContentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pageContent);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTPageContentBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.pageContentBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(CONTENT951530617);
			setState(264);
			match(LCURLY);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANDIMAGE1392157232) | (1L << PIC110986) | (1L << TEXTBLOCK3230384992) | (1L << MINUSGT) | (1L << ASIDE93111608) | (1L << CODEBLOCK3140932256) | (1L << ROW113114) | (1L << CARD3046160) | (1L << TABLE110115790) | (1L << String))) != 0)) {
				{
				{
				setState(265);
				((PageContentContext)_localctx).tmp0 = pageContentElement();
				addToIteratedAttributeIfNotNull(_builder.getPageContentElementList(), _localctx.tmp0.ret);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTLink ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode MINUSGT() { return getToken(WebsiteAntlrParser.MINUSGT, 0); }
		public TerminalNode SEMI() { return getToken(WebsiteAntlrParser.SEMI, 0); }
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public TerminalNode String() { return getToken(WebsiteAntlrParser.String, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_link);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTLinkBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.linkBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(MINUSGT);
			{
			setState(276);
			((LinkContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((LinkContext)_localctx).tmp0));
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				{
				setState(279);
				((LinkContext)_localctx).tmp1 = match(String);
				_builder.setTitle(convertString(((LinkContext)_localctx).tmp1));
				}
				}
			}

			setState(283);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PictureContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTPicture ret = null;
		public Token tmp0;
		public SignedNatLiteralContext tmp1;
		public SignedNatLiteralContext tmp2;
		public TerminalNode PIC110986() { return getToken(WebsiteAntlrParser.PIC110986, 0); }
		public TerminalNode X120() { return getToken(WebsiteAntlrParser.X120, 0); }
		public TerminalNode SEMI() { return getToken(WebsiteAntlrParser.SEMI, 0); }
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public List<SignedNatLiteralContext> signedNatLiteral() {
			return getRuleContexts(SignedNatLiteralContext.class);
		}
		public SignedNatLiteralContext signedNatLiteral(int i) {
			return getRuleContext(SignedNatLiteralContext.class,i);
		}
		public PictureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_picture; }
	}

	public final PictureContext picture() throws RecognitionException {
		PictureContext _localctx = new PictureContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_picture);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTPictureBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.pictureBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(PIC110986);
			{
			setState(286);
			((PictureContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((PictureContext)_localctx).tmp0));
			}
			{
			setState(289);
			((PictureContext)_localctx).tmp1 = signedNatLiteral();
			_builder.setWidth(_localctx.tmp1.ret);
			}
			setState(292);
			match(X120);
			{
			setState(293);
			((PictureContext)_localctx).tmp2 = signedNatLiteral();
			_builder.setHeight(_localctx.tmp2.ret);
			}
			setState(296);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParagraphContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTParagraph ret = null;
		public Token tmp0;
		public TerminalNode SEMI() { return getToken(WebsiteAntlrParser.SEMI, 0); }
		public TerminalNode String() { return getToken(WebsiteAntlrParser.String, 0); }
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_paragraph);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTParagraphBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.paragraphBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(298);
			((ParagraphContext)_localctx).tmp0 = match(String);
			_builder.setText(convertString(((ParagraphContext)_localctx).tmp0));
			}
			setState(301);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextBlockContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTTextBlock ret = null;
		public Token tmp0;
		public ParagraphContext tmp1;
		public TerminalNode TEXTBLOCK3230384992() { return getToken(WebsiteAntlrParser.TEXTBLOCK3230384992, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public TerminalNode String() { return getToken(WebsiteAntlrParser.String, 0); }
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public TextBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textBlock; }
	}

	public final TextBlockContext textBlock() throws RecognitionException {
		TextBlockContext _localctx = new TextBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_textBlock);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTTextBlockBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.textBlockBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(TEXTBLOCK3230384992);
			setState(304);
			match(LCURLY);
			{
			setState(305);
			((TextBlockContext)_localctx).tmp0 = match(String);
			_builder.setTitle(convertString(((TextBlockContext)_localctx).tmp0));
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String) {
				{
				{
				setState(308);
				((TextBlockContext)_localctx).tmp1 = paragraph();
				addToIteratedAttributeIfNotNull(_builder.getParagraphList(), _localctx.tmp1.ret);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTCodeBlock ret = null;
		public ParagraphContext tmp0;
		public TerminalNode CODEBLOCK3140932256() { return getToken(WebsiteAntlrParser.CODEBLOCK3140932256, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_codeBlock);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTCodeBlockBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.codeBlockBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(CODEBLOCK3140932256);
			setState(319);
			match(LCURLY);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String) {
				{
				{
				setState(320);
				((CodeBlockContext)_localctx).tmp0 = paragraph();
				addToIteratedAttributeIfNotNull(_builder.getParagraphList(), _localctx.tmp0.ret);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsideContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTAside ret = null;
		public PageContentElementContext tmp0;
		public TerminalNode ASIDE93111608() { return getToken(WebsiteAntlrParser.ASIDE93111608, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public List<PageContentElementContext> pageContentElement() {
			return getRuleContexts(PageContentElementContext.class);
		}
		public PageContentElementContext pageContentElement(int i) {
			return getRuleContext(PageContentElementContext.class,i);
		}
		public AsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aside; }
	}

	public final AsideContext aside() throws RecognitionException {
		AsideContext _localctx = new AsideContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_aside);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTAsideBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.asideBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ASIDE93111608);
			setState(331);
			match(LCURLY);
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				((AsideContext)_localctx).tmp0 = pageContentElement();
				addToIteratedAttributeIfNotNull(_builder.getSubItemList(), _localctx.tmp0.ret);
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANDIMAGE1392157232) | (1L << PIC110986) | (1L << TEXTBLOCK3230384992) | (1L << MINUSGT) | (1L << ASIDE93111608) | (1L << CODEBLOCK3140932256) | (1L << ROW113114) | (1L << CARD3046160) | (1L << TABLE110115790) | (1L << String))) != 0) );
			setState(339);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTRow ret = null;
		public PageContentElementContext tmp0;
		public TerminalNode ROW113114() { return getToken(WebsiteAntlrParser.ROW113114, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public List<PageContentElementContext> pageContentElement() {
			return getRuleContexts(PageContentElementContext.class);
		}
		public PageContentElementContext pageContentElement(int i) {
			return getRuleContext(PageContentElementContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_row);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTRowBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.rowBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ROW113114);
			setState(342);
			match(LCURLY);
			setState(346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				((RowContext)_localctx).tmp0 = pageContentElement();
				addToIteratedAttributeIfNotNull(_builder.getPageContentElementList(), _localctx.tmp0.ret);
				}
				}
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANDIMAGE1392157232) | (1L << PIC110986) | (1L << TEXTBLOCK3230384992) | (1L << MINUSGT) | (1L << ASIDE93111608) | (1L << CODEBLOCK3140932256) | (1L << ROW113114) | (1L << CARD3046160) | (1L << TABLE110115790) | (1L << String))) != 0) );
			setState(350);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LandImageContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTLandImage ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public TerminalNode LANDIMAGE1392157232() { return getToken(WebsiteAntlrParser.LANDIMAGE1392157232, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public List<TerminalNode> SEMI() { return getTokens(WebsiteAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(WebsiteAntlrParser.SEMI, i);
		}
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public List<TerminalNode> String() { return getTokens(WebsiteAntlrParser.String); }
		public TerminalNode String(int i) {
			return getToken(WebsiteAntlrParser.String, i);
		}
		public LandImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_landImage; }
	}

	public final LandImageContext landImage() throws RecognitionException {
		LandImageContext _localctx = new LandImageContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_landImage);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTLandImageBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.landImageBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(LANDIMAGE1392157232);
			setState(353);
			match(LCURLY);
			{
			setState(354);
			((LandImageContext)_localctx).tmp0 = match(String);
			_builder.setTitle(convertString(((LandImageContext)_localctx).tmp0));
			}
			setState(357);
			match(SEMI);
			{
			setState(358);
			((LandImageContext)_localctx).tmp1 = match(String);
			_builder.setSubtitle(convertString(((LandImageContext)_localctx).tmp1));
			}
			setState(361);
			match(SEMI);
			{
			setState(362);
			((LandImageContext)_localctx).tmp2 = match(String);
			_builder.setPicture(convertString(((LandImageContext)_localctx).tmp2));
			}
			setState(365);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CardContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTCard ret = null;
		public Token tmp0;
		public Token tmp1;
		public ParagraphContext tmp2;
		public Token tmp3;
		public TerminalNode CARD3046160() { return getToken(WebsiteAntlrParser.CARD3046160, 0); }
		public TerminalNode LCURLY() { return getToken(WebsiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(WebsiteAntlrParser.RCURLY, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public List<TerminalNode> String() { return getTokens(WebsiteAntlrParser.String); }
		public TerminalNode String(int i) {
			return getToken(WebsiteAntlrParser.String, i);
		}
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_card);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTCardBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.cardBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(CARD3046160);
			setState(368);
			match(LCURLY);
			{
			setState(369);
			((CardContext)_localctx).tmp0 = match(String);
			_builder.setTitle(convertString(((CardContext)_localctx).tmp0));
			}
			{
			setState(372);
			((CardContext)_localctx).tmp1 = match(String);
			_builder.setPicture(convertString(((CardContext)_localctx).tmp1));
			}
			setState(375);
			((CardContext)_localctx).tmp2 = paragraph();
			_builder.setParagraph(_localctx.tmp2.ret);
			{
			setState(377);
			((CardContext)_localctx).tmp3 = match(String);
			_builder.setLink(convertString(((CardContext)_localctx).tmp3));
			}
			setState(380);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTTable ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode TABLE110115790() { return getToken(WebsiteAntlrParser.TABLE110115790, 0); }
		public TerminalNode SEMI() { return getToken(WebsiteAntlrParser.SEMI, 0); }
		public List<TerminalNode> String() { return getTokens(WebsiteAntlrParser.String); }
		public TerminalNode String(int i) {
			return getToken(WebsiteAntlrParser.String, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_table);
		// getActionForAltBeforeRuleBody
		de.monticore.gettingstarted.website._ast.ASTTableBuilder _builder = de.monticore.gettingstarted.website.WebsiteMill.tableBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(TABLE110115790);
			{
			setState(383);
			((TableContext)_localctx).tmp0 = match(String);
			_builder.setTitle(convertString(((TableContext)_localctx).tmp0));
			}
			{
			setState(386);
			((TableContext)_localctx).tmp1 = match(String);
			_builder.setFileName(convertString(((TableContext)_localctx).tmp1));
			}
			setState(389);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret;
		public NumericLiteralContext tmp2;
		public NullLiteralContext tmp3;
		public BooleanLiteralContext tmp4;
		public CharLiteralContext tmp5;
		public StringLiteralContext tmp6;
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				((LiteralContext)_localctx).tmp2 = numericLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp2.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				((LiteralContext)_localctx).tmp3 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp3.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				((LiteralContext)_localctx).tmp4 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp4.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				((LiteralContext)_localctx).tmp5 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				((LiteralContext)_localctx).tmp6 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp6.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ret;
		public SignedNumericLiteralContext tmp7;
		public NullLiteralContext tmp3;
		public BooleanLiteralContext tmp4;
		public CharLiteralContext tmp5;
		public StringLiteralContext tmp6;
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SignedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral; }
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_signedLiteral);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				((SignedLiteralContext)_localctx).tmp7 = signedNumericLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				((SignedLiteralContext)_localctx).tmp3 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp3.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				((SignedLiteralContext)_localctx).tmp4 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp4.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				((SignedLiteralContext)_localctx).tmp5 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				((SignedLiteralContext)_localctx).tmp6 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp6.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ret;
		public NatLiteralContext tmp8;
		public BasicLongLiteralContext tmp9;
		public BasicFloatLiteralContext tmp10;
		public BasicDoubleLiteralContext tmp11;
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_numericLiteral);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				((NumericLiteralContext)_localctx).tmp8 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp8.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				((NumericLiteralContext)_localctx).tmp9 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp9.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				((NumericLiteralContext)_localctx).tmp10 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				((NumericLiteralContext)_localctx).tmp11 = basicDoubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedNumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ret;
		public SignedNatLiteralContext tmp12;
		public SignedBasicLongLiteralContext tmp13;
		public SignedBasicFloatLiteralContext tmp14;
		public SignedBasicDoubleLiteralContext tmp15;
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedNumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral; }
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_signedNumericLiteral);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				((SignedNumericLiteralContext)_localctx).tmp12 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				((SignedNumericLiteralContext)_localctx).tmp13 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp13.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				((SignedNumericLiteralContext)_localctx).tmp14 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp14.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				((SignedNumericLiteralContext)_localctx).tmp15 = signedBasicDoubleLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp15.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WebsiteElementContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTWebsiteElement ret;
		public NavigationContext tmp16;
		public NavigationItemContext tmp17;
		public PageContext tmp18;
		public NavigationContext navigation() {
			return getRuleContext(NavigationContext.class,0);
		}
		public NavigationItemContext navigationItem() {
			return getRuleContext(NavigationItemContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public WebsiteElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_websiteElement; }
	}

	public final WebsiteElementContext websiteElement() throws RecognitionException {
		WebsiteElementContext _localctx = new WebsiteElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_websiteElement);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAVIGATION1862666772:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				((WebsiteElementContext)_localctx).tmp16 = navigation();
				((WebsiteElementContext)_localctx).ret = ((WebsiteElementContext)_localctx).tmp16.ret;
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				((WebsiteElementContext)_localctx).tmp17 = navigationItem();
				((WebsiteElementContext)_localctx).ret = ((WebsiteElementContext)_localctx).tmp17.ret;
				}
				break;
			case START109757538:
			case PAGE3433103:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				((WebsiteElementContext)_localctx).tmp18 = page();
				((WebsiteElementContext)_localctx).ret = ((WebsiteElementContext)_localctx).tmp18.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PageContentElementContext extends ParserRuleContext {
		public de.monticore.gettingstarted.website._ast.ASTPageContentElement ret;
		public LinkContext tmp19;
		public PictureContext tmp20;
		public ParagraphContext tmp21;
		public TextBlockContext tmp22;
		public CodeBlockContext tmp23;
		public AsideContext tmp24;
		public RowContext tmp25;
		public LandImageContext tmp26;
		public CardContext tmp27;
		public TableContext tmp28;
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public PictureContext picture() {
			return getRuleContext(PictureContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TextBlockContext textBlock() {
			return getRuleContext(TextBlockContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AsideContext aside() {
			return getRuleContext(AsideContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public LandImageContext landImage() {
			return getRuleContext(LandImageContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public PageContentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageContentElement; }
	}

	public final PageContentElementContext pageContentElement() throws RecognitionException {
		PageContentElementContext _localctx = new PageContentElementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pageContentElement);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUSGT:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				((PageContentElementContext)_localctx).tmp19 = link();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp19.ret;
				}
				break;
			case PIC110986:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				((PageContentElementContext)_localctx).tmp20 = picture();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp20.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				((PageContentElementContext)_localctx).tmp21 = paragraph();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp21.ret;
				}
				break;
			case TEXTBLOCK3230384992:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				((PageContentElementContext)_localctx).tmp22 = textBlock();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp22.ret;
				}
				break;
			case CODEBLOCK3140932256:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				((PageContentElementContext)_localctx).tmp23 = codeBlock();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp23.ret;
				}
				break;
			case ASIDE93111608:
				enterOuterAlt(_localctx, 6);
				{
				setState(479);
				((PageContentElementContext)_localctx).tmp24 = aside();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp24.ret;
				}
				break;
			case ROW113114:
				enterOuterAlt(_localctx, 7);
				{
				setState(482);
				((PageContentElementContext)_localctx).tmp25 = row();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp25.ret;
				}
				break;
			case LANDIMAGE1392157232:
				enterOuterAlt(_localctx, 8);
				{
				setState(485);
				((PageContentElementContext)_localctx).tmp26 = landImage();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp26.ret;
				}
				break;
			case CARD3046160:
				enterOuterAlt(_localctx, 9);
				{
				setState(488);
				((PageContentElementContext)_localctx).tmp27 = card();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp27.ret;
				}
				break;
			case TABLE110115790:
				enterOuterAlt(_localctx, 10);
				{
				setState(491);
				((PageContentElementContext)_localctx).tmp28 = table();
				((PageContentElementContext)_localctx).ret = ((PageContentElementContext)_localctx).tmp28.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nokeyword_f102Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public Nokeyword_f102Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_f102; }
	}

	public final Nokeyword_f102Context nokeyword_f102() throws RecognitionException {
		Nokeyword_f102Context _localctx = new Nokeyword_f102Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_nokeyword_f102);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			if (!(next("f"))) throw new FailedPredicateException(this, "next(\"f\")");
			setState(497);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nokeyword_F70Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public Nokeyword_F70Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_F70; }
	}

	public final Nokeyword_F70Context nokeyword_F70() throws RecognitionException {
		Nokeyword_F70Context _localctx = new Nokeyword_F70Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_nokeyword_F70);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			if (!(next("F"))) throw new FailedPredicateException(this, "next(\"F\")");
			setState(500);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nokeyword_l108Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public Nokeyword_l108Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_l108; }
	}

	public final Nokeyword_l108Context nokeyword_l108() throws RecognitionException {
		Nokeyword_l108Context _localctx = new Nokeyword_l108Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_nokeyword_l108);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			if (!(next("l"))) throw new FailedPredicateException(this, "next(\"l\")");
			setState(503);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nokeyword_L76Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(WebsiteAntlrParser.Name, 0); }
		public Nokeyword_L76Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_L76; }
	}

	public final Nokeyword_L76Context nokeyword_L76() throws RecognitionException {
		Nokeyword_L76Context _localctx = new Nokeyword_L76Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_nokeyword_L76);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			if (!(next("L"))) throw new FailedPredicateException(this, "next(\"L\")");
			setState(506);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return signedNatLiteral_sempred((SignedNatLiteralContext)_localctx, predIndex);
		case 6:
			return basicLongLiteral_sempred((BasicLongLiteralContext)_localctx, predIndex);
		case 7:
			return signedBasicLongLiteral_sempred((SignedBasicLongLiteralContext)_localctx, predIndex);
		case 8:
			return basicFloatLiteral_sempred((BasicFloatLiteralContext)_localctx, predIndex);
		case 9:
			return signedBasicFloatLiteral_sempred((SignedBasicFloatLiteralContext)_localctx, predIndex);
		case 10:
			return basicDoubleLiteral_sempred((BasicDoubleLiteralContext)_localctx, predIndex);
		case 11:
			return signedBasicDoubleLiteral_sempred((SignedBasicDoubleLiteralContext)_localctx, predIndex);
		case 33:
			return nokeyword_f102_sempred((Nokeyword_f102Context)_localctx, predIndex);
		case 34:
			return nokeyword_F70_sempred((Nokeyword_F70Context)_localctx, predIndex);
		case 35:
			return nokeyword_l108_sempred((Nokeyword_l108Context)_localctx, predIndex);
		case 36:
			return nokeyword_L76_sempred((Nokeyword_L76Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean signedNatLiteral_sempred(SignedNatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noSpace(2);
		}
		return true;
	}
	private boolean basicLongLiteral_sempred(BasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return cmpToken(2,"l","L") && noSpace(2);
		}
		return true;
	}
	private boolean signedBasicLongLiteral_sempred(SignedBasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return cmpToken(3,"l","L") && noSpace(2,3);
		case 3:
			return cmpToken(2,"l","L") && noSpace(2);
		}
		return true;
	}
	private boolean basicFloatLiteral_sempred(BasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return cmpToken(4,"f","F") && noSpace(2,3,4);
		}
		return true;
	}
	private boolean signedBasicFloatLiteral_sempred(SignedBasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return cmpToken(5,"f","F") && noSpace(2,3,4,5);
		case 6:
			return cmpToken(4,"f","F") && noSpace(2,3,4);
		}
		return true;
	}
	private boolean basicDoubleLiteral_sempred(BasicDoubleLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return noSpace(2,3);
		}
		return true;
	}
	private boolean signedBasicDoubleLiteral_sempred(SignedBasicDoubleLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return noSpace(2,3,4);
		case 9:
			return noSpace(2,3);
		}
		return true;
	}
	private boolean nokeyword_f102_sempred(Nokeyword_f102Context _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return next("f");
		}
		return true;
	}
	private boolean nokeyword_F70_sempred(Nokeyword_F70Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return next("F");
		}
		return true;
	}
	private boolean nokeyword_l108_sempred(Nokeyword_l108Context _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return next("l");
		}
		return true;
	}
	private boolean nokeyword_L76_sempred(Nokeyword_L76Context _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return next("L");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u01ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\5\3S\n\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\ty\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\5\t\u0083\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00aa\n\13\5\13\u00ac\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c7\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00d1\n\16\3\16\3\16\3\16\6\16\u00d6\n\16\r\16"+
		"\16\16\u00d7\3\16\3\16\3\17\3\17\3\17\3\17\3\17\6\17\u00e1\n\17\r\17\16"+
		"\17\u00e2\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00ef"+
		"\n\20\r\20\16\20\u00f0\3\20\3\20\5\20\u00f5\n\20\3\21\3\21\5\21\u00f9"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0104\n\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u010f\n\22\f\22\16\22\u0112"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011c\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u013a"+
		"\n\26\f\26\16\26\u013d\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u0146"+
		"\n\27\f\27\16\27\u0149\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\6\30\u0152"+
		"\n\30\r\30\16\30\u0153\3\30\3\30\3\31\3\31\3\31\3\31\3\31\6\31\u015d\n"+
		"\31\r\31\16\31\u015e\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0199\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01aa\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01b8\n\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01c6\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u01d1\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01f1"+
		"\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\2\2\u020a\2L\3\2\2"+
		"\2\4R\3\2\2\2\6T\3\2\2\2\bW\3\2\2\2\nZ\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2"+
		"\20\u0082\3\2\2\2\22\u0084\3\2\2\2\24\u00ab\3\2\2\2\26\u00ad\3\2\2\2\30"+
		"\u00c6\3\2\2\2\32\u00c8\3\2\2\2\34\u00db\3\2\2\2\36\u00e6\3\2\2\2 \u00f8"+
		"\3\2\2\2\"\u0109\3\2\2\2$\u0115\3\2\2\2&\u011f\3\2\2\2(\u012c\3\2\2\2"+
		"*\u0131\3\2\2\2,\u0140\3\2\2\2.\u014c\3\2\2\2\60\u0157\3\2\2\2\62\u0162"+
		"\3\2\2\2\64\u0171\3\2\2\2\66\u0180\3\2\2\28\u0198\3\2\2\2:\u01a9\3\2\2"+
		"\2<\u01b7\3\2\2\2>\u01c5\3\2\2\2@\u01d0\3\2\2\2B\u01f0\3\2\2\2D\u01f2"+
		"\3\2\2\2F\u01f5\3\2\2\2H\u01f8\3\2\2\2J\u01fb\3\2\2\2LM\7\r\2\2M\3\3\2"+
		"\2\2NO\7\30\2\2OS\b\3\1\2PQ\7\31\2\2QS\b\3\1\2RN\3\2\2\2RP\3\2\2\2S\5"+
		"\3\2\2\2TU\7\35\2\2UV\b\4\1\2V\7\3\2\2\2WX\7\33\2\2XY\b\5\1\2Y\t\3\2\2"+
		"\2Z[\7\32\2\2[\\\b\6\1\2\\\13\3\2\2\2]^\6\7\2\2^_\7\b\2\2_`\b\7\1\2`a"+
		"\3\2\2\2ab\7\32\2\2bf\b\7\1\2cd\7\32\2\2df\b\7\1\2e]\3\2\2\2ec\3\2\2\2"+
		"f\r\3\2\2\2gh\6\b\3\2hi\7\32\2\2ij\b\b\1\2jm\3\2\2\2kn\5H%\2ln\5J&\2m"+
		"k\3\2\2\2ml\3\2\2\2n\17\3\2\2\2op\6\t\4\2pq\7\b\2\2qr\b\t\1\2rs\3\2\2"+
		"\2st\7\32\2\2tu\b\t\1\2ux\3\2\2\2vy\5H%\2wy\5J&\2xv\3\2\2\2xw\3\2\2\2"+
		"y\u0083\3\2\2\2z{\6\t\5\2{|\7\32\2\2|}\b\t\1\2}\u0080\3\2\2\2~\u0081\5"+
		"H%\2\177\u0081\5J&\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0083\3\2"+
		"\2\2\u0082o\3\2\2\2\u0082z\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085\6\n\6"+
		"\2\u0085\u0086\7\32\2\2\u0086\u0087\b\n\1\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\7\t\2\2\u0089\u008a\7\32\2\2\u008a\u008b\b\n\1\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008f\5D#\2\u008d\u008f\5F$\2\u008e\u008c\3\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\23\3\2\2\2\u0090\u0091\6\13\7\2\u0091\u0092\7\b\2\2\u0092"+
		"\u0093\b\13\1\2\u0093\u0094\3\2\2\2\u0094\u0095\7\32\2\2\u0095\u0096\b"+
		"\13\1\2\u0096\u0097\3\2\2\2\u0097\u0098\7\t\2\2\u0098\u0099\7\32\2\2\u0099"+
		"\u009a\b\13\1\2\u009a\u009d\3\2\2\2\u009b\u009e\5D#\2\u009c\u009e\5F$"+
		"\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00ac\3\2\2\2\u009f\u00a0"+
		"\6\13\b\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\b\13\1\2\u00a2\u00a3\3\2\2"+
		"\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a6\b\13\1\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00aa\5D#\2\u00a8\u00aa\5F$\2\u00a9\u00a7\3\2\2\2"+
		"\u00a9\u00a8\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u0090\3\2\2\2\u00ab\u009f"+
		"\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\6\f\t\2\u00ae\u00af\7\32\2\2\u00af"+
		"\u00b0\b\f\1\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3\7\32"+
		"\2\2\u00b3\u00b4\b\f\1\2\u00b4\27\3\2\2\2\u00b5\u00b6\6\r\n\2\u00b6\u00b7"+
		"\7\b\2\2\u00b7\u00b8\b\r\1\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\32\2\2"+
		"\u00ba\u00bb\b\r\1\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be"+
		"\7\32\2\2\u00be\u00c7\b\r\1\2\u00bf\u00c0\6\r\13\2\u00c0\u00c1\7\32\2"+
		"\2\u00c1\u00c2\b\r\1\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5"+
		"\7\32\2\2\u00c5\u00c7\b\r\1\2\u00c6\u00b5\3\2\2\2\u00c6\u00bf\3\2\2\2"+
		"\u00c7\31\3\2\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\7\34\2\2\u00ca\u00cb"+
		"\b\16\1\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\7\21\2\2\u00cd\u00ce\5\34\17"+
		"\2\u00ce\u00cf\b\16\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d3\5 \21\2\u00d3\u00d4\b\16"+
		"\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\25"+
		"\2\2\u00da\33\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\u00e0\7\21\2\2\u00dd\u00de"+
		"\5\36\20\2\u00de\u00df\b\17\1\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3\2\2"+
		"\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\7\25\2\2\u00e5\35\3\2\2\2\u00e6\u00e7\7\34\2\2\u00e7"+
		"\u00e8\b\20\1\2\u00e8\u00f4\3\2\2\2\u00e9\u00f5\7\22\2\2\u00ea\u00ee\7"+
		"\21\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\b\20\1\2\u00ed\u00ef\3\2\2\2"+
		"\u00ee\u00eb\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\25\2\2\u00f3\u00f5\3\2\2\2"+
		"\u00f4\u00e9\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00f7"+
		"\7\4\2\2\u00f7\u00f9\b\21\1\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\23\2\2\u00fb\u00fc\7\34\2\2\u00fc\u00fd"+
		"\b\21\1\2\u00fd\u00fe\3\2\2\2\u00fe\u0103\7\21\2\2\u00ff\u0100\7\33\2"+
		"\2\u0100\u0101\b\21\1\2\u0101\u0102\3\2\2\2\u0102\u0104\7\22\2\2\u0103"+
		"\u00ff\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\5\""+
		"\22\2\u0106\u0107\b\21\1\2\u0107\u0108\7\25\2\2\u0108!\3\2\2\2\u0109\u010a"+
		"\7\n\2\2\u010a\u0110\7\21\2\2\u010b\u010c\5B\"\2\u010c\u010d\b\22\1\2"+
		"\u010d\u010f\3\2\2\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\7\25\2\2\u0114#\3\2\2\2\u0115\u0116\7\13\2\2\u0116\u0117\7\34\2"+
		"\2\u0117\u0118\b\23\1\2\u0118\u011b\3\2\2\2\u0119\u011a\7\33\2\2\u011a"+
		"\u011c\b\23\1\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011e\7\22\2\2\u011e%\3\2\2\2\u011f\u0120\7\6\2\2\u0120\u0121"+
		"\7\34\2\2\u0121\u0122\b\24\1\2\u0122\u0123\3\2\2\2\u0123\u0124\5\f\7\2"+
		"\u0124\u0125\b\24\1\2\u0125\u0126\3\2\2\2\u0126\u0127\7\20\2\2\u0127\u0128"+
		"\5\f\7\2\u0128\u0129\b\24\1\2\u0129\u012a\3\2\2\2\u012a\u012b\7\22\2\2"+
		"\u012b\'\3\2\2\2\u012c\u012d\7\33\2\2\u012d\u012e\b\25\1\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\7\22\2\2\u0130)\3\2\2\2\u0131\u0132\7\7\2\2\u0132"+
		"\u0133\7\21\2\2\u0133\u0134\7\33\2\2\u0134\u0135\b\26\1\2\u0135\u013b"+
		"\3\2\2\2\u0136\u0137\5(\25\2\u0137\u0138\b\26\1\2\u0138\u013a\3\2\2\2"+
		"\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7\25\2\2"+
		"\u013f+\3\2\2\2\u0140\u0141\7\17\2\2\u0141\u0147\7\21\2\2\u0142\u0143"+
		"\5(\25\2\u0143\u0144\b\27\1\2\u0144\u0146\3\2\2\2\u0145\u0142\3\2\2\2"+
		"\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\25\2\2\u014b-\3\2\2\2\u014c"+
		"\u014d\7\16\2\2\u014d\u0151\7\21\2\2\u014e\u014f\5B\"\2\u014f\u0150\b"+
		"\30\1\2\u0150\u0152\3\2\2\2\u0151\u014e\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\25"+
		"\2\2\u0156/\3\2\2\2\u0157\u0158\7\24\2\2\u0158\u015c\7\21\2\2\u0159\u015a"+
		"\5B\"\2\u015a\u015b\b\31\1\2\u015b\u015d\3\2\2\2\u015c\u0159\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\7\25\2\2\u0161\61\3\2\2\2\u0162\u0163\7\5\2\2\u0163\u0164"+
		"\7\21\2\2\u0164\u0165\7\33\2\2\u0165\u0166\b\32\1\2\u0166\u0167\3\2\2"+
		"\2\u0167\u0168\7\22\2\2\u0168\u0169\7\33\2\2\u0169\u016a\b\32\1\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016c\7\22\2\2\u016c\u016d\7\33\2\2\u016d\u016e\b"+
		"\32\1\2\u016e\u016f\3\2\2\2\u016f\u0170\7\25\2\2\u0170\63\3\2\2\2\u0171"+
		"\u0172\7\26\2\2\u0172\u0173\7\21\2\2\u0173\u0174\7\33\2\2\u0174\u0175"+
		"\b\33\1\2\u0175\u0176\3\2\2\2\u0176\u0177\7\33\2\2\u0177\u0178\b\33\1"+
		"\2\u0178\u0179\3\2\2\2\u0179\u017a\5(\25\2\u017a\u017b\b\33\1\2\u017b"+
		"\u017c\7\33\2\2\u017c\u017d\b\33\1\2\u017d\u017e\3\2\2\2\u017e\u017f\7"+
		"\25\2\2\u017f\65\3\2\2\2\u0180\u0181\7\27\2\2\u0181\u0182\7\33\2\2\u0182"+
		"\u0183\b\34\1\2\u0183\u0184\3\2\2\2\u0184\u0185\7\33\2\2\u0185\u0186\b"+
		"\34\1\2\u0186\u0187\3\2\2\2\u0187\u0188\7\22\2\2\u0188\67\3\2\2\2\u0189"+
		"\u018a\5<\37\2\u018a\u018b\b\35\1\2\u018b\u0199\3\2\2\2\u018c\u018d\5"+
		"\2\2\2\u018d\u018e\b\35\1\2\u018e\u0199\3\2\2\2\u018f\u0190\5\4\3\2\u0190"+
		"\u0191\b\35\1\2\u0191\u0199\3\2\2\2\u0192\u0193\5\6\4\2\u0193\u0194\b"+
		"\35\1\2\u0194\u0199\3\2\2\2\u0195\u0196\5\b\5\2\u0196\u0197\b\35\1\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0189\3\2\2\2\u0198\u018c\3\2\2\2\u0198\u018f\3\2"+
		"\2\2\u0198\u0192\3\2\2\2\u0198\u0195\3\2\2\2\u01999\3\2\2\2\u019a\u019b"+
		"\5> \2\u019b\u019c\b\36\1\2\u019c\u01aa\3\2\2\2\u019d\u019e\5\2\2\2\u019e"+
		"\u019f\b\36\1\2\u019f\u01aa\3\2\2\2\u01a0\u01a1\5\4\3\2\u01a1\u01a2\b"+
		"\36\1\2\u01a2\u01aa\3\2\2\2\u01a3\u01a4\5\6\4\2\u01a4\u01a5\b\36\1\2\u01a5"+
		"\u01aa\3\2\2\2\u01a6\u01a7\5\b\5\2\u01a7\u01a8\b\36\1\2\u01a8\u01aa\3"+
		"\2\2\2\u01a9\u019a\3\2\2\2\u01a9\u019d\3\2\2\2\u01a9\u01a0\3\2\2\2\u01a9"+
		"\u01a3\3\2\2\2\u01a9\u01a6\3\2\2\2\u01aa;\3\2\2\2\u01ab\u01ac\5\n\6\2"+
		"\u01ac\u01ad\b\37\1\2\u01ad\u01b8\3\2\2\2\u01ae\u01af\5\16\b\2\u01af\u01b0"+
		"\b\37\1\2\u01b0\u01b8\3\2\2\2\u01b1\u01b2\5\22\n\2\u01b2\u01b3\b\37\1"+
		"\2\u01b3\u01b8\3\2\2\2\u01b4\u01b5\5\26\f\2\u01b5\u01b6\b\37\1\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01ab\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b1\3\2"+
		"\2\2\u01b7\u01b4\3\2\2\2\u01b8=\3\2\2\2\u01b9\u01ba\5\f\7\2\u01ba\u01bb"+
		"\b \1\2\u01bb\u01c6\3\2\2\2\u01bc\u01bd\5\20\t\2\u01bd\u01be\b \1\2\u01be"+
		"\u01c6\3\2\2\2\u01bf\u01c0\5\24\13\2\u01c0\u01c1\b \1\2\u01c1\u01c6\3"+
		"\2\2\2\u01c2\u01c3\5\30\r\2\u01c3\u01c4\b \1\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01b9\3\2\2\2\u01c5\u01bc\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c5\u01c2\3\2"+
		"\2\2\u01c6?\3\2\2\2\u01c7\u01c8\5\34\17\2\u01c8\u01c9\b!\1\2\u01c9\u01d1"+
		"\3\2\2\2\u01ca\u01cb\5\36\20\2\u01cb\u01cc\b!\1\2\u01cc\u01d1\3\2\2\2"+
		"\u01cd\u01ce\5 \21\2\u01ce\u01cf\b!\1\2\u01cf\u01d1\3\2\2\2\u01d0\u01c7"+
		"\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d1A\3\2\2\2\u01d2"+
		"\u01d3\5$\23\2\u01d3\u01d4\b\"\1\2\u01d4\u01f1\3\2\2\2\u01d5\u01d6\5&"+
		"\24\2\u01d6\u01d7\b\"\1\2\u01d7\u01f1\3\2\2\2\u01d8\u01d9\5(\25\2\u01d9"+
		"\u01da\b\"\1\2\u01da\u01f1\3\2\2\2\u01db\u01dc\5*\26\2\u01dc\u01dd\b\""+
		"\1\2\u01dd\u01f1\3\2\2\2\u01de\u01df\5,\27\2\u01df\u01e0\b\"\1\2\u01e0"+
		"\u01f1\3\2\2\2\u01e1\u01e2\5.\30\2\u01e2\u01e3\b\"\1\2\u01e3\u01f1\3\2"+
		"\2\2\u01e4\u01e5\5\60\31\2\u01e5\u01e6\b\"\1\2\u01e6\u01f1\3\2\2\2\u01e7"+
		"\u01e8\5\62\32\2\u01e8\u01e9\b\"\1\2\u01e9\u01f1\3\2\2\2\u01ea\u01eb\5"+
		"\64\33\2\u01eb\u01ec\b\"\1\2\u01ec\u01f1\3\2\2\2\u01ed\u01ee\5\66\34\2"+
		"\u01ee\u01ef\b\"\1\2\u01ef\u01f1\3\2\2\2\u01f0\u01d2\3\2\2\2\u01f0\u01d5"+
		"\3\2\2\2\u01f0\u01d8\3\2\2\2\u01f0\u01db\3\2\2\2\u01f0\u01de\3\2\2\2\u01f0"+
		"\u01e1\3\2\2\2\u01f0\u01e4\3\2\2\2\u01f0\u01e7\3\2\2\2\u01f0\u01ea\3\2"+
		"\2\2\u01f0\u01ed\3\2\2\2\u01f1C\3\2\2\2\u01f2\u01f3\6#\f\2\u01f3\u01f4"+
		"\7\34\2\2\u01f4E\3\2\2\2\u01f5\u01f6\6$\r\2\u01f6\u01f7\7\34\2\2\u01f7"+
		"G\3\2\2\2\u01f8\u01f9\6%\16\2\u01f9\u01fa\7\34\2\2\u01faI\3\2\2\2\u01fb"+
		"\u01fc\6&\17\2\u01fc\u01fd\7\34\2\2\u01fdK\3\2\2\2 Remx\u0080\u0082\u008e"+
		"\u009d\u00a9\u00ab\u00c6\u00d0\u00d7\u00e2\u00f0\u00f4\u00f8\u0103\u0110"+
		"\u011b\u013b\u0147\u0153\u015e\u0198\u01a9\u01b7\u01c5\u01d0\u01f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
