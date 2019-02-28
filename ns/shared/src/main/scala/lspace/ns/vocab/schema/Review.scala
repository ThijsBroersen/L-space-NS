package lspace.ns.vocab.schema

import lspace.NS
import lspace.ns.vocab
import lspace.structure.{OntologyDef, Property}

object Review
    extends OntologyDef(
      NS.vocab.schema + "Review",
      label = "Review",
      comment = "A review of an item - for example, of a restaurant, movie, or store.",
      `@extends` = () => CreativeWork.ontology :: Nil
    ) {
  object keys extends vocab.schema.CreativeWork.Properties
  override lazy val properties: List[Property] = vocab.schema.CreativeWork.properties
  trait Properties extends vocab.schema.CreativeWork.Properties
}
