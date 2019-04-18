package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object busName
    extends PropertyDef(
      iri = "http://schema.org/busName",
      iris = Set("http://schema.org/busName"),
      label = "busName",
      comment = """The name of the bus (e.g. Bolt Express).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
