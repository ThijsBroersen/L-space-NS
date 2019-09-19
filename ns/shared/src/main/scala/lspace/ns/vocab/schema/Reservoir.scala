package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Reservoir extends OntologyDef(
        iri = "http://schema.org/Reservoir",
        iris = Set("http://schema.org/Reservoir"),
        label = "Reservoir",
        comment = """A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir.""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
object keys extends lspace.ns.vocab.schema.BodyOfWater.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.BodyOfWater.Properties{

}
}