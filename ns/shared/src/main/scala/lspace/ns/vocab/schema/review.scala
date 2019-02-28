package lspace.ns.vocab.schema

import lspace.NS
import lspace.structure.PropertyDef

object review
    extends PropertyDef(NS.vocab.schema + "review",
                        label = "review",
                        comment = "A review of the item.",
                        `@range` = () => Review.ontology :: Nil)
