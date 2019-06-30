package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object City extends OntologyDef(
        iri = "http://schema.org/City",
        iris = Set("http://schema.org/City"),
        label = "City",
        comment = """A city or town.""",
        `@extends` = () => List(AdministrativeArea.ontology)
       ){
}