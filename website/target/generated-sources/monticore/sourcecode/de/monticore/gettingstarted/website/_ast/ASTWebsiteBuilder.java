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

 public  class ASTWebsiteBuilder extends de.monticore.ast.ASTNodeBuilder<ASTWebsiteBuilder>  {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  ASTWebsiteBuilder realBuilder
  
;

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
 protected  Optional<de.monticore.gettingstarted.website._ast.ASTNavigation> navigation
  = Optional.empty()
;

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  java.util.List<de.monticore.gettingstarted.website._ast.ASTPage> pages
  = new java.util.ArrayList<>()
;


    /* generated by template cd2java.Constructor*/
 public  ASTWebsiteBuilder()
 {
  this.realBuilder = (ASTWebsiteBuilder) this;
}


    /* generated by template cd2java.Method*/
 public  ASTWebsite build ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (name == null) {
                Log.error("0xA4522 name of type String must not be null");
            }
          throw new IllegalStateException();
        }
        ASTWebsite value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTWebsite();
    value.setName(this.name);
    if (this.navigation.isPresent()) {
      value.setNavigation(this.navigation.get());
    } else {
      value.setNavigationAbsent();
    }
    value.setPageList(this.pages);
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

        if (name == null) {
            return false;
        }
        return true;

}

    /* generated by template cd2java.Method*/
 public  String getName ()

 {
    /* generated by template methods.Get*/

return this.name;

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTNavigation getNavigation ()

 {
    /* generated by template methods.opt.Get4Opt*/

    if (isPresentNavigation()) {
        return this.navigation.get();
    }
    Log.error("0xA7003x12977 get for Navigation can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template cd2java.Method*/
 public  boolean isPresentNavigation ()

 {
    /* generated by template methods.opt.IsPresent4Opt*/

return this.navigation.isPresent();

}

    /* generated by template cd2java.Method*/
 public  boolean containsPage (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().contains(element);

}

    /* generated by template cd2java.Method*/
 public  boolean containsAllPages (Collection<?> collection)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().containsAll(collection);

}

    /* generated by template cd2java.Method*/
 public  boolean isEmptyPages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().isEmpty();

}

    /* generated by template cd2java.Method*/
 public  Iterator<de.monticore.gettingstarted.website._ast.ASTPage> iteratorPages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().iterator();

}

    /* generated by template cd2java.Method*/
 public  int sizePages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().size();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPage[] toArrayPages (de.monticore.gettingstarted.website._ast.ASTPage[] array)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().toArray(array);

}

    /* generated by template cd2java.Method*/
 public  Object[] toArrayPages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().toArray();

}

    /* generated by template cd2java.Method*/
 public  Spliterator<de.monticore.gettingstarted.website._ast.ASTPage> spliteratorPages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().spliterator();

}

    /* generated by template cd2java.Method*/
 public  Stream<de.monticore.gettingstarted.website._ast.ASTPage> streamPages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().stream();

}

    /* generated by template cd2java.Method*/
 public  Stream<de.monticore.gettingstarted.website._ast.ASTPage> parallelStreamPages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().parallelStream();

}

    /* generated by template cd2java.Method*/
 public  de.monticore.gettingstarted.website._ast.ASTPage getPage (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().get(index);

}

    /* generated by template cd2java.Method*/
 public  int indexOfPage (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().indexOf(element);

}

    /* generated by template cd2java.Method*/
 public  int lastIndexOfPage (Object element)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().lastIndexOf(element);

}

    /* generated by template cd2java.Method*/
 public  boolean equalsPages (Object o)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().equals(o);

}

    /* generated by template cd2java.Method*/
 public  int hashCodePages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().hashCode();

}

    /* generated by template cd2java.Method*/
 public  ListIterator<de.monticore.gettingstarted.website._ast.ASTPage> listIteratorPages ()

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().listIterator();

}

    /* generated by template cd2java.Method*/
 public  ListIterator<de.monticore.gettingstarted.website._ast.ASTPage> listIteratorPages (int index)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().listIterator(index);

}

    /* generated by template cd2java.Method*/
 public  List<de.monticore.gettingstarted.website._ast.ASTPage> subListPages (int start,int end)

 {
    /* generated by template methods.MethodDelegate*/

return this.getPageList().subList(start, end);

}

    /* generated by template cd2java.Method*/
 public  List<de.monticore.gettingstarted.website._ast.ASTPage> getPageList ()

 {
    /* generated by template methods.Get*/

return this.pages;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder setName (String name)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder setNavigation (de.monticore.gettingstarted.website._ast.ASTNavigation navigation)

 {
    /* generated by template _ast.builder.opt.Set4ASTBuilderOpt*/

    this.navigation = Optional.ofNullable(navigation);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder setNavigationAbsent ()

 {
    /* generated by template _ast.builder.opt.SetAbsent4ASTBuilderOpt*/

    this.navigation = Optional.empty();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder clearPages ()

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().clear();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder addPage (de.monticore.gettingstarted.website._ast.ASTPage element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().add(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder addAllPages (Collection<? extends de.monticore.gettingstarted.website._ast.ASTPage> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder removePage (Object element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().remove(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder removeAllPages (Collection<?> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder retainAllPages (Collection<?> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder removeIfPage (Predicate<? super de.monticore.gettingstarted.website._ast.ASTPage> filter)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder forEachPages (Consumer<? super de.monticore.gettingstarted.website._ast.ASTPage> action)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().forEach(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder addPage (int index,de.monticore.gettingstarted.website._ast.ASTPage element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().add(index, element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder addAllPages (int index,Collection<? extends de.monticore.gettingstarted.website._ast.ASTPage> collection)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder removePage (int index)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().remove(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder setPage (int index,de.monticore.gettingstarted.website._ast.ASTPage element)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().set(index, element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder replaceAllPages (UnaryOperator<de.monticore.gettingstarted.website._ast.ASTPage> operator)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder sortPages (Comparator<? super de.monticore.gettingstarted.website._ast.ASTPage> comparator)

 {
    /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getPageList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder setPagesList (List<de.monticore.gettingstarted.website._ast.ASTPage> pages)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.pages = pages;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder set_SourcePositionEnd (SourcePosition end)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder set_SourcePositionEndAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder set_SourcePositionStart (SourcePosition start)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder set_SourcePositionStartAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder clear_PreComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder add_PreComment (Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder add_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder addAll_PreComments (Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder remove_PreComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder remove_PreComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder removeAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder retainAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder set_PreCommentList (List<Comment> preComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder set_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder clear_PostComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder add_PostComment (Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder add_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder remove_PostComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder remove_PostComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder removeAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder retainAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder set_PostCommentList (List<Comment> postComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsiteBuilder set_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTWebsite uncheckedBuild ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        ASTWebsite value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTWebsite();
    value.setName(this.name);
    if (this.navigation.isPresent()) {
      value.setNavigation(this.navigation.get());
    } else {
      value.setNavigationAbsent();
    }
    value.setPageList(this.pages);
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

