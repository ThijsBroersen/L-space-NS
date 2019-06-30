package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ApartmentComplex extends OntologyDef(
        iri = "http://schema.org/ApartmentComplex",
        iris = Set("http://schema.org/ApartmentComplex"),
        label = "ApartmentComplex",
        comment = """Residence type: Apartment complex.""",
        `@extends` = () => List(Residence.ontology)
       ){
}