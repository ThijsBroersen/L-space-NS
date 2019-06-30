package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AlignmentObject extends OntologyDef(
        iri = "http://schema.org/AlignmentObject",
        iris = Set("http://schema.org/AlignmentObject"),
        label = "AlignmentObject",
        comment = """An intangible item that describes an alignment between a learning resource and a node in an educational framework.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}