package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowToTool extends OntologyDef(
        iri = "http://schema.org/HowToTool",
        iris = Set("http://schema.org/HowToTool"),
        label = "HowToTool",
        comment = """A tool used (but not consumed) when performing instructions for how to achieve a result.""",
        `@extends` = () => List(HowToItem.ontology)
       ){
}