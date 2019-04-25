package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object permissionType
    extends PropertyDef(
      iri = "http://schema.org/permissionType",
      iris = Set("http://schema.org/permissionType"),
      label = "permissionType",
      comment = """The type of permission granted the person, organization, or audience.""",
      `@extends` = () => List(),
      `@range` = () => List(DigitalDocumentPermissionType.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
