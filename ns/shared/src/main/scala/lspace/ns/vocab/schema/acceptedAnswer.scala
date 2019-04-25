package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object acceptedAnswer
    extends PropertyDef(
      iri = "http://schema.org/acceptedAnswer",
      iris = Set("http://schema.org/acceptedAnswer"),
      label = "acceptedAnswer",
      comment =
        """The answer(s) that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author.""",
      `@extends` = () => List(suggestedAnswer.property),
      `@range` = () => List(ItemList.ontology, Answer.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.suggestedAnswer.Properties
}
