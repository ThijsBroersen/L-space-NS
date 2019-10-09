package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CorrectionComment extends OntologyDef(
        iri = "http://schema.org/CorrectionComment",
        iris = Set("http://schema.org/CorrectionComment"),
        label = "CorrectionComment",
        comment = """A <a class="localLink" href="http://schema.org/comment">comment</a> that corrects <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>.""",
        `@extends` = List(Comment.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Comment.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Comment.Properties{

}
}