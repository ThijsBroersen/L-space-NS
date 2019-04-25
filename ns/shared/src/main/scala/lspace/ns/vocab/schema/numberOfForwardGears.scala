package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfForwardGears
    extends PropertyDef(
      iri = "http://schema.org/numberOfForwardGears",
      iris = Set("http://schema.org/numberOfForwardGears"),
      label = "numberOfForwardGears",
      comment = """The total number of forward gears available for the transmission system of the vehicle.<br/><br/>

Typical unit code(s): C62""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology, Number.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
