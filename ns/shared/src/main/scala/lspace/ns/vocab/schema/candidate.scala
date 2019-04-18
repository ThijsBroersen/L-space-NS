package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object candidate
    extends PropertyDef(
      iri = "http://schema.org/candidate",
      iris = Set("http://schema.org/candidate"),
      label = "candidate",
      comment = """A sub property of object. The candidate subject of this action.""",
      `@extends` = () => List(`object`.property),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.`object`.Properties
}
