package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object founders
    extends PropertyDef(
      iri = "http://schema.org/founders",
      iris = Set("http://schema.org/founders"),
      label = "founders",
      comment = """A person who founded this organization.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
