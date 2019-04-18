package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object ownedFrom
    extends PropertyDef(
      iri = "http://schema.org/ownedFrom",
      iris = Set("http://schema.org/ownedFrom"),
      label = "ownedFrom",
      comment = """The date and time of obtaining the product.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
