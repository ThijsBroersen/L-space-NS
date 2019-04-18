package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object sourcedFrom
    extends PropertyDef(
      iri = "http://schema.org/sourcedFrom",
      iris = Set("http://schema.org/sourcedFrom"),
      label = "sourcedFrom",
      comment = """The neurological pathway that originates the neurons.""",
      `@extends` = () => List(),
      `@range` = () => List(BrainStructure.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
