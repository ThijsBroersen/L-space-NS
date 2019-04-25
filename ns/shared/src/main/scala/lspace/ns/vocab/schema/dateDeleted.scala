package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object dateDeleted
    extends PropertyDef(
      iri = "http://schema.org/dateDeleted",
      iris = Set("http://schema.org/dateDeleted"),
      label = "dateDeleted",
      comment = """The datetime the item was removed from the DataFeed.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
