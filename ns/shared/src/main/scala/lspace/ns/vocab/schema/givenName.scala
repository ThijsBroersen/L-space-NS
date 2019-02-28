package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.TextType
import lspace.structure.PropertyDef

object givenName
    extends PropertyDef(
      NS.vocab.schema + "givenName",
      label = "givenName",
      comment =
        "Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.",
      `@range` = () => TextType.datatype :: Nil
    )
