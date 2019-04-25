package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object alumni
    extends PropertyDef(
      iri = "http://schema.org/alumni",
      iris = Set("http://schema.org/alumni"),
      label = "alumni",
      comment = """Alumni of an organization.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
