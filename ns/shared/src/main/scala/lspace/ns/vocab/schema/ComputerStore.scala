package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComputerStore extends OntologyDef(
        iri = "http://schema.org/ComputerStore",
        iris = Set("http://schema.org/ComputerStore"),
        label = "ComputerStore",
        comment = """A computer store.""",
        `@extends` = () => List(Store.ontology)
       ){
}