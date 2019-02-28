package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.TextType
import lspace.structure.PropertyDef

object telephone
    extends PropertyDef(NS.vocab.schema + "telephone",
                        label = "telephone",
                        comment = "The telephone number.",
                        `@range` = () => TextType.datatype :: Nil)
