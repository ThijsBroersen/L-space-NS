package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Vein extends OntologyDef(
        iri = "http://schema.org/Vein",
        iris = Set("http://schema.org/Vein"),
        label = "Vein",
        comment = """A type of blood vessel that specifically carries blood to the heart.""",
        `@extends` = () => List(Vessel.ontology)
       ){
}