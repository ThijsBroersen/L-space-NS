package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object executableLibraryName
    extends PropertyDef(
      iri = "http://schema.org/executableLibraryName",
      iris = Set("http://schema.org/executableLibraryName"),
      label = "executableLibraryName",
      comment = """Library file name e.g., mscorlib.dll, system.web.dll.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
