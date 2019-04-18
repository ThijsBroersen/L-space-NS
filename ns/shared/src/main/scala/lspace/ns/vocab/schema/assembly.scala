package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object assembly
    extends PropertyDef(
      iri = "http://schema.org/assembly",
      iris = Set("http://schema.org/assembly"),
      label = "assembly",
      comment = """Library file name e.g., mscorlib.dll, system.web.dll.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
