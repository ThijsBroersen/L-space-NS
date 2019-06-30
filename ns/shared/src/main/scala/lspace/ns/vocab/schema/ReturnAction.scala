package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReturnAction extends OntologyDef(
        iri = "http://schema.org/ReturnAction",
        iris = Set("http://schema.org/ReturnAction"),
        label = "ReturnAction",
        comment = """The act of returning to the origin that which was previously received (concrete objects) or taken (ownership).""",
        `@extends` = () => List(TransferAction.ontology)
       ){
}