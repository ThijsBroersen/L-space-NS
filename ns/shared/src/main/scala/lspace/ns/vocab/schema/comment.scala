package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object comment extends PropertyDef(
        iri = "http://schema.org/comment",
        iris = Set("http://schema.org/comment"),
        label = "comment",
        comment = """Comments, typically from users.""",
        `@extends` = () => List(),
        `@range` = () => List(Comment.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}