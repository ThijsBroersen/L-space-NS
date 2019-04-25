package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object jobLocation
    extends PropertyDef(
      iri = "http://schema.org/jobLocation",
      iris = Set("http://schema.org/jobLocation"),
      label = "jobLocation",
      comment = """A (typically single) geographic location associated with the job position.""",
      `@extends` = () => List(),
      `@range` = () => List(Place.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
