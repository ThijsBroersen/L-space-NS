package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowTo extends OntologyDef(
        iri = "http://schema.org/HowTo",
        iris = Set("http://schema.org/HowTo"),
        label = "HowTo",
        comment = """Instructions that explain how to achieve a result by performing a sequence of steps.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}