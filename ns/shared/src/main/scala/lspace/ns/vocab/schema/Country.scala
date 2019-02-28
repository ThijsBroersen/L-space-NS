package lspace.ns.vocab.schema

import lspace.NS
import lspace.ns.vocab
import lspace.structure.{OntologyDef, Property}

object Country
    extends OntologyDef(
      NS.vocab.schema + "Country",
      label = "Country",
      comment = "A country.",
      `@extends` = () => Review.ontology :: Nil
    ) {
  object keys extends vocab.schema.Review.Properties
  override lazy val properties: List[Property] = vocab.schema.Review.properties
  trait Properties extends vocab.schema.Review.Properties
}
