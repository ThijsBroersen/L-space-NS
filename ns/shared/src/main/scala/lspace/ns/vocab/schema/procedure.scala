package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object procedure
    extends PropertyDef(
      iri = "http://schema.org/procedure",
      iris = Set("http://schema.org/procedure"),
      label = "procedure",
      comment = """A description of the procedure involved in setting up, using, and/or installing the device.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
