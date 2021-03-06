package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object benefits extends PropertyDef(
        iri = "http://schema.org/benefits",
        iris = Set("http://schema.org/benefits"),
        label = "benefits",
        comment = """Description of benefits associated with the job.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}