package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object action
    extends PropertyDef(
      iri = "http://schema.org/action",
      iris = Set("http://schema.org/action"),
      label = "action",
      comment =
        """Obsolete term for <a class="localLink" href="http://schema.org/muscleAction">muscleAction</a>. Not to be confused with <a class="localLink" href="http://schema.org/potentialAction">potentialAction</a>.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
