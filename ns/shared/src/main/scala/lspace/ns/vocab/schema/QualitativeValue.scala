package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QualitativeValue extends OntologyDef(
        iri = "http://schema.org/QualitativeValue",
        iris = Set("http://schema.org/QualitativeValue"),
        label = "QualitativeValue",
        comment = """A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}