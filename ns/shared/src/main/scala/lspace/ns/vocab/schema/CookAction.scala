package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CookAction
    extends OntologyDef(
      iri = "http://schema.org/CookAction",
      iris = Set("http://schema.org/CookAction"),
      label = "CookAction",
      comment = """The act of producing/preparing food.""",
      `@extends` = () => List(CreateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreateAction.Properties {
    lazy val foodEvent = lspace.ns.vocab.schema.foodEvent.property
  }
  override lazy val properties: List[LProperty] = List(foodEvent)
  trait Properties extends lspace.ns.vocab.schema.CreateAction.Properties {
    lazy val foodEvent = lspace.ns.vocab.schema.foodEvent.property
  }
}
