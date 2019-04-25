package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object appearance
    extends PropertyDef(
      iri = "http://schema.org/appearance",
      iris = Set("http://schema.org/appearance"),
      label = "appearance",
      comment =
        """Indicates an occurence of a <a class="localLink" href="http://schema.org/Claim">Claim</a> in some <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>.""",
      `@extends` = () => List(workExample.property),
      `@range` = () => List(CreativeWork.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.workExample.Properties
}
