package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object occupationLocation
    extends PropertyDef(
      iri = "http://schema.org/occupationLocation",
      iris = Set("http://schema.org/occupationLocation"),
      label = "occupationLocation",
      comment =
        """The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.""",
      `@extends` = () => List(),
      `@range` = () => List(AdministrativeArea.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
