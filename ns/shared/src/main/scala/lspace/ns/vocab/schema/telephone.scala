package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object telephone
    extends PropertyDef(
      iri = "http://schema.org/telephone",
      iris = Set("http://schema.org/telephone"),
      label = "telephone",
      comment = """The telephone number.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
