package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object interactionService
    extends PropertyDef(
      iri = "http://schema.org/interactionService",
      iris = Set("http://schema.org/interactionService"),
      label = "interactionService",
      comment = """The WebSite or SoftwareApplication where the interactions took place.""",
      `@extends` = () => List(),
      `@range` = () => List(WebSite.ontology, SoftwareApplication.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
