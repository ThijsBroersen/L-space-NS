package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.DateTimeType
import lspace.structure.PropertyDef

object endDate
    extends PropertyDef(
      NS.vocab.schema + "endDate",
      label = "endDate",
      comment = "The end date and time of the item (in ISO 8601 date format).",
      `@range` = () => DateTimeType.datatype :: Nil
    )
