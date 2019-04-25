package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object ownedThrough
    extends PropertyDef(
      iri = "http://schema.org/ownedThrough",
      iris = Set("http://schema.org/ownedThrough"),
      label = "ownedThrough",
      comment = """The date and time of giving up ownership on the product.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
