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

 abstract  public  class ASTAsideTOP extends ASTCNode  implements de.monticore.gettingstarted.website._ast.ASTPageContentElement,de.monticore.gettingstarted.website._ast.ASTWebsiteNode {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  java.util.List<de.monticore.gettingstarted.website._ast.ASTPageContentElement> subItem
  = new java.util.ArrayList<>()
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.gettingstarted.website._symboltable.IWebsiteScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTAsideTOP()
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

      ASTAside comp;
    if ((o instanceof ASTAside)) {
      comp = (ASTAside) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing subItem
    if (this.subItem.size() != comp.subItem.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it1 = this.subItem.iterator();
        Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it2 = comp.subItem.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it1 = this.subItem.iterator();
        while (it1.hasNext()) {
          de.monticore.gettingstarted.website._ast.ASTPageContentElement oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it2 = comp.subItem.iterator();
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

      ASTAside comp;
    if ((o instanceof ASTAside)) {
      comp = (ASTAside) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing subItem
    if (this.subItem.size() != comp.subItem.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it1 = this.subItem.iterator();
        Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it2 = comp.subItem.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it1 = this.subItem.iterator();
        while (it1.hasNext()) {
          de.monticore.gettingstarted.website._ast.ASTPageContentElement oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> it2 = comp.subItem.iterator();
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

    return o instanceof ASTAside;


}

    /* generated by template cd2java.Method*/
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTAside comp;
    if ((o instanceof ASTAside)) {
      comp = (ASTAside) o;
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
 public  ASTAside deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/
 public  ASTAside deepClone (ASTAside result)

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

      getSubItemList().forEach(s -> result.subItem.add(s.deepClone()));
    
    return result;

}

    /* generated by template cd2java.Method*/
 public  boolean containsSubItem (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().contains(element);

}

    /* generated by template cd2java.Method*/
 public  boolean containsAllSubItem (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().containsAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean isEmptySubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().isEmpty();

}

    /* generated by template cd2java.Method*/
 public  Iterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> iteratorSubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().iterator();

}

    /* generated by template cd2java.Method*/
 public  int sizeSubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().size();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContentElement[] toArraySubItem (de.monticore.gettingstarted.website._ast.ASTPageContentElement[] array)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().toArray(array);

}

    /* generated by template cd2java.Method*/
 public  Object[] toArraySubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().toArray();

}

    /* generated by template cd2java.Method*/
 public  Spliterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> spliteratorSubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().spliterator();

}

    /* generated by template cd2java.Method*/
 public  Stream<de.monticore.gettingstarted.website._ast.ASTPageContentElement> streamSubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().stream();

}

    /* generated by template cd2java.Method*/
 public  Stream<de.monticore.gettingstarted.website._ast.ASTPageContentElement> parallelStreamSubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().parallelStream();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContentElement getSubItem (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().get(index);

}

    /* generated by template cd2java.Method*/
 public  int indexOfSubItem (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().indexOf(element);

}

    /* generated by template cd2java.Method*/
 public  int lastIndexOfSubItem (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().lastIndexOf(element);

}

    /* generated by template cd2java.Method*/
 public  boolean equalsSubItem (Object o)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().equals(o);

}

    /* generated by template cd2java.Method*/
 public  int hashCodeSubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().hashCode();

}

    /* generated by template cd2java.Method*/
 public  ListIterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> listIteratorSubItem ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().listIterator();

}

    /* generated by template cd2java.Method*/
 public  ListIterator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> listIteratorSubItem (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().listIterator(index);

}

    /* generated by template cd2java.Method*/
 public  List<de.monticore.gettingstarted.website._ast.ASTPageContentElement> subListSubItem (int start,int end)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().subList(start, end);

}

    /* generated by template cd2java.Method*/
 public  List<de.monticore.gettingstarted.website._ast.ASTPageContentElement> getSubItemList ()

 {
    /* generated by template methods.Get*/

return this.subItem;

}

    /* generated by template cd2java.Method*/
 public  void clearSubItem ()

 {
    /* generated by template methods.MethodDelegate*/

this.getSubItemList().clear();

}

    /* generated by template cd2java.Method*/
 public  boolean addSubItem (de.monticore.gettingstarted.website._ast.ASTPageContentElement element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().add(element);

}

    /* generated by template cd2java.Method*/
 public  boolean addAllSubItem (Collection<? extends de.monticore.gettingstarted.website._ast.ASTPageContentElement> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().addAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean removeSubItem (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().remove(element);

}

    /* generated by template cd2java.Method*/
 public  boolean removeAllSubItem (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().removeAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean retainAllSubItem (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().retainAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean removeIfSubItem (Predicate<? super de.monticore.gettingstarted.website._ast.ASTPageContentElement> filter)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().removeIf(filter);

}

    /* generated by template cd2java.Method*/
 public  void forEachSubItem (Consumer<? super de.monticore.gettingstarted.website._ast.ASTPageContentElement> action)

 {
    /* generated by template methods.MethodDelegate*/

this.getSubItemList().forEach(action);

}

    /* generated by template cd2java.Method*/
 public  void addSubItem (int index,de.monticore.gettingstarted.website._ast.ASTPageContentElement element)

 {
    /* generated by template methods.MethodDelegate*/

this.getSubItemList().add(index, element);

}

    /* generated by template cd2java.Method*/
 public  boolean addAllSubItem (int index,Collection<? extends de.monticore.gettingstarted.website._ast.ASTPageContentElement> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().addAll(index, collection);

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContentElement removeSubItem (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().remove(index);

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPageContentElement setSubItem (int index,de.monticore.gettingstarted.website._ast.ASTPageContentElement element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getSubItemList().set(index, element);

}

    /* generated by template cd2java.Method*/
 public  void replaceAllSubItem (UnaryOperator<de.monticore.gettingstarted.website._ast.ASTPageContentElement> operator)

 {
    /* generated by template methods.MethodDelegate*/

this.getSubItemList().replaceAll(operator);

}

    /* generated by template cd2java.Method*/
 public  void sortSubItem (Comparator<? super de.monticore.gettingstarted.website._ast.ASTPageContentElement> comparator)

 {
    /* generated by template methods.MethodDelegate*/

this.getSubItemList().sort(comparator);

}

    /* generated by template cd2java.Method*/
 public  void setSubItemList (List<de.monticore.gettingstarted.website._ast.ASTPageContentElement> subItem)

 {
    /* generated by template methods.Set*/

this.subItem = subItem;

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.gettingstarted.website._visitor.WebsiteTraverser visitor)

 {
    /* generated by template _ast.ast_class.Accept*/

    // We allow a down cast here, because the subclass ASTAside must exist
    // and only this subclass may exist in the AST and hence, only this class may
    // be handled by a visitor. All other cases are invalid an throw an exception!
    // This decision was made during MC Sprint Review on 16.03.2015.
    if (this instanceof ASTAside) {
      visitor.handle((ASTAside) this);
    } else {
      throw new UnsupportedOperationException("0xA7011x04947 Only handwritten class ASTAside is supported for the visitor");
    }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x35857 AST node type ASTAside expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x71235 AST node type ASTAside expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x50851 AST node type ASTAside expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x64275 AST node type ASTAside expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 protected  ASTAside _construct ()

 {
    return de.monticore.gettingstarted.website.WebsiteMill.asideBuilder().uncheckedBuild();
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
    de.se_rwth.commons.logging.Log.error("0xA7005x35013 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x35013 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x35013 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}


}


