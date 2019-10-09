package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MarryAction extends OntologyDef(
        iri = "http://schema.org/MarryAction",
        iris = Set("http://schema.org/MarryAction"),
        label = "MarryAction",
        comment = """The act of marrying a person.""",
        `@extends` = List(InteractAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.InteractAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.InteractAction.Properties{

}
}