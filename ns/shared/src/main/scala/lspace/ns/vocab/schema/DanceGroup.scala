package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DanceGroup
    extends OntologyDef(
      iri = "http://schema.org/DanceGroup",
      iris = Set("http://schema.org/DanceGroup"),
      label = "DanceGroup",
      comment = """A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.""",
      `@extends` = () => List(PerformingGroup.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PerformingGroup.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.PerformingGroup.Properties {}
}
