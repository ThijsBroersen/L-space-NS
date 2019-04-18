package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicPlaylist extends OntologyDef(
        iri = "http://schema.org/MusicPlaylist",
        iris = Set("http://schema.org/MusicPlaylist"),
        label = "MusicPlaylist",
        comment = """A collection of music tracks in playlist form.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
}