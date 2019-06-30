package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReadAction extends OntologyDef(
        iri = "http://schema.org/ReadAction",
        iris = Set("http://schema.org/ReadAction"),
        label = "ReadAction",
        comment = """The act of consuming written content.""",
        `@extends` = () => List(ConsumeAction.ontology)
       ){
}