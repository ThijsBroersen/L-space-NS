package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recognizedBy
    extends PropertyDef(
      iri = "http://schema.org/recognizedBy",
      iris = Set("http://schema.org/recognizedBy"),
      label = "recognizedBy",
      comment =
        """An organization that acknowledges the validity, value or utility of a credential. Note: recognition may include a process of quality assurance or accreditation.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
