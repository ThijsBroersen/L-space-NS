package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowToTip extends OntologyDef(
        iri = "http://schema.org/HowToTip",
        iris = Set("http://schema.org/HowToTip"),
        label = "HowToTip",
        comment = """An explanation in the instructions for how to achieve a result. It provides supplementary information about a technique, supply, author's preference, etc. It can explain what could be done, or what should not be done, but doesn't specify what should be done (see HowToDirection).""",
        `@extends` = () => List(ListItem.ontology, CreativeWork.ontology)
       ){
}