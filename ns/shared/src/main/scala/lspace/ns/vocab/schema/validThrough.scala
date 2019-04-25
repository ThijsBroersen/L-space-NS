package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object validThrough
    extends PropertyDef(
      iri = "http://schema.org/validThrough",
      iris = Set("http://schema.org/validThrough"),
      label = "validThrough",
      comment =
        """The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
