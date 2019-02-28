package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.{DateTimeType, LocalDateType}
import lspace.structure.PropertyDef

object dateCreated
    extends PropertyDef(
      NS.vocab.schema + "dateCreated",
      label = "dateCreated",
      comment = "The date on which the CreativeWork was created or the item was added to a DataFeed.",
      `@range` = () => DateTimeType.datatype :: LocalDateType.datatype :: Nil
    )
