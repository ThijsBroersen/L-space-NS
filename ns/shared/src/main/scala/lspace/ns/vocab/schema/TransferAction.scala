package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object TransferAction
    extends OntologyDef(
      iri = "http://schema.org/TransferAction",
      iris = Set("http://schema.org/TransferAction"),
      label = "TransferAction",
      comment =
        """The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {
    lazy val fromLocation = lspace.ns.vocab.schema.fromLocation.property
    lazy val toLocation   = lspace.ns.vocab.schema.toLocation.property
  }
  override lazy val properties: List[Property] = List(fromLocation, toLocation)
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {
    lazy val fromLocation = lspace.ns.vocab.schema.fromLocation.property
    lazy val toLocation   = lspace.ns.vocab.schema.toLocation.property
  }
}
