package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PhotographAction extends OntologyDef(
        iri = "http://schema.org/PhotographAction",
        iris = Set("http://schema.org/PhotographAction"),
        label = "PhotographAction",
        comment = """The act of capturing still images of objects using a camera.""",
        `@extends` = () => List(CreateAction.ontology)
       ){
}