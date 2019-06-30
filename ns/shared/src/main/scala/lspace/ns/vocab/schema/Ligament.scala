package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Ligament extends OntologyDef(
        iri = "http://schema.org/Ligament",
        iris = Set("http://schema.org/Ligament"),
        label = "Ligament",
        comment = """A short band of tough, flexible, fibrous connective tissue that functions to connect multiple bones, cartilages, and structurally support joints.""",
        `@extends` = () => List(AnatomicalStructure.ontology)
       ){
}