// Generated with ANTLR

  package de.monticore.gettingstarted.website._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WebsiteAntlrLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WEBSITE1224335515", "START109757538", "LANDIMAGE1392157232", "PIC110986", 
		"TEXTBLOCK3230384992", "MINUS", "POINT", "CONTENT951530617", "MINUSGT", 
		"NAVIGATION1862666772", "NULL3392903", "ASIDE93111608", "CODEBLOCK3140932256", 
		"X120", "LCURLY", "SEMI", "PAGE3433103", "ROW113114", "RCURLY", "CARD3046160", 
		"TABLE110115790", "TRUE3569038", "FALSE97196323", "Digit", "OctalDigit", 
		"StringCharacters", "SingleCharacter", "NEWLINE", "Digits", "EscapeSequence", 
		"String", "HexDigit", "StringCharacter", "Name", "Char", "ML_COMMENT", 
		"SL_COMMENT", "ZeroToThree", "OctalEscape", "UnicodeEscape", "WS"
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





	private WebsiteAntlrParser _monticore_parser;

	protected WebsiteAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(WebsiteAntlrParser in) {
	  this._monticore_parser = in;
	}

	protected void storeComment(){
	  if (getCompiler() != null) {
	    de.monticore.ast.Comment _comment = new de.monticore.ast.Comment(getText());
	    de.se_rwth.commons.SourcePosition startPos = new de.se_rwth.commons.SourcePosition(_tokenStartLine, _tokenStartCharPositionInLine);
	    _comment.set_SourcePositionStart(startPos);
	    _comment.set_SourcePositionEnd(getCompiler().computeEndPosition(startPos, getText()));
	    getCompiler().addComment(_comment);
	  }
	}


	public WebsiteAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WebsiteAntlrLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 30:
			String_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			Char_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void String_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	private void Char_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			storeComment();


			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			storeComment();


			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\6\33\u00d7\n\33\r\33\16\33\u00d8\3\34\3\34\3\35\3\35\3"+
		"\35\5\35\u00e0\n\35\3\36\6\36\u00e3\n\36\r\36\16\36\u00e4\3\37\3\37\3"+
		"\37\3\37\5\37\u00eb\n\37\3 \3 \5 \u00ef\n \3 \3 \3 \3!\3!\3\"\3\"\5\""+
		"\u00f8\n\"\3#\3#\7#\u00fc\n#\f#\16#\u00ff\13#\3$\3$\3$\5$\u0104\n$\3$"+
		"\3$\3$\3%\3%\3%\3%\7%\u010d\n%\f%\16%\u0110\13%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\7&\u011d\n&\f&\16&\u0120\13&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u0133\n(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"\u010e\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29"+
		"\2;\32=\2?\33A\2C\2E\34G\35I\36K\37M\2O\2Q\2S \3\2\n\3\2))\4\2\f\f\17"+
		"\17\n\2$$))^^ddhhppttvv\5\2\62;CHch\4\2$$^^\6\2&&C\\aac|\7\2&&\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\2\u0140\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5]\3\2\2\2\7c\3\2"+
		"\2\2\tm\3\2\2\2\13q\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0087"+
		"\3\2\2\2\25\u008a\3\2\2\2\27\u0095\3\2\2\2\31\u009a\3\2\2\2\33\u00a0\3"+
		"\2\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b0\3\2\2\2"+
		"%\u00b5\3\2\2\2\'\u00b9\3\2\2\2)\u00bb\3\2\2\2+\u00c0\3\2\2\2-\u00c6\3"+
		"\2\2\2/\u00cb\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2\2\65\u00d6\3\2\2"+
		"\2\67\u00da\3\2\2\29\u00df\3\2\2\2;\u00e2\3\2\2\2=\u00ea\3\2\2\2?\u00ec"+
		"\3\2\2\2A\u00f3\3\2\2\2C\u00f7\3\2\2\2E\u00f9\3\2\2\2G\u0100\3\2\2\2I"+
		"\u0108\3\2\2\2K\u0118\3\2\2\2M\u0125\3\2\2\2O\u0132\3\2\2\2Q\u0134\3\2"+
		"\2\2S\u013b\3\2\2\2UV\7y\2\2VW\7g\2\2WX\7d\2\2XY\7u\2\2YZ\7k\2\2Z[\7v"+
		"\2\2[\\\7g\2\2\\\4\3\2\2\2]^\7u\2\2^_\7v\2\2_`\7c\2\2`a\7t\2\2ab\7v\2"+
		"\2b\6\3\2\2\2cd\7n\2\2de\7c\2\2ef\7p\2\2fg\7f\2\2gh\7K\2\2hi\7o\2\2ij"+
		"\7c\2\2jk\7i\2\2kl\7g\2\2l\b\3\2\2\2mn\7r\2\2no\7k\2\2op\7e\2\2p\n\3\2"+
		"\2\2qr\7v\2\2rs\7g\2\2st\7z\2\2tu\7v\2\2uv\7D\2\2vw\7n\2\2wx\7q\2\2xy"+
		"\7e\2\2yz\7m\2\2z\f\3\2\2\2{|\7/\2\2|\16\3\2\2\2}~\7\60\2\2~\20\3\2\2"+
		"\2\177\u0080\7e\2\2\u0080\u0081\7q\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086"+
		"\22\3\2\2\2\u0087\u0088\7/\2\2\u0088\u0089\7@\2\2\u0089\24\3\2\2\2\u008a"+
		"\u008b\7p\2\2\u008b\u008c\7c\2\2\u008c\u008d\7x\2\2\u008d\u008e\7k\2\2"+
		"\u008e\u008f\7i\2\2\u008f\u0090\7c\2\2\u0090\u0091\7v\2\2\u0091\u0092"+
		"\7k\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094\26\3\2\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u0097\7w\2\2\u0097\u0098\7n\2\2\u0098\u0099\7n\2\2\u0099"+
		"\30\3\2\2\2\u009a\u009b\7c\2\2\u009b\u009c\7u\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7f\2\2\u009e\u009f\7g\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1"+
		"\u00a2\7q\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7D\2\2"+
		"\u00a5\u00a6\7n\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9"+
		"\7m\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7z\2\2\u00ab\36\3\2\2\2\u00ac\u00ad"+
		"\7}\2\2\u00ad \3\2\2\2\u00ae\u00af\7=\2\2\u00af\"\3\2\2\2\u00b0\u00b1"+
		"\7r\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7i\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"$\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7y\2\2\u00b8"+
		"&\3\2\2\2\u00b9\u00ba\7\177\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc"+
		"\u00bd\7c\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7f\2\2\u00bf*\3\2\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7n\2\2"+
		"\u00c4\u00c5\7g\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2"+
		"\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7"+
		"h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\4\62;\2\u00d2\62\3\2\2\2\u00d3\u00d4"+
		"\4\629\2\u00d4\64\3\2\2\2\u00d5\u00d7\5C\"\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\66\3\2\2"+
		"\2\u00da\u00db\n\2\2\2\u00db8\3\2\2\2\u00dc\u00dd\7\17\2\2\u00dd\u00e0"+
		"\7\f\2\2\u00de\u00e0\t\3\2\2\u00df\u00dc\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		":\3\2\2\2\u00e1\u00e3\5\61\31\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2"+
		"\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5<\3\2\2\2\u00e6\u00e7"+
		"\7^\2\2\u00e7\u00eb\t\4\2\2\u00e8\u00eb\5O(\2\u00e9\u00eb\5Q)\2\u00ea"+
		"\u00e6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb>\3\2\2\2"+
		"\u00ec\u00ee\7$\2\2\u00ed\u00ef\5\65\33\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7$\2\2\u00f1\u00f2\b \2\2\u00f2"+
		"@\3\2\2\2\u00f3\u00f4\t\5\2\2\u00f4B\3\2\2\2\u00f5\u00f8\n\6\2\2\u00f6"+
		"\u00f8\5=\37\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8D\3\2\2\2"+
		"\u00f9\u00fd\t\7\2\2\u00fa\u00fc\t\b\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feF\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0103\7)\2\2\u0101\u0104\5\67\34\2\u0102\u0104\5"+
		"=\37\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7)\2\2\u0106\u0107\b$\3\2\u0107H\3\2\2\2\u0108\u0109\7\61\2\2\u0109"+
		"\u010a\7,\2\2\u010a\u010e\3\2\2\2\u010b\u010d\13\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7,\2\2\u0112\u0113\7\61"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b%\4\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\b%\5\2\u0117J\3\2\2\2\u0118\u0119\7\61\2\2\u0119\u011a\7\61\2\2"+
		"\u011a\u011e\3\2\2\2\u011b\u011d\n\3\2\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\b&\6\2\u0122\u0123\3\2\2\2\u0123\u0124\b&\5"+
		"\2\u0124L\3\2\2\2\u0125\u0126\4\62\65\2\u0126N\3\2\2\2\u0127\u0128\7^"+
		"\2\2\u0128\u0133\5\63\32\2\u0129\u012a\7^\2\2\u012a\u012b\5\63\32\2\u012b"+
		"\u012c\5\63\32\2\u012c\u0133\3\2\2\2\u012d\u012e\7^\2\2\u012e\u012f\5"+
		"M\'\2\u012f\u0130\5\63\32\2\u0130\u0131\5\63\32\2\u0131\u0133\3\2\2\2"+
		"\u0132\u0127\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u012d\3\2\2\2\u0133P\3"+
		"\2\2\2\u0134\u0135\7^\2\2\u0135\u0136\7w\2\2\u0136\u0137\5A!\2\u0137\u0138"+
		"\5A!\2\u0138\u0139\5A!\2\u0139\u013a\5A!\2\u013aR\3\2\2\2\u013b\u013c"+
		"\t\t\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b*\5\2\u013eT\3\2\2\2\16\2\u00d8"+
		"\u00df\u00e4\u00ea\u00ee\u00f7\u00fd\u0103\u010e\u011e\u0132\7\3 \2\3"+
		"$\3\3%\4\b\2\2\3&\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
