package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object membershipPointsEarned
    extends PropertyDef(
      iri = "http://schema.org/membershipPointsEarned",
      iris = Set("http://schema.org/membershipPointsEarned"),
      label = "membershipPointsEarned",
      comment =
        """The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology, Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
