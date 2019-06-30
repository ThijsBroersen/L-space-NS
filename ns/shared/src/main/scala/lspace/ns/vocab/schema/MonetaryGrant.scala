package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MonetaryGrant extends OntologyDef(
        iri = "http://schema.org/MonetaryGrant",
        iris = Set("http://schema.org/MonetaryGrant"),
        label = "MonetaryGrant",
        comment = """A monetary grant.""",
        `@extends` = () => List(Grant.ontology)
       ){
}