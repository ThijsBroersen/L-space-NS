package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object expectedArrivalUntil extends PropertyDef(
        iri = "http://schema.org/expectedArrivalUntil",
        iris = Set("http://schema.org/expectedArrivalUntil"),
        label = "expectedArrivalUntil",
        comment = """The latest date the package may arrive.""",
        `@extends` = List(),
        `@range` = List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}