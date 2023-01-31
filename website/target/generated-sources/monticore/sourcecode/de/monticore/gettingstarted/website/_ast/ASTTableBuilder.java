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

 public  class ASTTableBuilder extends de.monticore.ast.ASTNodeBuilder<ASTTableBuilder>  {

/* Hookpoint: ClassContent:Elements */

    /* generated by template cd2java.Attribute*/
/* generated by template cd2java.Annotations*/
// empty template: no Annotation

/* Hookpoint: AttributeContent:Annotations */
 protected  ASTTableBuilder realBuilder
  
;

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


    /* generated by template cd2java.Constructor*/
 public  ASTTableBuilder()
 {
  this.realBuilder = (ASTTableBuilder) this;
}


    /* generated by template cd2java.Method*/
 public  ASTTable build ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (title == null) {
                Log.error("0xA4522 title of type String must not be null");
            }
            if (fileName == null) {
                Log.error("0xA4522 fileName of type String must not be null");
            }
          throw new IllegalStateException();
        }
        ASTTable value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTTable();
    value.setTitle(this.title);
    value.setFileName(this.fileName);
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

        if (title == null) {
            return false;
        }
        if (fileName == null) {
            return false;
        }
        return true;

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
 public  ASTTableBuilder setTitle (String title)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.title = title;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder setFileName (String fileName)

 {
    /* generated by template _ast.builder.Set4ASTBuilder*/

    this.fileName = fileName;
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder set_SourcePositionEnd (SourcePosition end)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder set_SourcePositionEndAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder set_SourcePositionStart (SourcePosition start)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder set_SourcePositionStartAbsent ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder clear_PreComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder add_PreComment (Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder add_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder addAll_PreComments (Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder remove_PreComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder remove_PreComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder removeAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder retainAll_PreComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder set_PreCommentList (List<Comment> preComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder set_PreComment (int index,Comment precomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder clear_PostComments ()

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder add_PostComment (Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder add_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder remove_PostComment (Object element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder remove_PostComment (int index)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder removeAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder retainAll_PostComments (Collection<?> element)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder set_PostCommentList (List<Comment> postComments)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTableBuilder set_PostComment (int index,Comment postcomment)

 {
    /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template cd2java.Method*/
 public  ASTTable uncheckedBuild ()

 {
    /* generated by template _ast.builder.BuildMethod*/

        ASTTable value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTTable();
    value.setTitle(this.title);
    value.setFileName(this.fileName);
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


