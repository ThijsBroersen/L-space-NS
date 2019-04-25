package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Energy
    extends OntologyDef(
      iri = "http://schema.org/Energy",
      iris = Set("http://schema.org/Energy"),
      label = "Energy",
      comment =
        """Properties that take Energy as values are of the form '&lt;Number&gt; &lt;Energy unit of measure&gt;'.""",
      `@extends` = () => List(Quantity.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Quantity.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Quantity.Properties {}
}
