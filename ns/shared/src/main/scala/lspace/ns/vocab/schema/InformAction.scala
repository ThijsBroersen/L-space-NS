package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InformAction extends OntologyDef(
        iri = "http://schema.org/InformAction",
        iris = Set("http://schema.org/InformAction"),
        label = "InformAction",
        comment = """The act of notifying someone of information pertinent to them, with no expectation of a response.""",
        `@extends` = () => List(CommunicateAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CommunicateAction.Properties{
lazy val event = lspace.ns.vocab.schema.event.property
}
override lazy val properties: List[LProperty] = List(event)
trait Properties extends lspace.ns.vocab.schema.CommunicateAction.Properties{
lazy val event = lspace.ns.vocab.schema.event.property
}
}