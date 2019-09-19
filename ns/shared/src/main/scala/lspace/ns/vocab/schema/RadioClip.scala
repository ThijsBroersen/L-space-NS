package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RadioClip extends OntologyDef(
        iri = "http://schema.org/RadioClip",
        iris = Set("http://schema.org/RadioClip"),
        label = "RadioClip",
        comment = """A short radio program or a segment/part of a radio program.""",
        `@extends` = () => List(Clip.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Clip.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Clip.Properties{

}
}