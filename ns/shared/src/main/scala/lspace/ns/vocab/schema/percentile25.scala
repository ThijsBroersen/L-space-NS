package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object percentile25 extends PropertyDef(
        iri = "http://schema.org/percentile25",
        iris = Set("http://schema.org/percentile25"),
        label = "percentile25",
        comment = """The 25th percentile value.""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}