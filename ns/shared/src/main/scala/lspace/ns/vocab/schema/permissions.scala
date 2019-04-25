package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object permissions
    extends PropertyDef(
      iri = "http://schema.org/permissions",
      iris = Set("http://schema.org/permissions"),
      label = "permissions",
      comment =
        """Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
