package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object permitAudience
    extends PropertyDef(
      iri = "http://schema.org/permitAudience",
      iris = Set("http://schema.org/permitAudience"),
      label = "permitAudience",
      comment = """The target audience for this permit.""",
      `@extends` = () => List(),
      `@range` = () => List(Audience.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
