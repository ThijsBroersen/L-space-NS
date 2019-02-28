package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.TextType
import lspace.structure.PropertyDef

object name
    extends PropertyDef(NS.vocab.schema + "name",
                        label = "name",
                        comment = "The name of the item.",
                        `@range` = () => TextType.datatype :: Nil)
