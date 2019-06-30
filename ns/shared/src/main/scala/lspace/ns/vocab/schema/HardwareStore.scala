package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HardwareStore extends OntologyDef(
        iri = "http://schema.org/HardwareStore",
        iris = Set("http://schema.org/HardwareStore"),
        label = "HardwareStore",
        comment = """A hardware store.""",
        `@extends` = () => List(Store.ontology)
       ){
}