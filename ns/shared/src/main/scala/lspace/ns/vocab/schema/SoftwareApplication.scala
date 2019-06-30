package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SoftwareApplication extends OntologyDef(
        iri = "http://schema.org/SoftwareApplication",
        iris = Set("http://schema.org/SoftwareApplication"),
        label = "SoftwareApplication",
        comment = """A software application.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}