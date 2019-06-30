package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Crematorium extends OntologyDef(
        iri = "http://schema.org/Crematorium",
        iris = Set("http://schema.org/Crematorium"),
        label = "Crematorium",
        comment = """A crematorium.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}