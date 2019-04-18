package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ApartmentComplex
    extends OntologyDef(
      iri = "http://schema.org/ApartmentComplex",
      iris = Set("http://schema.org/ApartmentComplex"),
      label = "ApartmentComplex",
      comment = """Residence type: Apartment complex.""",
      `@extends` = () => List(Residence.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Residence.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Residence.Properties {}
}
