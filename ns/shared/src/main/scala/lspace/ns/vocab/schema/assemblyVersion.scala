package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object assemblyVersion
    extends PropertyDef(
      iri = "http://schema.org/assemblyVersion",
      iris = Set("http://schema.org/assemblyVersion"),
      label = "assemblyVersion",
      comment = """Associated product/technology version. e.g., .NET Framework 4.5.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
