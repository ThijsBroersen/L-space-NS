package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object copyrightHolder
    extends PropertyDef(
      iri = "http://schema.org/copyrightHolder",
      iris = Set("http://schema.org/copyrightHolder"),
      label = "copyrightHolder",
      comment = """The party holding the legal copyright to the CreativeWork.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology, Organization.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
