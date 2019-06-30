package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LymphaticVessel extends OntologyDef(
        iri = "http://schema.org/LymphaticVessel",
        iris = Set("http://schema.org/LymphaticVessel"),
        label = "LymphaticVessel",
        comment = """A type of blood vessel that specifically carries lymph fluid unidirectionally toward the heart.""",
        `@extends` = () => List(Vessel.ontology)
       ){
}