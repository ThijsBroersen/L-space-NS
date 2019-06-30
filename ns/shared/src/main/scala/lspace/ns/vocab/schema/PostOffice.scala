package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PostOffice extends OntologyDef(
        iri = "http://schema.org/PostOffice",
        iris = Set("http://schema.org/PostOffice"),
        label = "PostOffice",
        comment = """A post office.""",
        `@extends` = () => List(GovernmentOffice.ontology)
       ){
}