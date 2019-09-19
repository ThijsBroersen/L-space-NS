package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object workHours extends PropertyDef(
        iri = "http://schema.org/workHours",
        iris = Set("http://schema.org/workHours"),
        label = "workHours",
        comment = """The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}