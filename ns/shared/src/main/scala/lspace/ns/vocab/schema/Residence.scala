package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Residence
    extends OntologyDef(
      iri = "http://schema.org/Residence",
      iris = Set("http://schema.org/Residence"),
      label = "Residence",
      comment = """The place where a person lives.""",
      `@extends` = () => List(Place.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Place.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Place.Properties {}
}
