package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recordedIn extends PropertyDef(
        iri = "http://schema.org/recordedIn",
        iris = Set("http://schema.org/recordedIn"),
        label = "recordedIn",
        comment = """The CreativeWork that captured all or part of this Event.""",
        `@extends` = List(),
        `@range` = List(CreativeWork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}