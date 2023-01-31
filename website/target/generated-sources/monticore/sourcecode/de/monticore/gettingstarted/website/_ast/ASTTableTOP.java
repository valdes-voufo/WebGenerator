/* generated from model Website */
/* generated by template cd2java.Class*/

/* (c) https://github.com/MontiCore/monticore */

/* Hookpoint: ClassContent:addComment */

/* generated by template cd2java.Package*/
package de.monticore.gettingstarted.website._ast;


/* generated by template cd2java.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.SourcePosition;

import de.monticore.ast.ASTCNode;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;


/* Hookpoint: ClassContent:Imports */



/* Hookpoint: ClassContent:Annotations */

 abstract  public  class ASTTableTOP extends ASTCNode  implements de.monticore.gettingstarted.website._ast.ASTPageContentElement,de.monticore.gettingstarted.website._ast.ASTWebsiteNode {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  String title
  
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  String fileName
  
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.gettingstarted.website._symboltable.IWebsiteScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTTableTOP()
 {
  /* generated by template cd2java.EmptyBody*/
// empty body

}


    /* generated by template cd2java.Method*/
 public  boolean deepEquals (Object o)

 {
         return deepEquals(o, true);
}

    /* generated by template cd2java.Method*/
 public  boolean deepEquals (Object o,boolean forceSameOrder)

 {
    /* generated by template data.DeepEqualsWithOrder*/

      ASTTable comp;
    if ((o instanceof ASTTable)) {
      comp = (ASTTable) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    return true;     


}

    /* generated by template cd2java.Method*/
 public  boolean deepEqualsWithComments (Object o)

 {
         return deepEqualsWithComments(o, true);
}

    /* generated by template cd2java.Method*/
 public  boolean deepEqualsWithComments (Object o,boolean forceSameOrder)

 {
    /* generated by template data.DeepEqualsWithComments*/

      ASTTable comp;
    if ((o instanceof ASTTable)) {
      comp = (ASTTable) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    return true;     

}

    /* generated by template cd2java.Method*/
 public  boolean equalAttributes (Object o)

 {
    /* generated by template data.EqualAttributes*/

      ASTTable comp;
    if ((o instanceof ASTTable)) {
      comp = (ASTTable) o;
    } else {
      return false;
    }
	// comparing title 
    if ( (this.title == null && comp.title != null) 
      || (this.title != null && !this.title.equals(comp.title)) ) {
      return false;
    }
	// comparing fileName 
    if ( (this.fileName == null && comp.fileName != null) 
      || (this.fileName != null && !this.fileName.equals(comp.fileName)) ) {
      return false;
    }
    return true;


}

    /* generated by template cd2java.Method*/
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTTable comp;
    if ((o instanceof ASTTable)) {
      comp = (ASTTable) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreCommentList().size() == comp.get_PreCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostCommentList().size() == comp.get_PostCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

}

    /* generated by template cd2java.Method*/
 public  ASTTable deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/
 public  ASTTable deepClone (ASTTable result)

 {
    /* generated by template data.DeepCloneWithParameters*/


  result.set_SourcePositionStart(get_SourcePositionStart().clone());
  result.set_SourcePositionEnd(get_SourcePositionEnd().clone());
  for (de.monticore.ast.Comment x : get_PreCommentList()) {
    result.get_PreCommentList().add(new de.monticore.ast.Comment(x.getText()));
  }
  for (de.monticore.ast.Comment x : get_PostCommentList()) {
    result.get_PostCommentList().add(new de.monticore.ast.Comment(x.getText()));
  }

      result.setTitle(getTitle());
      result.setFileName(getFileName());
    
    return result;

}

    /* generated by template cd2java.Method*/
 public  String getTitle ()

 {
    /* generated by template methods.Get*/

return this.title;

}

    /* generated by template cd2java.Method*/
 public  String getFileName ()

 {
    /* generated by template methods.Get*/

return this.fileName;

}

    /* generated by template cd2java.Method*/
 public  void setTitle (String title)

 {
    /* generated by template methods.Set*/

this.title = title;

}

    /* generated by template cd2java.Method*/
 public  void setFileName (String fileName)

 {
    /* generated by template methods.Set*/

this.fileName = fileName;

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.gettingstarted.website._visitor.WebsiteTraverser visitor)

 {
    /* generated by template _ast.ast_class.Accept*/

    // We allow a down cast here, because the subclass ASTTable must exist
    // and only this subclass may exist in the AST and hence, only this class may
    // be handled by a visitor. All other cases are invalid an throw an exception!
    // This decision was made during MC Sprint Review on 16.03.2015.
    if (this instanceof ASTTable) {
      visitor.handle((ASTTable) this);
    } else {
      throw new UnsupportedOperationException("0xA7011x59913 Only handwritten class ASTTable is supported for the visitor");
    }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x57957 AST node type ASTTable expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x65017 AST node type ASTTable expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x82279 AST node type ASTTable expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x05801 AST node type ASTTable expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 protected  ASTTable _construct ()

 {
    return de.monticore.gettingstarted.website.WebsiteMill.tableBuilder().uncheckedBuild();
}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._symboltable.IWebsiteScope getEnclosingScope ()

 {
    /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.gettingstarted.website._symboltable.IWebsiteScope enclosingScope)

 {
    /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x39195 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x39195 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x39195 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}


}


