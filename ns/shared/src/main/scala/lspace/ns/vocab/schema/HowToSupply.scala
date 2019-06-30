package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowToSupply extends OntologyDef(
        iri = "http://schema.org/HowToSupply",
        iris = Set("http://schema.org/HowToSupply"),
        label = "HowToSupply",
        comment = """A supply consumed when performing the instructions for how to achieve a result.""",
        `@extends` = () => List(HowToItem.ontology)
       ){
}