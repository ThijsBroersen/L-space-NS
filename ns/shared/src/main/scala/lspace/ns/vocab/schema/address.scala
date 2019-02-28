package lspace.ns.vocab.schema

import lspace.NS
import lspace.ns.vocab
import lspace.structure.{OntologyDef, Property, PropertyDef}

object address
    extends PropertyDef(
      NS.vocab.schema + "address",
      label = "address",
      comment = "Physical address of the item.",
      `@range` = () => Nil,
    )
