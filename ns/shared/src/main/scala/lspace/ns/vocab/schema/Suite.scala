package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Suite
    extends OntologyDef(
      iri = "http://schema.org/Suite",
      iris = Set("http://schema.org/Suite"),
      label = "Suite",
      comment =
        """A suite in a hotel or other public accommodation, denotes a class of luxury accommodations, the key feature of which is multiple rooms (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Suite_(hotel)">http://en.wikipedia.org/wiki/Suite_(hotel)</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
      `@extends` = () => List(Accommodation.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Accommodation.Properties {

    override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property
  }
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Accommodation.Properties {

    override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property
  }
}
