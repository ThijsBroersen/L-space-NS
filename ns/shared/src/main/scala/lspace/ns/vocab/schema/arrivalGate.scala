package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object arrivalGate
    extends PropertyDef(
      iri = "http://schema.org/arrivalGate",
      iris = Set("http://schema.org/arrivalGate"),
      label = "arrivalGate",
      comment = """Identifier of the flight's arrival gate.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
