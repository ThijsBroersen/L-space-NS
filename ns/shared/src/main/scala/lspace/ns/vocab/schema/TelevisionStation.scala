package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TelevisionStation extends OntologyDef(
        iri = "http://schema.org/TelevisionStation",
        iris = Set("http://schema.org/TelevisionStation"),
        label = "TelevisionStation",
        comment = """A television station.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}