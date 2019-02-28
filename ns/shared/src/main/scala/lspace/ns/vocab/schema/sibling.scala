package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.{DateTimeType, LocalDateType}
import lspace.structure.PropertyDef

object sibling
    extends PropertyDef(
      NS.vocab.schema + "sibling",
      label = "sibling",
      comment = "A sibling of the person. Supersedes siblings.",
      `@range` = () => DateTimeType.datatype :: LocalDateType.datatype :: Nil
    )
