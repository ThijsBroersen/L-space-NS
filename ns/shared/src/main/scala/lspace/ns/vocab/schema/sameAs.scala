package lspace.ns.vocab.schema

import lspace.NS
import lspace.datatype.IriType
import lspace.structure.PropertyDef

object sameAs
    extends PropertyDef(
      NS.vocab.schema + "sameAs",
      label = "sameAs",
      comment = "URL of a reference Web page that unambiguously indicates the item's identity. " +
        "E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.",
      `@range` = () => IriType.datatype :: Nil
    )
