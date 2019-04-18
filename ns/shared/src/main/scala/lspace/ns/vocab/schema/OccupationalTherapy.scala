package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object OccupationalTherapy
    extends OntologyDef(
      iri = "http://schema.org/OccupationalTherapy",
      iris = Set("http://schema.org/OccupationalTherapy"),
      label = "OccupationalTherapy",
      comment =
        """A treatment of people with physical, emotional, or social problems, using purposeful activity to help them overcome or learn to deal with their problems.""",
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
