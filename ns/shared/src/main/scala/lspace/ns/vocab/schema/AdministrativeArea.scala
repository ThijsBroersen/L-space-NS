package lspace.ns.vocab.schema

import lspace.NS
import lspace.ns.vocab
import lspace.structure.{OntologyDef, Property}

object AdministrativeArea
    extends OntologyDef(
      NS.vocab.schema + "AdministrativeArea",
      label = "AdministrativeArea",
      comment = "A geographical region, typically under the jurisdiction of a particular government.",
      `@extends` = () => Place.ontology :: Nil
    ) {

  object keys extends vocab.schema.Place.Properties
  override lazy val properties: List[Property] = vocab.schema.Place.properties
  trait Properties extends vocab.schema.Place.Properties
}
