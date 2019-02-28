package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.{DateTimeType, LocalDateType}
import lspace.structure.PropertyDef

object children
    extends PropertyDef(
      NS.vocab.schema + "children",
      label = "children",
      comment = "A sibling of the person. Supersedes siblings.",
      `@range` = () => DateTimeType.datatype :: LocalDateType.datatype :: Nil
    )
