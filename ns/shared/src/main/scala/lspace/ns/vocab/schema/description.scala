package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.TextType
import lspace.structure.PropertyDef

object description
    extends PropertyDef(NS.vocab.schema + "description",
                        label = "description",
                        comment = "A description of the item.",
                        `@range` = () => TextType.datatype :: Nil)
