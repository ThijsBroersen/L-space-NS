package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FilmAction extends OntologyDef(
        iri = "http://schema.org/FilmAction",
        iris = Set("http://schema.org/FilmAction"),
        label = "FilmAction",
        comment = """The act of capturing sound and moving images on film, video, or digitally.""",
        `@extends` = () => List(CreateAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreateAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CreateAction.Properties{

}
}