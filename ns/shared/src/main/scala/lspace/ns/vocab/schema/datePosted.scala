package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object datePosted extends PropertyDef(
        iri = "http://schema.org/datePosted",
        iris = Set("http://schema.org/datePosted"),
        label = "datePosted",
        comment = """Publication date for the job posting.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}