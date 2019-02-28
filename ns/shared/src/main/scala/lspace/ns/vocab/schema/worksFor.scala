package lspace.ns.vocab.schema

import lspace.{ns, NS}
import lspace.datatype.{DateTimeType, TextType}
import lspace.structure.{OntologyDef, Property, PropertyDef}

object worksFor
    extends PropertyDef(NS.vocab.schema + "worksFor",
                        label = "worksFor",
                        comment = "Organizations that the person works for.",
                        `@range` = () => Organization.ontology :: Nil)
