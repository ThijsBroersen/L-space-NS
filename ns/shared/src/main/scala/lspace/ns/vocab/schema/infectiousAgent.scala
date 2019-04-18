package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object infectiousAgent
    extends PropertyDef(
      iri = "http://schema.org/infectiousAgent",
      iris = Set("http://schema.org/infectiousAgent"),
      label = "infectiousAgent",
      comment = """The actual infectious agent, such as a specific bacterium.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
