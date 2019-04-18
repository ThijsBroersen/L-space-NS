package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MoneyTransfer
    extends OntologyDef(
      iri = "http://schema.org/MoneyTransfer",
      iris = Set("http://schema.org/MoneyTransfer"),
      label = "MoneyTransfer",
      comment =
        """The act of transferring money from one place to another place. This may occur electronically or physically.""",
      `@extends` = () => List(TransferAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.TransferAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.TransferAction.Properties {}
}
