package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object result
    extends PropertyDef(
      iri = "http://schema.org/result",
      iris = Set("http://schema.org/result"),
      label = "result",
      comment = """The result produced in the action. e.g. John wrote <em>a book</em>.""",
      `@extends` = () => List(),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
