package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object letterer extends PropertyDef(
        iri = "http://schema.org/letterer",
        iris = Set("http://schema.org/letterer"),
        label = "letterer",
        comment = """The individual who adds lettering, including speech balloons and sound effects, to artwork.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}