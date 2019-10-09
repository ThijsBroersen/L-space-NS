package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object providesService extends PropertyDef(
        iri = "http://schema.org/providesService",
        iris = Set("http://schema.org/providesService"),
        label = "providesService",
        comment = """The service provided by this channel.""",
        `@extends` = List(),
        `@range` = List(Service.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}