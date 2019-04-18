package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TaxiService extends OntologyDef(
        iri = "http://schema.org/TaxiService",
        iris = Set("http://schema.org/TaxiService"),
        label = "TaxiService",
        comment = """A service for a vehicle for hire with a driver for local travel. Fares are usually calculated based on distance traveled.""",
        `@extends` = () => List(Service.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Service.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Service.Properties{

}
}