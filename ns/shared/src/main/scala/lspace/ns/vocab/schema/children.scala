package lspace.ns.vocab.schema

import lspace.{ns, NS}
import lspace.datatype.{DateTimeType, LocalDateType}
import lspace.ns.vocab.lspace.PostalAddress
import lspace.structure.{OntologyDef, Property, PropertyDef}

object children
    extends PropertyDef(
      NS.vocab.schema + "children",
      label = "children",
      comment = "A sibling of the person. Supersedes siblings.",
      `@range` = () => Person.ontology :: Nil
    )
