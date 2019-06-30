package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TransferAction extends OntologyDef(
        iri = "http://schema.org/TransferAction",
        iris = Set("http://schema.org/TransferAction"),
        label = "TransferAction",
        comment = """The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.""",
        `@extends` = () => List(Action.ontology)
       ){
}