package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DeleteAction extends OntologyDef(
        iri = "http://schema.org/DeleteAction",
        iris = Set("http://schema.org/DeleteAction"),
        label = "DeleteAction",
        comment = """The act of editing a recipient by removing one of its objects.""",
        `@extends` = () => List(UpdateAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.UpdateAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.UpdateAction.Properties{

}
}