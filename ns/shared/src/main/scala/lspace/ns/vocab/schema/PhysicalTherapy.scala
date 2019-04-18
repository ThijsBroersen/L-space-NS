package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PhysicalTherapy
    extends OntologyDef(
      iri = "http://schema.org/PhysicalTherapy",
      iris = Set("http://schema.org/PhysicalTherapy"),
      label = "PhysicalTherapy",
      comment = """A process of progressive physical care and rehabilitation aimed at improving a health condition.""",
      `@extends` = () => List(MedicalTherapy.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalTherapy.Properties {

    override lazy val indication = lspace.ns.vocab.schema.indication.property
  }
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.MedicalTherapy.Properties {

    override lazy val indication = lspace.ns.vocab.schema.indication.property
  }
}
