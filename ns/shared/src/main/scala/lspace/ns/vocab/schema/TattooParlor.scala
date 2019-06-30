package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TattooParlor extends OntologyDef(
        iri = "http://schema.org/TattooParlor",
        iris = Set("http://schema.org/TattooParlor"),
        label = "TattooParlor",
        comment = """A tattoo parlor.""",
        `@extends` = () => List(HealthAndBeautyBusiness.ontology)
       ){
}