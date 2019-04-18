package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object expectedArrivalFrom
    extends PropertyDef(
      iri = "http://schema.org/expectedArrivalFrom",
      iris = Set("http://schema.org/expectedArrivalFrom"),
      label = "expectedArrivalFrom",
      comment = """The earliest date the package may arrive.""",
      `@extends` = () => List(),
      `@range` = () => List(`@datetime`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
