package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object recordedIn extends PropertyDef(
        iri = "https://schema.org/recordedIn",
        iris = Set("https://schema.org/recordedIn"),
        label = "recordedIn",
        comment = """The CreativeWork that captured all or part of this Event.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}