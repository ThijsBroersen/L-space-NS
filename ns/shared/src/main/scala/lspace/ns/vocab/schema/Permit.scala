package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Permit extends OntologyDef(
        iri = "http://schema.org/Permit",
        iris = Set("http://schema.org/Permit"),
        label = "Permit",
        comment = """A permit issued by an organization, e.g. a parking pass.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}