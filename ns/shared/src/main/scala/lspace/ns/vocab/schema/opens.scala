package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object opens
    extends PropertyDef(
      iri = "http://schema.org/opens",
      iris = Set("http://schema.org/opens"),
      label = "opens",
      comment = """The opening hour of the place or service on the given day(s) of the week.""",
      `@extends` = () => List(),
      `@range` = () => List(`@time`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
