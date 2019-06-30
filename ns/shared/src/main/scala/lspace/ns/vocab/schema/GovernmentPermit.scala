package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GovernmentPermit extends OntologyDef(
        iri = "http://schema.org/GovernmentPermit",
        iris = Set("http://schema.org/GovernmentPermit"),
        label = "GovernmentPermit",
        comment = """A permit issued by a government agency.""",
        `@extends` = () => List(Permit.ontology)
       ){
}