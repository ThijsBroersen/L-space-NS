package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Bone extends OntologyDef(
        iri = "http://schema.org/Bone",
        iris = Set("http://schema.org/Bone"),
        label = "Bone",
        comment = """Rigid connective tissue that comprises up the skeletal structure of the human body.""",
        `@extends` = () => List(AnatomicalStructure.ontology)
       ){
}