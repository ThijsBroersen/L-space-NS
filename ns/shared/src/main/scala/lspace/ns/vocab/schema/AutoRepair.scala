package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutoRepair extends OntologyDef(
        iri = "http://schema.org/AutoRepair",
        iris = Set("http://schema.org/AutoRepair"),
        label = "AutoRepair",
        comment = """Car repair business.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AutomotiveBusiness.Properties{

override lazy val events = lspace.ns.vocab.schema.events.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.AutomotiveBusiness.Properties{

override lazy val events = lspace.ns.vocab.schema.events.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
}