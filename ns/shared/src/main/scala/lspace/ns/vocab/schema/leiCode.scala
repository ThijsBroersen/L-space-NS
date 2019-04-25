package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object leiCode
    extends PropertyDef(
      iri = "http://schema.org/leiCode",
      iris = Set("http://schema.org/leiCode"),
      label = "leiCode",
      comment = """An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.""",
      `@extends` = () => List(identifier.property),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}
