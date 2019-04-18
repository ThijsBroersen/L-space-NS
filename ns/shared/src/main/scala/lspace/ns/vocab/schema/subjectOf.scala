package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object subjectOf
    extends PropertyDef(
      iri = "http://schema.org/subjectOf",
      iris = Set("http://schema.org/subjectOf"),
      label = "subjectOf",
      comment = """A CreativeWork or Event about this Thing..""",
      `@extends` = () => List(),
      `@range` = () => List(Event.ontology, CreativeWork.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
