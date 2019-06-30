package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Hotel extends OntologyDef(
        iri = "http://schema.org/Hotel",
        iris = Set("http://schema.org/Hotel"),
        label = "Hotel",
        comment = """A hotel is an establishment that provides lodging paid on a short-term basis (Source: Wikipedia, the free encyclopedia, see http://en.wikipedia.org/wiki/Hotel).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
        `@extends` = () => List(LodgingBusiness.ontology)
       ){
}