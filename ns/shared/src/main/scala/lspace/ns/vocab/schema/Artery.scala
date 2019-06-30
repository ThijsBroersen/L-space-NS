package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Artery extends OntologyDef(
        iri = "http://schema.org/Artery",
        iris = Set("http://schema.org/Artery"),
        label = "Artery",
        comment = """A type of blood vessel that specifically carries blood away from the heart.""",
        `@extends` = () => List(Vessel.ontology)
       ){
}