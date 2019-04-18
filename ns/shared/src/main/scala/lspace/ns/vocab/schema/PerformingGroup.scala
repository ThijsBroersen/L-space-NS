package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PerformingGroup
    extends OntologyDef(
      iri = "http://schema.org/PerformingGroup",
      iris = Set("http://schema.org/PerformingGroup"),
      label = "PerformingGroup",
      comment = """A performance group, such as a band, an orchestra, or a circus.""",
      `@extends` = () => List(Organization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Organization.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Organization.Properties {}
}
