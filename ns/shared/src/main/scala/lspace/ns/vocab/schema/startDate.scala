package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.DateTimeType
import lspace.structure.PropertyDef

//TODO: implement https://schema.org/Organization
object startDate
    extends PropertyDef(
      NS.vocab.schema + "startDate",
      label = "startDate",
      comment = "The start date and time of the item (in ISO 8601 date format).",
      `@range` = () => DateTimeType.datatype :: Nil
    )
