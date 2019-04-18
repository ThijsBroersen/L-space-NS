package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object validFor
    extends PropertyDef(
      iri = "http://schema.org/validFor",
      iris = Set("http://schema.org/validFor"),
      label = "validFor",
      comment = """The duration of validity of a permit or similar thing.""",
      `@extends` = () => List(),
      `@range` = () => List(Duration.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
