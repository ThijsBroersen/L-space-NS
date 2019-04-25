package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bloodSupply
    extends PropertyDef(
      iri = "http://schema.org/bloodSupply",
      iris = Set("http://schema.org/bloodSupply"),
      label = "bloodSupply",
      comment = """The blood vessel that carries blood from the heart to the muscle.""",
      `@extends` = () => List(),
      `@range` = () => List(Vessel.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
