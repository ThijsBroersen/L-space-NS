package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GeoCoordinates extends OntologyDef(
        iri = "http://schema.org/GeoCoordinates",
        iris = Set("http://schema.org/GeoCoordinates"),
        label = "GeoCoordinates",
        comment = """The geographic coordinates of a place or event.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{

}
}