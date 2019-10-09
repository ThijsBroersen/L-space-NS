package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object skills extends PropertyDef(
        iri = "http://schema.org/skills",
        iris = Set("http://schema.org/skills"),
        label = "skills",
        comment = """Skills required to fulfill this role or in this Occupation.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}