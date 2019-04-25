package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PaintAction
    extends OntologyDef(
      iri = "http://schema.org/PaintAction",
      iris = Set("http://schema.org/PaintAction"),
      label = "PaintAction",
      comment = """The act of producing a painting, typically with paint and canvas as instruments.""",
      `@extends` = () => List(CreateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreateAction.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.CreateAction.Properties {}
}
