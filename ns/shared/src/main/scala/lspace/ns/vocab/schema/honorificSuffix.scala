package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.TextType
import lspace.structure.PropertyDef

object honorificSuffix
    extends PropertyDef(
      NS.vocab.schema + "honorificSuffix",
      label = "honorificSuffix",
      comment = "An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.",
      `@range` = () => TextType.datatype :: Nil
    )
