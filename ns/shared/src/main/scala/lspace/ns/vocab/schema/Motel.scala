package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Motel extends OntologyDef(
        iri = "http://schema.org/Motel",
        iris = Set("http://schema.org/Motel"),
        label = "Motel",
        comment = """A motel.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
        `@extends` = () => List(LodgingBusiness.ontology)
       ){
}