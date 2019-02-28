package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.{DateTimeType, LocalDateType}
import lspace.structure.PropertyDef

object spouse
    extends PropertyDef(
      NS.vocab.schema + "spouse",
      label = "spouse",
      comment = "The person's spouse.",
      `@range` = () => DateTimeType.datatype :: LocalDateType.datatype :: Nil
    )
