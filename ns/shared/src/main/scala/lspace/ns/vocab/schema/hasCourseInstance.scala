package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasCourseInstance extends PropertyDef(
        iri = "http://schema.org/hasCourseInstance",
        iris = Set("http://schema.org/hasCourseInstance"),
        label = "hasCourseInstance",
        comment = """An offering of the course at a specific time and place or through specific media or mode of study or to a specific section of students.""",
        `@extends` = List(),
        `@range` = List(CourseInstance.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}