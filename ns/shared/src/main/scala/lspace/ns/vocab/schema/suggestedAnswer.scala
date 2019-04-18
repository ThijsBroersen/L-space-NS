package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object suggestedAnswer extends PropertyDef(
        iri = "http://schema.org/suggestedAnswer",
        iris = Set("http://schema.org/suggestedAnswer"),
        label = "suggestedAnswer",
        comment = """An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site.""",
        `@extends` = () => List(),
        `@range` = () => List(ItemList.ontology, Answer.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}