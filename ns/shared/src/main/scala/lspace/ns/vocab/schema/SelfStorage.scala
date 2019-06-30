package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SelfStorage extends OntologyDef(
        iri = "http://schema.org/SelfStorage",
        iris = Set("http://schema.org/SelfStorage"),
        label = "SelfStorage",
        comment = """A self-storage facility.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}