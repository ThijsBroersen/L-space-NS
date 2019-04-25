package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalClinic
    extends OntologyDef(
      iri = "http://schema.org/MedicalClinic",
      iris = Set("http://schema.org/MedicalClinic"),
      label = "MedicalClinic",
      comment =
        """A facility, often associated with a hospital or medical school, that is devoted to the specific diagnosis and/or healthcare. Previously limited to outpatients but with evolution it may be open to inpatients as well.""",
      `@extends` = () => List(MedicalOrganization.ontology, MedicalBusiness.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.MedicalOrganization.Properties
      with lspace.ns.vocab.schema.MedicalBusiness.Properties {
    lazy val availableService   = lspace.ns.vocab.schema.availableService.property
    override lazy val events    = lspace.ns.vocab.schema.events.property
    override lazy val slogan    = lspace.ns.vocab.schema.slogan.property
    override lazy val event     = lspace.ns.vocab.schema.event.property
    override lazy val logo      = lspace.ns.vocab.schema.logo.property
    override lazy val telephone = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4    = lspace.ns.vocab.schema.isicV4.property
    override lazy val review    = lspace.ns.vocab.schema.review.property
  }
  override lazy val properties: List[LProperty] = List(availableService)
  trait Properties
      extends lspace.ns.vocab.schema.MedicalOrganization.Properties
      with lspace.ns.vocab.schema.MedicalBusiness.Properties {
    lazy val availableService   = lspace.ns.vocab.schema.availableService.property
    override lazy val events    = lspace.ns.vocab.schema.events.property
    override lazy val slogan    = lspace.ns.vocab.schema.slogan.property
    override lazy val event     = lspace.ns.vocab.schema.event.property
    override lazy val logo      = lspace.ns.vocab.schema.logo.property
    override lazy val telephone = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4    = lspace.ns.vocab.schema.isicV4.property
    override lazy val review    = lspace.ns.vocab.schema.review.property
  }
}
