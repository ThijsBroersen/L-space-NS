package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Nerve extends OntologyDef(
        iri = "http://schema.org/Nerve",
        iris = Set("http://schema.org/Nerve"),
        label = "Nerve",
        comment = """A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.""",
        `@extends` = () => List(AnatomicalStructure.ontology)
       ){
}