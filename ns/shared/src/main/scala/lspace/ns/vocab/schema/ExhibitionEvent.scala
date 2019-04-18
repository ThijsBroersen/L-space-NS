package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ExhibitionEvent extends OntologyDef(
        iri = "http://schema.org/ExhibitionEvent",
        iris = Set("http://schema.org/ExhibitionEvent"),
        label = "ExhibitionEvent",
        comment = """Event type: Exhibition event, e.g. at a museum, library, archive, tradeshow, ...""",
        `@extends` = () => List(Event.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Event.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Event.Properties{

}
}