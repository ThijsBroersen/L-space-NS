package lspace.ns.vocab.lspace

import lspace.NS
import lspace.ns.vocab.schema
import lspace.structure.PropertyDef

object address
    extends PropertyDef(
      NS.vocab.Lspace + "address",
      label = "address",
      comment = "Physical address of the item.",
      `@range` = () => PostalAddress.ontology :: Nil,
      `@extends` = () => schema.address.property :: Nil
    )
