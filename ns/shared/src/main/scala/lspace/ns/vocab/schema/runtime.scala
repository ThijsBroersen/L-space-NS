package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object runtime
    extends PropertyDef(
      iri = "http://schema.org/runtime",
      iris = Set("http://schema.org/runtime"),
      label = "runtime",
      comment =
        """Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0).""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
