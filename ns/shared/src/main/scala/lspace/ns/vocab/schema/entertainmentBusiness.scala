package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object entertainmentBusiness
    extends PropertyDef(
      iri = "http://schema.org/entertainmentBusiness",
      iris = Set("http://schema.org/entertainmentBusiness"),
      label = "entertainmentBusiness",
      comment = """A sub property of location. The entertainment business where the action occurred.""",
      `@extends` = () => List(location.property),
      `@range` = () => List(EntertainmentBusiness.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.location.Properties
}
