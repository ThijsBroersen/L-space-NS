package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EducationEvent extends OntologyDef(
        iri = "http://schema.org/EducationEvent",
        iris = Set("http://schema.org/EducationEvent"),
        label = "EducationEvent",
        comment = """Event type: Education event.""",
        `@extends` = () => List(Event.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Event.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Event.Properties{

}
}