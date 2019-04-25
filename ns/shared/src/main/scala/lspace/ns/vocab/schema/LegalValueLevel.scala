package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LegalValueLevel
    extends OntologyDef(
      iri = "http://schema.org/LegalValueLevel",
      iris = Set("http://schema.org/LegalValueLevel"),
      label = "LegalValueLevel",
      comment = """A list of possible levels for the legal validity of a legislation.""",
      `@extends` = () => List(Enumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Enumeration.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties {}
}
