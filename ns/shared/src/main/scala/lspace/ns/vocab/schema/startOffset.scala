package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object startOffset
    extends PropertyDef(
      iri = "http://schema.org/startOffset",
      iris = Set("http://schema.org/startOffset"),
      label = "startOffset",
      comment = """The start time of the clip expressed as the number of seconds from the beginning of the work.""",
      `@extends` = () => List(),
      `@range` = () => List(`@number`, Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
