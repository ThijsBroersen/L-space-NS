package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.{IriType, TextType}
import lspace.structure.PropertyDef

object id
    extends PropertyDef(
      NS.vocab.schema + "identifier",
      label = "identifier",
      comment =
        "The identifier property represents any kind of identifier for any kind of Thing, " +
          "such as ISBNs, GTIN codes, UUIDs etc. " +
          "Schema.org provides dedicated properties for representing many of these, " +
          "either as textual strings or as URL (URI) links. See background notes for more details.",
      `@range` = () => TextType.datatype :: IriType.datatype :: Nil //why not LongType first?
    )
