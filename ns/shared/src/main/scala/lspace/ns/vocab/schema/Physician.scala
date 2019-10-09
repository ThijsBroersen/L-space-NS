package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Physician extends OntologyDef(
        iri = "http://schema.org/Physician",
        iris = Set("http://schema.org/Physician"),
        label = "Physician",
        comment = """A doctor's office.""",
        `@extends` = List(MedicalOrganization.ontology, MedicalBusiness.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalOrganization.Properties with lspace.ns.vocab.schema.MedicalBusiness.Properties{
lazy val availableService = lspace.ns.vocab.schema.availableService.property
lazy val hospitalAffiliation = lspace.ns.vocab.schema.hospitalAffiliation.property
override lazy val address = lspace.ns.vocab.schema.address.property
override lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
override lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
override lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
override lazy val properties: List[LProperty] = List(availableService, hospitalAffiliation)
trait Properties extends lspace.ns.vocab.schema.MedicalOrganization.Properties with lspace.ns.vocab.schema.MedicalBusiness.Properties{
lazy val availableService = lspace.ns.vocab.schema.availableService.property
lazy val hospitalAffiliation = lspace.ns.vocab.schema.hospitalAffiliation.property
override lazy val address = lspace.ns.vocab.schema.address.property
override lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
override lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
override lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
}