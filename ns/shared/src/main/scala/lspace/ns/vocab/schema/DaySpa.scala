package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DaySpa extends OntologyDef(
        iri = "http://schema.org/DaySpa",
        iris = Set("http://schema.org/DaySpa"),
        label = "DaySpa",
        comment = """A day spa.""",
        `@extends` = () => List(HealthAndBeautyBusiness.ontology)
       ){
}