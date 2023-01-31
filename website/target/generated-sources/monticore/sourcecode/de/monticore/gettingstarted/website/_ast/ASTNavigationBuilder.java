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

 public  class ASTNavigationBuilder extends de.monticore.ast.ASTNodeBuilder<ASTNavigationBuilder>  {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  ASTNavigationBuilder realBuilder
  
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  java.util.List<de.monticore.gettingstarted.website._ast.ASTNavigationItem> navigationItems
  = new java.util.ArrayList<>()
;


    /* generated by template cd2java.Constructor*/
 public  ASTNavigationBuilder()
 {
  this.realBuilder = (ASTNavigationBuilder) this;
}


    /* generated by template cd2java.Method*/
 public  ASTNavigation build ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
          throw new IllegalStateException();
        }
        ASTNavigation value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTNavigation();
    value.setNavigationItemList(this.navigationItems);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}

    /* generated by template cd2java.Method*/
 public  boolean isValid ()

 {
    /* generated by template _ast.builder.IsValidMethod*/

        return true;

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
 public  ASTNavigationBuilder clearNavigationItems ()

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().clear();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder addNavigationItem (de.monticore.gettingstarted.website._ast.ASTNavigationItem element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().add(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder addAllNavigationItems (Collection<? extends de.monticore.gettingstarted.website._ast.ASTNavigationItem> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder removeNavigationItem (Object element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().remove(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder removeAllNavigationItems (Collection<?> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder retainAllNavigationItems (Collection<?> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder removeIfNavigationItem (Predicate<? super de.monticore.gettingstarted.website._ast.ASTNavigationItem> filter)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder forEachNavigationItems (Consumer<? super de.monticore.gettingstarted.website._ast.ASTNavigationItem> action)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().forEach(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder addNavigationItem (int index,de.monticore.gettingstarted.website._ast.ASTNavigationItem element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().add(index, element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder addAllNavigationItems (int index,Collection<? extends de.monticore.gettingstarted.website._ast.ASTNavigationItem> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder removeNavigationItem (int index)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().remove(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder setNavigationItem (int index,de.monticore.gettingstarted.website._ast.ASTNavigationItem element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().set(index, element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder replaceAllNavigationItems (UnaryOperator<de.monticore.gettingstarted.website._ast.ASTNavigationItem> operator)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder sortNavigationItems (Comparator<? super de.monticore.gettingstarted.website._ast.ASTNavigationItem> comparator)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getNavigationItemList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder setNavigationItemsList (List<de.monticore.gettingstarted.website._ast.ASTNavigationItem> navigationItems)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.navigationItems = navigationItems;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder set_SourcePositionEnd (SourcePosition end)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder set_SourcePositionEndAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder set_SourcePositionStart (SourcePosition start)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder set_SourcePositionStartAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder clear_PreComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder add_PreComment (Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder add_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder addAll_PreComments (Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder remove_PreComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder remove_PreComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder removeAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder retainAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder set_PreCommentList (List<Comment> preComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder set_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder clear_PostComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder add_PostComment (Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder add_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder remove_PostComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder remove_PostComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder removeAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder retainAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder set_PostCommentList (List<Comment> postComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigationBuilder set_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTNavigation uncheckedBuild ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        ASTNavigation value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTNavigation();
    value.setNavigationItemList(this.navigationItems);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}


}


