package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SeaBodyOfWater extends OntologyDef(
        iri = "http://schema.org/SeaBodyOfWater",
        iris = Set("http://schema.org/SeaBodyOfWater"),
        label = "SeaBodyOfWater",
        comment = """A sea (for example, the Caspian sea).""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
object keys extends lspace.ns.vocab.schema.BodyOfWater.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.BodyOfWater.Properties{

}
}