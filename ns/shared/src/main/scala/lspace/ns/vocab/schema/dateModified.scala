package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.{DateTimeType, LocalDateType}
import lspace.structure.PropertyDef

object dateModified
    extends PropertyDef(
      NS.vocab.schema + "dateModified",
      label = "dateModified",
      comment = "The date on which the CreativeWork was created or the item was added to a DataFeed.",
      `@range` = () => DateTimeType.datatype :: LocalDateType.datatype :: Nil
    )
