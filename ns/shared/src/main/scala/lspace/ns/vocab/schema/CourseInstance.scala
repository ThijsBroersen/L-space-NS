package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CourseInstance extends OntologyDef(
        iri = "http://schema.org/CourseInstance",
        iris = Set("http://schema.org/CourseInstance"),
        label = "CourseInstance",
        comment = """An instance of a <a class="localLink" href="http://schema.org/Course">Course</a> which is distinct from other instances because it is offered at a different time or location or through different media or modes of study or to a specific section of students.""",
        `@extends` = List(Event.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Event.Properties{
lazy val courseMode = lspace.ns.vocab.schema.courseMode.property
lazy val instructor = lspace.ns.vocab.schema.instructor.property
}
override lazy val properties: List[LProperty] = List(courseMode, instructor)
trait Properties extends lspace.ns.vocab.schema.Event.Properties{
lazy val courseMode = lspace.ns.vocab.schema.courseMode.property
lazy val instructor = lspace.ns.vocab.schema.instructor.property
}
}