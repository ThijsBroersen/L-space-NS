package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.TextType
import lspace.structure.PropertyDef

object honorificPrefix
    extends PropertyDef(
      NS.vocab.schema + "honorificPrefix",
      label = "honorificPrefix",
      comment = "An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.",
      `@range` = () => TextType.datatype :: Nil
    )
