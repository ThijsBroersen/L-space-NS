package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object experienceRequirements extends PropertyDef(
        iri = "http://schema.org/experienceRequirements",
        iris = Set("http://schema.org/experienceRequirements"),
        label = "experienceRequirements",
        comment = """Description of skills and experience needed for the position or Occupation.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}