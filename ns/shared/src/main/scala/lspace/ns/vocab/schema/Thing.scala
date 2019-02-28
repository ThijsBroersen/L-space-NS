package lspace.ns.vocab.schema

import lspace.ns
import lspace.structure.{OntologyDef, Property}

object Thing
    extends OntologyDef("https://schema.org/Thing", label = "Thing", comment = "The most generic type of item.") {
  object keys {
    lazy val id          = ns.vocab.schema.id
    lazy val name        = ns.vocab.schema.name
    lazy val description = ns.vocab.schema.description
  }

  override lazy val properties
    : List[Property] = keys.id.property :: keys.name.property :: keys.description.property :: Nil
  trait Properties {
    val id          = keys.id
    val name        = keys.name.property
    val description = keys.description.property
  }
}
