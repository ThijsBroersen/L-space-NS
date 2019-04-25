package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object unitCode
    extends PropertyDef(
      iri = "http://schema.org/unitCode",
      iris = Set("http://schema.org/unitCode"),
      label = "unitCode",
      comment =
        """The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology, URL.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
