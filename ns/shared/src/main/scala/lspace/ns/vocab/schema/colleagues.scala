package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object colleagues
    extends PropertyDef(
      iri = "http://schema.org/colleagues",
      iris = Set("http://schema.org/colleagues"),
      label = "colleagues",
      comment = """A colleague of the person.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
