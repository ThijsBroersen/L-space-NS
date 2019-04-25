package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DigitalDocument
    extends OntologyDef(
      iri = "http://schema.org/DigitalDocument",
      iris = Set("http://schema.org/DigitalDocument"),
      label = "DigitalDocument",
      comment = """An electronic file or document.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val hasDigitalDocumentPermission = lspace.ns.vocab.schema.hasDigitalDocumentPermission.property
  }
  override lazy val properties: List[LProperty] = List(hasDigitalDocumentPermission)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val hasDigitalDocumentPermission = lspace.ns.vocab.schema.hasDigitalDocumentPermission.property
  }
}
