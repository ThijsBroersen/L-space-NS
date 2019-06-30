package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReactAction extends OntologyDef(
        iri = "http://schema.org/ReactAction",
        iris = Set("http://schema.org/ReactAction"),
        label = "ReactAction",
        comment = """The act of responding instinctively and emotionally to an object, expressing a sentiment.""",
        `@extends` = () => List(AssessAction.ontology)
       ){
}