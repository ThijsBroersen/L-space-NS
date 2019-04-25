package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ContactPointOption
    extends OntologyDef(
      iri = "http://schema.org/ContactPointOption",
      iris = Set("http://schema.org/ContactPointOption"),
      label = "ContactPointOption",
      comment = """Enumerated options related to a ContactPoint.""",
      `@extends` = () => List(Enumeration.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Enumeration.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties {}
}
