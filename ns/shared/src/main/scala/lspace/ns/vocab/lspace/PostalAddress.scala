package lspace.ns.vocab.lspace

import lspace.NS
import lspace.ns.vocab.schema.Thing
import lspace.structure.{OntologyDef, Property}

object PostalAddress
    extends OntologyDef(NS.vocab.Lspace + "PostalAddress",
                        label = "PostalAddress",
                        comment = "Physical address of an item.",
                        `@extends` = () => Thing.ontology :: Nil) {

  object keys extends Thing.Properties
  override lazy val properties: List[Property] = Thing.properties
  trait Properties extends Thing.Properties
}
