package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PeopleAudience
    extends OntologyDef(
      iri = "http://schema.org/PeopleAudience",
      iris = Set("http://schema.org/PeopleAudience"),
      label = "PeopleAudience",
      comment = """A set of characteristics belonging to people, e.g. who compose an item's target audience.""",
      `@extends` = () => List(Audience.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Audience.Properties {
    lazy val suggestedMinAge = lspace.ns.vocab.schema.suggestedMinAge.property
  }
  override lazy val properties: List[LProperty] = List(suggestedMinAge)
  trait Properties extends lspace.ns.vocab.schema.Audience.Properties {
    lazy val suggestedMinAge = lspace.ns.vocab.schema.suggestedMinAge.property
  }
}
