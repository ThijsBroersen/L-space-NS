package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object InteractionCounter
    extends OntologyDef(
      iri = "http://schema.org/InteractionCounter",
      iris = Set("http://schema.org/InteractionCounter"),
      label = "InteractionCounter",
      comment =
        """A summary of how users have interacted with this CreativeWork. In most cases, authors will use a subtype to specify the specific type of interaction.""",
      `@extends` = () => List(StructuredValue.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.StructuredValue.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties {}
}
