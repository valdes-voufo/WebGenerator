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

 abstract  public  class ASTPageTOP extends ASTCNode  implements de.monticore.gettingstarted.website._ast.ASTWebsiteElement,de.monticore.gettingstarted.website._ast.ASTWebsiteNode {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  String name
  
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<String> title
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.gettingstarted.website._ast.ASTPageContent pageContent
  
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  boolean start
  
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  Optional<de.monticore.gettingstarted.website._symboltable.PageSymbol> symbol
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.gettingstarted.website._symboltable.IWebsiteScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTPageTOP()
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

      ASTPage comp;
    if ((o instanceof ASTPage)) {
      comp = (ASTPage) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
     // comparing pageContent
     if ( (this.pageContent == null && comp.pageContent != null) ||
        (this.pageContent != null && !this.pageContent.deepEquals(comp.pageContent, forceSameOrder)) ) {
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

      ASTPage comp;
    if ((o instanceof ASTPage)) {
      comp = (ASTPage) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
      // comparing pageContent
      if ( (this.pageContent == null && comp.pageContent != null) ||
        (this.pageContent != null && !this.pageContent.deepEqualsWithComments(comp.pageContent, forceSameOrder)) ) {
        return false;
      }
    return true;     

}

    /* generated by template cd2java.Method*/
 public  boolean equalAttributes (Object o)

 {
    /* generated by template data.EqualAttributes*/

      ASTPage comp;
    if ((o instanceof ASTPage)) {
      comp = (ASTPage) o;
    } else {
      return false;
    }
	// comparing name 
    if ( (this.name == null && comp.name != null) 
      || (this.name != null && !this.name.equals(comp.name)) ) {
      return false;
    }
	// comparing title 
    if ( this.title.isPresent() != comp.title.isPresent() ||
       (this.title.isPresent() && !this.title.get().equals(comp.title.get())) ) {
      return false;
    }
	// comparing start 
    if (!(this.start == comp.start)) {
      return false;
    }
    return true;


}

    /* generated by template cd2java.Method*/
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTPage comp;
    if ((o instanceof ASTPage)) {
      comp = (ASTPage) o;
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
 public  ASTPage deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/
 public  ASTPage deepClone (ASTPage result)

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

      result.setName(getName());
    if (isPresentTitle()){
      result.setTitle(getTitle());
    } else {
      result.setTitleAbsent();
    }
      result.setPageContent(getPageContent().deepClone());
      result.setStart(isStart());
    
    return result;

}

    /* generated by template cd2java.Method*/
 public  String getName ()

 {
    /* generated by template methods.Get*/

return this.name;

}

    /* generated by template cd2java.Method*/
 public  String getTitle ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentTitle()) {
        return this.title.get();
    }
    Log.error("0xA7003x02586 get for Title can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/
 public  boolean isPresentTitle ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.title.isPresent();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContent getPageContent ()

 {
    /* generated by template methods.Get*/

return this.pageContent;

}

    /* generated by template cd2java.Method*/
 public  boolean isStart ()

 {
    /* generated by template methods.Get*/

return this.start;

}

    /* generated by template cd2java.Method*/
 public  void setName (String name)

 {
    /* generated by template methods.Set*/

this.name = name;

}

    /* generated by template cd2java.Method*/
 public  void setTitle (String title)

 {
    /* generated by template methods.opt.Set4Opt*/

this.title = Optional.ofNullable(title);

}

    /* generated by template cd2java.Method*/
 public  void setTitleAbsent ()

 {
    /* generated by template methods.opt.SetAbsent*/

this.title = Optional.empty();

}

    /* generated by template cd2java.Method*/
 public  void setPageContent (de.monticore.gettingstarted.website._ast.ASTPageContent pageContent)

 {
    /* generated by template methods.Set*/

this.pageContent = pageContent;

}

    /* generated by template cd2java.Method*/
 public  void setStart (boolean start)

 {
    /* generated by template methods.Set*/

this.start = start;

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.gettingstarted.website._visitor.WebsiteTraverser visitor)

 {
    /* generated by template _ast.ast_class.Accept*/

    // We allow a down cast here, because the subclass ASTPage must exist
    // and only this subclass may exist in the AST and hence, only this class may
    // be handled by a visitor. All other cases are invalid an throw an exception!
    // This decision was made during MC Sprint Review on 16.03.2015.
    if (this instanceof ASTPage) {
      visitor.handle((ASTPage) this);
    } else {
      throw new UnsupportedOperationException("0xA7011x01258 Only handwritten class ASTPage is supported for the visitor");
    }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x03052 AST node type ASTPage expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x86400 AST node type ASTPage expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x74944 AST node type ASTPage expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x20624 AST node type ASTPage expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 protected  ASTPage _construct ()

 {
    return de.monticore.gettingstarted.website.WebsiteMill.pageBuilder().uncheckedBuild();
}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._symboltable.PageSymbol getSymbol ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentSymbol()) {
        return this.symbol.get();
    }
    Log.error("0xA7003x76162 get for Symbol can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/
 public  boolean isPresentSymbol ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.symbol.isPresent();

}

    /* generated by template cd2java.Method*/
 public  void setSymbol (de.monticore.gettingstarted.website._symboltable.PageSymbol symbol)

 {
    /* generated by template methods.opt.Set4Opt*/

this.symbol = Optional.ofNullable(symbol);

}

    /* generated by template cd2java.Method*/
 public  void setSymbolAbsent ()

 {
    /* generated by template methods.opt.SetAbsent*/

this.symbol = Optional.empty();

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
    de.se_rwth.commons.logging.Log.error("0xA7005x28670 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x28670 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x28670 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}


}


