package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MoneyTransfer extends OntologyDef(
        iri = "http://schema.org/MoneyTransfer",
        iris = Set("http://schema.org/MoneyTransfer"),
        label = "MoneyTransfer",
        comment = """The act of transferring money from one place to another place. This may occur electronically or physically.""",
        `@extends` = () => List(TransferAction.ontology)
       ){
}