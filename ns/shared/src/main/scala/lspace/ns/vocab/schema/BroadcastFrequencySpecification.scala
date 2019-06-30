package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastFrequencySpecification extends OntologyDef(
        iri = "http://schema.org/BroadcastFrequencySpecification",
        iris = Set("http://schema.org/BroadcastFrequencySpecification"),
        label = "BroadcastFrequencySpecification",
        comment = """The frequency in MHz and the modulation used for a particular BroadcastService.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}