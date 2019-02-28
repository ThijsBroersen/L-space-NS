package lspace.ns.vocab.schema

import lspace.NS
import lspace.ns.vocab
import lspace.structure.{OntologyDef, Property}

object Place
    extends OntologyDef(
      NS.vocab.schema + "Place",
      label = "Place",
      comment = "Entities that have a somewhat fixed, physical extension.",
      `@extends` = () => vocab.schema.Thing.ontology :: Nil
    ) {

  object keys extends vocab.schema.Thing.Properties {
    lazy val address = vocab.schema.address
    lazy val geo     = vocab.schema.geo
    lazy val review  = vocab.schema.review
  }
  override lazy val properties
    : List[Property] = keys.review.property :: keys.geo.property :: keys.address.property :: vocab.schema.Thing.properties
  trait Properties extends vocab.schema.Thing.Properties {
    lazy val address = keys.address
    lazy val geo     = keys.geo
    lazy val review  = keys.review
  }
}
