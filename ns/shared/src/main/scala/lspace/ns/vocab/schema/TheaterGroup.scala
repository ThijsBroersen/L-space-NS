package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TheaterGroup
    extends OntologyDef(
      iri = "http://schema.org/TheaterGroup",
      iris = Set("http://schema.org/TheaterGroup"),
      label = "TheaterGroup",
      comment = """A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre.""",
      `@extends` = () => List(PerformingGroup.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PerformingGroup.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.PerformingGroup.Properties {}
}
