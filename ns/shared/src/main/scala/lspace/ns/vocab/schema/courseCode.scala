package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object courseCode extends PropertyDef(
        iri = "http://schema.org/courseCode",
        iris = Set("http://schema.org/courseCode"),
        label = "courseCode",
        comment = """The identifier for the <a class="localLink" href="http://schema.org/Course">Course</a> used by the course <a class="localLink" href="http://schema.org/provider">provider</a> (e.g. CS101 or 6.001).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}