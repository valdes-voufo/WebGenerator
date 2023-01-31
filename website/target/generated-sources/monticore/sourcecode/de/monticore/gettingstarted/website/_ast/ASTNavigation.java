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

 public  class ASTNavigation extends ASTCNode  implements de.monticore.gettingstarted.website._ast.ASTWebsiteElement,de.monticore.gettingstarted.website._ast.ASTWebsiteNode {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  java.util.List<de.monticore.gettingstarted.website._ast.ASTNavigationItem> navigationItems
  = new java.util.ArrayList<>()
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  de.monticore.gettingstarted.website._symboltable.IWebsiteScope enclosingScope
  
;


    /* generated by template cd2java.Constructor*/
 protected  ASTNavigation()
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

      ASTNavigation comp;
    if ((o instanceof ASTNavigation)) {
      comp = (ASTNavigation) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing navigationItems
    if (this.navigationItems.size() != comp.navigationItems.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> it1 = this.navigationItems.iterator();
        Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> it2 = comp.navigationItems.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> it1 = this.navigationItems.iterator();
        while (it1.hasNext()) {
          de.monticore.gettingstarted.website._ast.ASTNavigationItem oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> it2 = comp.navigationItems.iterator();
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

      ASTNavigation comp;
    if ((o instanceof ASTNavigation)) {
      comp = (ASTNavigation) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing navigationItems
    if (this.navigationItems.size() != comp.navigationItems.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> it1 = this.navigationItems.iterator();
        Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> it2 = comp.navigationItems.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> it1 = this.navigationItems.iterator();
        while (it1.hasNext()) {
          de.monticore.gettingstarted.website._ast.ASTNavigationItem oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> it2 = comp.navigationItems.iterator();
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

    return o instanceof ASTNavigation;


}

    /* generated by template cd2java.Method*/
 public  boolean equalsWithComments (Object o)

 {
    /* generated by template data.EqualsWithComments*/

      ASTNavigation comp;
    if ((o instanceof ASTNavigation)) {
      comp = (ASTNavigation) o;
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
 public  ASTNavigation deepClone ()

 {
        return deepClone(_construct());
}

    /* generated by template cd2java.Method*/
 public  ASTNavigation deepClone (ASTNavigation result)

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

      getNavigationItemList().forEach(s -> result.navigationItems.add(s.deepClone()));
    
    return result;

}

    /* generated by template cd2java.Method*/
 public  boolean containsNavigationItem (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().contains(element);

}

    /* generated by template cd2java.Method*/
 public  boolean containsAllNavigationItems (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().containsAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean isEmptyNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().isEmpty();

}

    /* generated by template cd2java.Method*/
 public  Iterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> iteratorNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().iterator();

}

    /* generated by template cd2java.Method*/
 public  int sizeNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().size();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTNavigationItem[] toArrayNavigationItems (de.monticore.gettingstarted.website._ast.ASTNavigationItem[] array)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().toArray(array);

}

    /* generated by template cd2java.Method*/
 public  Object[] toArrayNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().toArray();

}

    /* generated by template cd2java.Method*/
 public  Spliterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> spliteratorNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().spliterator();

}

    /* generated by template cd2java.Method*/
 public  Stream<de.monticore.gettingstarted.website._ast.ASTNavigationItem> streamNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().stream();

}

    /* generated by template cd2java.Method*/
 public  Stream<de.monticore.gettingstarted.website._ast.ASTNavigationItem> parallelStreamNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().parallelStream();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTNavigationItem getNavigationItem (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().get(index);

}

    /* generated by template cd2java.Method*/
 public  int indexOfNavigationItem (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().indexOf(element);

}

    /* generated by template cd2java.Method*/
 public  int lastIndexOfNavigationItem (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().lastIndexOf(element);

}

    /* generated by template cd2java.Method*/
 public  boolean equalsNavigationItems (Object o)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().equals(o);

}

    /* generated by template cd2java.Method*/
 public  int hashCodeNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().hashCode();

}

    /* generated by template cd2java.Method*/
 public  ListIterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> listIteratorNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().listIterator();

}

    /* generated by template cd2java.Method*/
 public  ListIterator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> listIteratorNavigationItems (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().listIterator(index);

}

    /* generated by template cd2java.Method*/
 public  List<de.monticore.gettingstarted.website._ast.ASTNavigationItem> subListNavigationItems (int start,int end)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().subList(start, end);

}

    /* generated by template cd2java.Method*/
 public  List<de.monticore.gettingstarted.website._ast.ASTNavigationItem> getNavigationItemList ()

 {
    /* generated by template methods.Get*/

return this.navigationItems;

}

    /* generated by template cd2java.Method*/
 public  void clearNavigationItems ()

 {
    /* generated by template methods.MethodDelegate*/

this.getNavigationItemList().clear();

}

    /* generated by template cd2java.Method*/
 public  boolean addNavigationItem (de.monticore.gettingstarted.website._ast.ASTNavigationItem element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().add(element);

}

    /* generated by template cd2java.Method*/
 public  boolean addAllNavigationItems (Collection<? extends de.monticore.gettingstarted.website._ast.ASTNavigationItem> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().addAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean removeNavigationItem (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().remove(element);

}

    /* generated by template cd2java.Method*/
 public  boolean removeAllNavigationItems (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().removeAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean retainAllNavigationItems (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().retainAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean removeIfNavigationItem (Predicate<? super de.monticore.gettingstarted.website._ast.ASTNavigationItem> filter)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().removeIf(filter);

}

    /* generated by template cd2java.Method*/
 public  void forEachNavigationItems (Consumer<? super de.monticore.gettingstarted.website._ast.ASTNavigationItem> action)

 {
    /* generated by template methods.MethodDelegate*/

this.getNavigationItemList().forEach(action);

}

    /* generated by template cd2java.Method*/
 public  void addNavigationItem (int index,de.monticore.gettingstarted.website._ast.ASTNavigationItem element)

 {
    /* generated by template methods.MethodDelegate*/

this.getNavigationItemList().add(index, element);

}

    /* generated by template cd2java.Method*/
 public  boolean addAllNavigationItems (int index,Collection<? extends de.monticore.gettingstarted.website._ast.ASTNavigationItem> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().addAll(index, collection);

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTNavigationItem removeNavigationItem (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().remove(index);

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTNavigationItem setNavigationItem (int index,de.monticore.gettingstarted.website._ast.ASTNavigationItem element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getNavigationItemList().set(index, element);

}

    /* generated by template cd2java.Method*/
 public  void replaceAllNavigationItems (UnaryOperator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> operator)

 {
    /* generated by template methods.MethodDelegate*/

this.getNavigationItemList().replaceAll(operator);

}

    /* generated by template cd2java.Method*/
 public  void sortNavigationItems (Comparator<? super de.monticore.gettingstarted.website._ast.ASTNavigationItem> comparator)

 {
    /* generated by template methods.MethodDelegate*/

this.getNavigationItemList().sort(comparator);

}

    /* generated by template cd2java.Method*/
 public  void setNavigationItemList (List<de.monticore.gettingstarted.website._ast.ASTNavigationItem> navigationItems)

 {
    /* generated by template methods.Set*/

this.navigationItems = navigationItems;

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
    de.se_rwth.commons.logging.Log.error("0xA7000x81487 AST node type ASTNavigation expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x11355 AST node type ASTNavigation expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x34149 AST node type ASTNavigation expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
    /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof de.monticore.gettingstarted.website._visitor.WebsiteTraverser) {
    accept((de.monticore.gettingstarted.website._visitor.WebsiteTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x29813 AST node type ASTNavigation expected a visitor of type de.monticore.gettingstarted.website._visitor.WebsiteTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template cd2java.Method*/
 protected  ASTNavigation _construct ()

 {
    return de.monticore.gettingstarted.website.WebsiteMill.navigationBuilder().uncheckedBuild();
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
    de.se_rwth.commons.logging.Log.error("0xA7005x22055 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x22055 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}

    /* generated by template cd2java.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
    /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof de.monticore.gettingstarted.website._symboltable.IWebsiteScope){
    this.enclosingScope = (de.monticore.gettingstarted.website._symboltable.IWebsiteScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x22055 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type de.monticore.gettingstarted.website._symboltable.IWebsiteScope. Please call the Method setEnclosingScope with a parameter form type de.monticore.gettingstarted.website._symboltable.IWebsiteScope");
  }
}


}


