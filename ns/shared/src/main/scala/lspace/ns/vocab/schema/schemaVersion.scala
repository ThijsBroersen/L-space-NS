package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object schemaVersion
    extends PropertyDef(
      iri = "http://schema.org/schemaVersion",
      iris = Set("http://schema.org/schemaVersion"),
      label = "schemaVersion",
      comment =
        """Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, URL.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
