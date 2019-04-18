package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object operatingSystem
    extends PropertyDef(
      iri = "http://schema.org/operatingSystem",
      iris = Set("http://schema.org/operatingSystem"),
      label = "operatingSystem",
      comment = """Operating systems supported (Windows 7, OSX 10.6, Android 1.6).""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
