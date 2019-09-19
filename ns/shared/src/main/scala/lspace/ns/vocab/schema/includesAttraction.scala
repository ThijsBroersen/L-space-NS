package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object includesAttraction extends PropertyDef(
        iri = "http://schema.org/includesAttraction",
        iris = Set("http://schema.org/includesAttraction"),
        label = "includesAttraction",
        comment = """Attraction located at destination.""",
        `@extends` = () => List(),
        `@range` = () => List(TouristAttraction.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}