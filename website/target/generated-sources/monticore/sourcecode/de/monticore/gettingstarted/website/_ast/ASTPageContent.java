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

 public  class ASTPageContent extends ASTCNode  implements de.monticore.gettingstarted.website._ast.ASTWebsiteNode {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  java.util.List<de.monticore.gettingstarted.website._ast.ASTPageContentElement> pageContentElements
  = new java.util.ArrayList<>()
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.gettingstarted.website._symboltable.IWebsiteScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTPageContent()
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

      ASTPageContent comp;
    if ((o instanceof ASTPageContent)) {
      comp = (ASTPageContent) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing pageContentElements
    if (this.pageContentElements.size() != comp.pageContentElements.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it1 = this.pageContentElements.iterator();
        Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it2 = comp.pageContentElements.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it1 = this.pageContentElements.iterator();
        while (it1.hasNext()) {
          de.monticore.gettingstarted.website._ast.ASTPageContentElement oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it2 = comp.pageContentElements.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEquals(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
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

      ASTPageContent comp;
    if ((o instanceof ASTPageContent)) {
      comp = (ASTPageContent) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing pageContentElements
    if (this.pageContentElements.size() != comp.pageContentElements.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it1 = this.pageContentElements.iterator();
        Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it2 = comp.pageContentElements.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it1 = this.pageContentElements.iterator();
        while (it1.hasNext()) {
          de.monticore.gettingstarted.website._ast.ASTPageContentElement oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it2 = comp.pageContentElements.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEqualsWithComments(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    return true;     

}

    /* generated by template cd2java.Method*/
 public  boolean equalAttributes (Object o)

 {
    /* generated by template data.EqualAttributes*/

    return o instanceof ASTPageContent;


}

    /* generated by template cd2java.Method*/
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTPageContent comp;
    if ((o instanceof ASTPageContent)) {
      comp = (ASTPageContent) o;
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
 public  ASTPageContent deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/
 public  ASTPageContent deepClone (ASTPageContent result)

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

      getPageContentElementList().forEach(s -> result.pageContentElements.add(s.deepClone()));
    
    return result;

}

    /* generated by template cd2java.Method*/
 public  boolean containsPageContentElement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().contains(element);

}

    /* generated by template cd2java.Method*/
 public  boolean containsAllPageContentElements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().containsAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean isEmptyPageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().isEmpty();

}

    /* generated by template cd2java.Method*/
 public  Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> iteratorPageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().iterator();

}

    /* generated by template cd2java.Method*/
 public  int sizePageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().size();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContentElement[] toArrayPageContentElements (de.monticore.gettingstarted.website._ast.ASTPageContentElement[] array)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().toArray(array);

}

    /* generated by template cd2java.Method*/
 public  Object[] toArrayPageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().toArray();

}

    /* generated by template cd2java.Method*/
 public  Spliterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> spliteratorPageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().spliterator();

}

    /* generated by template cd2java.Method*/
 public  Stream<de.monticore.gettingstarted.website._ast.ASTPageContentElement> streamPageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().stream();

}

    /* generated by template cd2java.Method*/
 public  Stream<de.monticore.gettingstarted.website._ast.ASTPageContentElement> parallelStreamPageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().parallelStream();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContentElement getPageContentElement (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().get(index);

}

    /* generated by template cd2java.Method*/
 public  int indexOfPageContentElement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().indexOf(element);

}

    /* generated by template cd2java.Method*/
 public  int lastIndexOfPageContentElement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().lastIndexOf(element);

}

    /* generated by template cd2java.Method*/
 public  boolean equalsPageContentElements (Object o)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().equals(o);

}

    /* generated by template cd2java.Method*/
 public  int hashCodePageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().hashCode();

}

    /* generated by template cd2java.Method*/
 public  ListIterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> listIteratorPageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().listIterator();

}

    /* generated by template cd2java.Method*/
 public  ListIterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> listIteratorPageContentElements (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().listIterator(index);

}

    /* generated by template cd2java.Method*/
 public  List<de.monticore.gettingstarted.website._ast.ASTPageContentElement> subListPageContentElements (int start,int end)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().subList(start, end);

}

    /* generated by template cd2java.Method*/
 public  List<de.monticore.gettingstarted.website._ast.ASTPageContentElement> getPageContentElementList ()

 {
    /* generated by template methods.Get*/

return this.pageContentElements;

}

    /* generated by template cd2java.Method*/
 public  void clearPageContentElements ()

 {
    /* generated by template methods.MethodDelegate*/

this.getPageContentElementList().clear();

}

    /* generated by template cd2java.Method*/
 public  boolean addPageContentElement (de.monticore.gettingstarted.website._ast.ASTPageContentElement element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().add(element);

}

    /* generated by template cd2java.Method*/
 public  boolean addAllPageContentElements (Collection<? extends de.monticore.gettingstarted.website._ast.ASTPageContentElement> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().addAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean removePageContentElement (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().remove(element);

}

    /* generated by template cd2java.Method*/
 public  boolean removeAllPageContentElements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().removeAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean retainAllPageContentElements (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().retainAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean removeIfPageContentElement (Predicate<? super de.monticore.gettingstarted.website._ast.ASTPageContentElement> filter)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().removeIf(filter);

}

    /* generated by template cd2java.Method*/
 public  void forEachPageContentElements (Consumer<? super de.monticore.gettingstarted.website._ast.ASTPageContentElement> action)

 {
    /* generated by template methods.MethodDelegate*/

this.getPageContentElementList().forEach(action);

}

    /* generated by template cd2java.Method*/
 public  void addPageContentElement (int index,de.monticore.gettingstarted.website._ast.ASTPageContentElement element)

 {
    /* generated by template methods.MethodDelegate*/

this.getPageContentElementList().add(index, element);

}

    /* generated by template cd2java.Method*/
 public  boolean addAllPageContentElements (int index,Collection<? extends de.monticore.gettingstarted.website._ast.ASTPageContentElement> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().addAll(index, collection);

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContentElement removePageContentElement (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().remove(index);

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContentElement setPageContentElement (int index,de.monticore.gettingstarted.website._ast.ASTPageContentElement element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageContentElementList().set(index, element);

}

    /* generated by template cd2java.Method*/
 public  void replaceAllPageContentElements (UnaryOperator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> operator)

 {
    /* generated by template methods.MethodDelegate*/

this.getPageContentElementList().replaceAll(operator);

}

    /* generated by template cd2java.Method*/
 public  void sortPageContentElements (Comparator<? super de.monticore.gettingstarted.website._ast.ASTPageContentElement> comparator)

 {
    /* generated by template methods.MethodDelegate*/

this.getPageContentElementList().sort(comparator);

}

    /* generated by template cd2java.Method*/
 public  void setPageContentElementList (List<de.monticore.gettingstarted.website._ast.ASTPageContentElement> pageContentElements)

 {
    /* generated by template methods.Set*/

this.pageContentElements = pageContentElements;

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.gettingstarted.website._visitor.WebsiteTraverser visitor)

 {
    /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x06625 AST node type ASTPageContent expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x18741 AST node type ASTPageContent expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x32181 AST node type ASTPageContent expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x46373 AST node type ASTPageContent expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 protected  ASTPageContent _construct ()

 {
    return de.monticore.gettingstarted.website.WebsiteMill.pageContentBuilder().uncheckedBuild();
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
    de.se_rwth.commons.logging.Log.error("0xA7005x92617 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x92617 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x92617 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}


}

