package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Muscle extends OntologyDef(
        iri = "http://schema.org/Muscle",
        iris = Set("http://schema.org/Muscle"),
        label = "Muscle",
        comment = """A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.""",
        `@extends` = () => List(AnatomicalStructure.ontology)
       ){
}