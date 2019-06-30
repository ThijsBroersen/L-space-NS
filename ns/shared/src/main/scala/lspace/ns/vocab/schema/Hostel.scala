package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Hostel extends OntologyDef(
        iri = "http://schema.org/Hostel",
        iris = Set("http://schema.org/Hostel"),
        label = "Hostel",
        comment = """A hostel - cheap accommodation, often in shared dormitories.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
        `@extends` = () => List(LodgingBusiness.ontology)
       ){
}