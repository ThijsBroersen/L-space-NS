package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GovernmentService extends OntologyDef(
        iri = "http://schema.org/GovernmentService",
        iris = Set("http://schema.org/GovernmentService"),
        label = "GovernmentService",
        comment = """A service provided by a government organization, e.g. food stamps, veterans benefits, etc.""",
        `@extends` = () => List(Service.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Service.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Service.Properties{

}
}