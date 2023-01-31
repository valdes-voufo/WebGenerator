/* generated from model Website */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.gettingstarted.website;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;



/* Hookpoint: ClassContent:Imports */

/* generated by template cd2java.Annotations*/
// empty template: no Annotation


/* Hookpoint: ClassContent:Annotations */

 abstract  public  class WebsiteToolTOP  {

/* Hookpoint: ClassContent:Elements */



    /* generated by template cd2java.Method*/
 public  static  void main (String[] args)

 {
    /* generated by template _cli.Main*/


 WebsiteTool tool = new  WebsiteTool();
   tool.run(args);

}

    /* generated by template cd2java.Method*/
 public  void run (String[] args)

 {
    /* generated by template _cli.Run*/

init();
org.apache.commons.cli.Options options = initOptions();
try{
    //create CLI Parser and parse input options from commandline
    org.apache.commons.cli.CommandLineParser cliparser = new org.apache.commons.cli.DefaultParser();
    org.apache.commons.cli.CommandLine cmd = cliparser.parse(options,args);

    //help: when --help
    if(cmd.hasOption("h")){
        printHelp(options);
    //do not continue, when help is printed.
        return;
    }
    //version: when --version
    else if(cmd.hasOption("v")){
        printVersion();
        //do not continue when help is printed
        return;
    }

}catch (org.apache.commons.cli.ParseException e) {
   // e.getMessage displays the incorrect input-parameters
   Log.error("0xA5C06x29067 Could not process WebsiteTool parameters: " + e.getMessage());
 }
}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTWebsite parse (String model)

 {
    /* generated by template _cli.Parser*/



try {
      de.monticore.gettingstarted.website._parser.WebsiteParser parser = de.monticore.gettingstarted.website.WebsiteMill.parser() ;
      Optional<de.monticore.gettingstarted.website._ast.ASTWebsite> optAst = parser.parse(model);

      if (!parser.hasErrors() && optAst.isPresent()) {
        return optAst.get();
      }
      Log.error("0xA1050x86317 Model could not be parsed.");
    }
    catch (NullPointerException | java.io.IOException e) {
      Log.error("0xA1051x04705 Failed to parse " + model, e);
    }
    // should never be reached (unless failquick is off)
    return null;

}

    /* generated by template cd2java.Method*/
 public  void init ()

 {
    /* generated by template _cli.Init*/

// initialize logging with standard logging
Log.init();
de.monticore.gettingstarted.website.WebsiteMill.init();

}

    /* generated by template cd2java.Method*/
 public  void prettyPrint (de.monticore.gettingstarted.website._ast.ASTWebsite ast,String file)

 {
    Log.warn("0xA1052x29239 PrettyPrinting is not implemented yet.");
}

    /* generated by template cd2java.Method*/
 public  void print (String content,String path)

 {
    /* generated by template _cli.Print*/

// print to stdout or file
  if (path.isEmpty()) {
    System.out.println(content);
  } else {
    java.io.File f = new java.io.File(path);
    // create directories (logs error otherwise)
    f.getAbsoluteFile().getParentFile().mkdirs();
    java.io.FileWriter writer;
    try {
      writer = new java.io.FileWriter(f);
      writer.write(content);
      writer.close();
    } catch (java.io.IOException e) {
      Log.error("0xA7105x88659 Could not write to file " + f.getAbsolutePath());
    }
  }
}

    /* generated by template cd2java.Method*/
 public  void printHelp (org.apache.commons.cli.Options options)

 {
    /* generated by template _cli.PrintHelp*/


  org.apache.commons.cli.HelpFormatter formatter = new org.apache.commons.cli.HelpFormatter();
  formatter.setWidth(80);
  formatter.printHelp("WebsiteTool", options);

}

    /* generated by template cd2java.Method*/
 public  void printVersion ()

 {
    /* generated by template _cli.PrintVersion*/


// Get version string from Metadata and print

final String toolName = "WebsiteTool";
final String mcVersion = "7.4.0-SNAPSHOT";

java.util.Properties properties = new java.util.Properties();

try {
  java.io.BufferedInputStream stream = new java.io.BufferedInputStream(getClass().getResourceAsStream("/buildInfo.properties"));
  properties.load(stream);
  stream.close();
} catch(java.io.IOException e) {
  // BuildInfo not present
}

String toolVersion = properties.getProperty("version");
if (toolVersion == null) toolVersion = mcVersion;

System.out.println(toolName +
    ", version " + toolVersion +
    ", based on MontiCore version " + mcVersion);
}

    /* generated by template cd2java.Method*/
 public  void report (de.monticore.gettingstarted.website._ast.ASTWebsite ast,String path)

 {
    Log.warn("0xA1058x15276 Reports are not implemented yet.");
}

    /* generated by template cd2java.Method*/
 public  void runDefaultCoCos (de.monticore.gettingstarted.website._ast.ASTWebsite ast)

 {
    Log.warn("0xA1053x76901 default CoCos are not implemented yet.");
}

    /* generated by template cd2java.Method*/
 public  void runAdditionalCoCos (de.monticore.gettingstarted.website._ast.ASTWebsite ast)

 {
    Log.warn("0xA1062x30313 additional CoCos are not implemented yet.");
}

    /* generated by template cd2java.Method*/
 public  void storeSymbols (de.monticore.gettingstarted.website._symboltable.IWebsiteArtifactScope scope,String path)

 {
    /* generated by template _cli.StoreSymbols*/

de.monticore.gettingstarted.website._symboltable.WebsiteSymbols2Json symbols2Json = new de.monticore.gettingstarted.website._symboltable.WebsiteSymbols2Json();
    symbols2Json.store(scope, path);

}

    /* generated by template cd2java.Method*/
 public  org.apache.commons.cli.Options initOptions ()

 {
    /* generated by template _cli.InitOptions*/
org.apache.commons.cli.Options options = new org.apache.commons.cli.Options();
options = addStandardOptions(options);
options = addAdditionalOptions(options);
return options;
}

    /* generated by template cd2java.Method*/
 public  org.apache.commons.cli.Options addStandardOptions (org.apache.commons.cli.Options options)

 {
    /* generated by template _cli.AddStandardOptions*/
//help
options.addOption(org.apache.commons.cli.Option.builder("h")
    .longOpt("help")
    .desc("Prints this help dialog")
    .build());

//version
options.addOption(org.apache.commons.cli.Option.builder("v")
    .longOpt("version")
    .desc("Prints version information")
    .build());

//parse input file
options.addOption(org.apache.commons.cli.Option.builder("i")
    .longOpt("input")
    .argName("file")
    .hasArg()
    .desc("Reads the source file (mandatory) and parses the contents")
    .build());

//pretty print runner
options.addOption(org.apache.commons.cli.Option.builder("pp")
    .longOpt("prettyprint")
    .argName("file")
    .optionalArg(true)
    .numberOfArgs(1)
    .desc("Prints the AST to stdout or the specified file (optional)")
    .build());

// pretty print SC
options.addOption(org.apache.commons.cli.Option.builder("s")
    .longOpt("symboltable")
    .argName("file")
    .hasArg()
    .desc("Serialized the Symbol table of the given artifact.")
    .build());

//reports about the runner
options.addOption(org.apache.commons.cli.Option.builder("r")
    .longOpt("report")
    .argName("dir")
    .hasArg(true)
    .desc("Prints reports of the artifact to the specified directory.")
    .build());

// model paths
options.addOption(org.apache.commons.cli.Option.builder("path")
    .hasArgs()
    .desc("Sets the artifact path for imported symbols, space separated.")
    .build());

return options;

}

    /* generated by template cd2java.Method*/
 public  org.apache.commons.cli.Options addAdditionalOptions (org.apache.commons.cli.Options options)

 {
    /* generated by template _cli.AddAdditionalOptions*/

return options;

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._symboltable.IWebsiteArtifactScope createSymbolTable (de.monticore.gettingstarted.website._ast.ASTWebsite node)

 {
    /* generated by template _cli.SymbolTable*/


de.monticore.gettingstarted.website._symboltable.WebsiteScopesGenitorDelegator genitor = de.monticore.gettingstarted.website.WebsiteMill.scopesGenitorDelegator();
de.monticore.gettingstarted.website._symboltable.IWebsiteArtifactScope symTab = genitor.createFromAST(node);
return symTab;
}

    /* generated by template cd2java.Method*/
 public  void completeSymbolTable (de.monticore.gettingstarted.website._ast.ASTWebsite node)

 {
    Log.warn("0xA1158x83555 This symbol table phase is not implemented yet.");
}


}


