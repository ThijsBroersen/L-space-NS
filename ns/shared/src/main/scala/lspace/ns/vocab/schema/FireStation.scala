package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FireStation extends OntologyDef(
        iri = "http://schema.org/FireStation",
        iris = Set("http://schema.org/FireStation"),
        label = "FireStation",
        comment = """A fire station. With firemen.""",
        `@extends` = List(CivicStructure.ontology, EmergencyService.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties with lspace.ns.vocab.schema.EmergencyService.Properties{

override lazy val address = lspace.ns.vocab.schema.address.property
override lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
override lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
override lazy val openingHours = lspace.ns.vocab.schema.openingHours.property
override lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties with lspace.ns.vocab.schema.EmergencyService.Properties{

override lazy val address = lspace.ns.vocab.schema.address.property
override lazy val aggregateRating = lspace.ns.vocab.schema.aggregateRating.property
override lazy val faxNumber = lspace.ns.vocab.schema.faxNumber.property
override lazy val openingHours = lspace.ns.vocab.schema.openingHours.property
override lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
}