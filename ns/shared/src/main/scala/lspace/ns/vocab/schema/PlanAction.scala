package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PlanAction
    extends OntologyDef(
      iri = "http://schema.org/PlanAction",
      iris = Set("http://schema.org/PlanAction"),
      label = "PlanAction",
      comment = """The act of planning the execution of an event/task/action/reservation/plan to a future date.""",
      `@extends` = () => List(OrganizeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.OrganizeAction.Properties {
    lazy val scheduledTime = lspace.ns.vocab.schema.scheduledTime.property
  }
  override lazy val properties: List[LProperty] = List(scheduledTime)
  trait Properties extends lspace.ns.vocab.schema.OrganizeAction.Properties {
    lazy val scheduledTime = lspace.ns.vocab.schema.scheduledTime.property
  }
}
