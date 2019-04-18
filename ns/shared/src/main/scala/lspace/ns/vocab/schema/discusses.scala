package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object discusses
    extends PropertyDef(
      iri = "http://schema.org/discusses",
      iris = Set("http://schema.org/discusses"),
      label = "discusses",
      comment = """Specifies the CreativeWork associated with the UserComment.""",
      `@extends` = () => List(),
      `@range` = () => List(CreativeWork.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
