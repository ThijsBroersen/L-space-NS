package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.TextType
import lspace.structure.PropertyDef

object familyName
    extends PropertyDef(
      NS.vocab.schema + "familyName",
      label = "familyName",
      comment =
        "Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.",
      `@range` = () => TextType.datatype :: Nil
    )
