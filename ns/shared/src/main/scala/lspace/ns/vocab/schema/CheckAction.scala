package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CheckAction extends OntologyDef(
        iri = "http://schema.org/CheckAction",
        iris = Set("http://schema.org/CheckAction"),
        label = "CheckAction",
        comment = """An agent inspects, determines, investigates, inquires, or examines an object's accuracy, quality, condition, or state.""",
        `@extends` = List(FindAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.FindAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.FindAction.Properties{

}
}