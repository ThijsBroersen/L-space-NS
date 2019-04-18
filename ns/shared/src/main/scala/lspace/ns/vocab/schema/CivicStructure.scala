package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object CivicStructure
    extends OntologyDef(
      iri = "http://schema.org/CivicStructure",
      iris = Set("http://schema.org/CivicStructure"),
      label = "CivicStructure",
      comment = """A public structure, such as a town hall or concert hall.""",
      `@extends` = () => List(Place.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Place.Properties {
    lazy val openingHours = lspace.ns.vocab.schema.openingHours.property
  }
  override lazy val properties: List[Property] = List(openingHours)
  trait Properties extends lspace.ns.vocab.schema.Place.Properties {
    lazy val openingHours = lspace.ns.vocab.schema.openingHours.property
  }
}
