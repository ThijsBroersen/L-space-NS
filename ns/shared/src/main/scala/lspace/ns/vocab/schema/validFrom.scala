package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object validFrom
    extends PropertyDef(
      iri = "http://schema.org/validFrom",
      iris = Set("http://schema.org/validFrom"),
      label = "validFrom",
      comment = """The date when the item becomes valid.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
