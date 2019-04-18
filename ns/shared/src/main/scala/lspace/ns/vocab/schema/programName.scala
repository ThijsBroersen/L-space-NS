package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object programName
    extends PropertyDef(
      iri = "http://schema.org/programName",
      iris = Set("http://schema.org/programName"),
      label = "programName",
      comment = """The program providing the membership.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
