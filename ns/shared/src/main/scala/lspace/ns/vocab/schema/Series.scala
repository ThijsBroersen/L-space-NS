package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Series
    extends OntologyDef(
      iri = "http://schema.org/Series",
      iris = Set("http://schema.org/Series"),
      label = "Series",
      comment =
        """A Series in schema.org is a group of related items, typically but not necessarily of the same kind. See also <a class="localLink" href="http://schema.org/CreativeWorkSeries">CreativeWorkSeries</a>, <a class="localLink" href="http://schema.org/EventSeries">EventSeries</a>.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {}
}
