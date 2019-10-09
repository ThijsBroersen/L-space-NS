package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Taxi extends OntologyDef(
        iri = "http://schema.org/Taxi",
        iris = Set("http://schema.org/Taxi"),
        label = "Taxi",
        comment = """A taxi.""",
        `@extends` = List(Service.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Service.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Service.Properties{

}
}