package lspace.ns.vocab.schema

import lspace.NS
import lspace.structure.PropertyDef

object geo
    extends PropertyDef(NS.vocab.schema + "geo",
                        label = "geo",
                        comment = "The geo coordinates of the place.",
                        `@range` = () => Nil)
