package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object siblings
    extends PropertyDef(
      iri = "http://schema.org/siblings",
      iris = Set("http://schema.org/siblings"),
      label = "siblings",
      comment = """A sibling of the person.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
