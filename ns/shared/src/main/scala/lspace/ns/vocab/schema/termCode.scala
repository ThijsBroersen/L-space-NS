package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object termCode
    extends PropertyDef(
      iri = "http://schema.org/termCode",
      iris = Set("http://schema.org/termCode"),
      label = "termCode",
      comment =
        """A code that identifies this <a class="localLink" href="http://schema.org/DefinedTerm">DefinedTerm</a> within a <a class="localLink" href="http://schema.org/DefinedTermSet">DefinedTermSet</a>""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
