package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object studyLocation
    extends PropertyDef(
      iri = "http://schema.org/studyLocation",
      iris = Set("http://schema.org/studyLocation"),
      label = "studyLocation",
      comment = """The location in which the study is taking/took place.""",
      `@extends` = () => List(),
      `@range` = () => List(AdministrativeArea.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
