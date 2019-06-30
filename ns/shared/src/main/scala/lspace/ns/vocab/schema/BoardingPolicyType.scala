package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BoardingPolicyType extends OntologyDef(
        iri = "http://schema.org/BoardingPolicyType",
        iris = Set("http://schema.org/BoardingPolicyType"),
        label = "BoardingPolicyType",
        comment = """A type of boarding policy used by an airline.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}