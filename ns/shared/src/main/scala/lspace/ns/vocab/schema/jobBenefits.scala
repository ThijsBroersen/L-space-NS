package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object jobBenefits
    extends PropertyDef(
      iri = "http://schema.org/jobBenefits",
      iris = Set("http://schema.org/jobBenefits"),
      label = "jobBenefits",
      comment = """Description of benefits associated with the job.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
