package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object boardingPolicy
    extends PropertyDef(
      iri = "http://schema.org/boardingPolicy",
      iris = Set("http://schema.org/boardingPolicy"),
      label = "boardingPolicy",
      comment = """The type of boarding policy used by the airline (e.g. zone-based or group-based).""",
      `@extends` = () => List(),
      `@range` = () => List(BoardingPolicyType.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
