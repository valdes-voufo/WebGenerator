/* generated from model Website */
/* generated by template cd2java.Interface*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: InterfaceContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.gettingstarted.website._ast;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;

import de.monticore.ast.ASTNode;


/* Hookpoint: InterfaceContent:Imports */



/* Hookpoint: InterfaceContent:Annotations */

 public  interface ASTWebsiteNode extends ASTNode  { 
/* Hookpoint: InterfaceContent:Elements */


  /* generated by template cd2java.Method*/
 abstract  public  void accept (de.monticore.gettingstarted.website._visitor.WebsiteTraverser visitor)

;
}
